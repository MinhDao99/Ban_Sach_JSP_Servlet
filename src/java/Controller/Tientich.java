/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.fileupload.FileItem;

/**
 *
 * @author Tran Manh Truong
 */
public class Tientich {

    public static String getInput(List fileItems, String inputName, String filePath) throws Exception {
        Iterator i = fileItems.iterator();
        while (i.hasNext()) {
           
            FileItem fi = (FileItem) i.next();
            String fieldName = fi.getFieldName();
            //lặp các input submit từ form
            if (fieldName.equalsIgnoreCase(inputName)) {
                if (fi.isFormField()) //nếu là input thường
                {
                    return fi.getString("UTF-8");
                } else //nếu là input dạng file
                {
                    String fileName = fi.getName();
                    //boolean isInMemory = fi.isInMemory();
                    //long sizeInBytes = fi.getSize();
                    if (fileName.equals("") == false) {
                        File file = new File(filePath + fileName);
                        fi.write(file);
                    }
                    return fileName;
                }
            }
        }
        return "";
    }

    public static boolean isInteger(String s) {
        if (s.equals("")) {
            return false;
        }
        try {
            int n = Integer.parseInt(s);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    //kiểm tra 1 chuỗi có ở dạng số hay không
    public static boolean isNummeric(String s) {
        if (s.equals("")) {
            return false;
        }
        try {
            double n = Double.parseDouble(s);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
