/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerAdmin;

import Controller.*;
import java.io.File;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Tran Manh Truong
 */
public class UploadsExcel {
    public static String filePath="";
    public static ServletFileUpload getUploads(HttpServletRequest request)
    {
      int maxFileSize = 1024 * 1024*10;
      int maxMemSize = 1024 * 1024*50;
      ServletContext context = request.getServletContext();
      String curPath = context.getRealPath("/");
      filePath = curPath + "Excel\\";//thư mục chứa file upload từ trình duyệt lên
      DiskFileItemFactory factory = new DiskFileItemFactory();
      factory.setSizeThreshold(maxMemSize);
      factory.setRepository(new File(curPath));
      ServletFileUpload upload = new ServletFileUpload(factory);
      upload.setSizeMax( maxFileSize );
      return upload;
    }
}
