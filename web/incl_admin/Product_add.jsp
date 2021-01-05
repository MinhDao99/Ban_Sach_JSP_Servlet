<%-- 
    Document   : Admin_main
    Created on : Sep 7, 2020, 10:04:53 PM
    Author     : Minh Dao
--%>

<%@page import="CSDLAdmin.tbProductAdmin"%>
<%@page import="java.util.Vector"%>
<%@page import="model.clsCatagory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<script language="javascript">
    function kiemtra()
    {
        f = document.FDK;
        tensach = f.Ten.value;
        if (tensach == "")
        {
            document.getElementById("loi_tensach").innerHTML = "Chưa nhập tên sách";
            return false;

        } else
        {
            document.getElementById("loi_tensach").innerHTML = "";

        }
        gia = f.Gia.value;
        if (gia == null)
        {
            document.getElementById("loi_gia").innerHTML = "Chưa nhập giá sách";
            return false;

        } else
        {
            document.getElementById("loi_gia").innerHTML = "";
        }
        hinhanh = f.HinhAnh.value;
        if (hinhanh == null || hinhanh == "")
        {
            document.getElementById("loi_hinhanh").innerHTML = "Vui lòng chọn hình ảnh";
            return false;

        } else
        {
            document.getElementById("loi_hinhanh").innerHTML = "";
        }
        mota = f.MoTa.value;
        if (mota == null) {
            document.getElementById("loi_mota").innerHTML = "phải có mô tả sản phẩm";
            return false;

        } else
        {
            document.getElementById("loi_mota").innerHTML = "";
        }
        if (f.Nhom.selectedIndex == 0)
        {
            document.getElementById("loi_nhom").innerHTML = "Bạn chưa chọn nhóm sách";
            return false;
        } else
        {
            document.getElementById("loi_nhom").innerHTML = "";

        }

    }
</script>


<div class="row">
    <div class="col-xs-12">
        <div class="box">
            <div class="box-body table-responsive no-padding">
                </table>
                <form id="FDK" name="FDK"action="XuLythemSach" method="post" enctype="multipart/form-data">
                    <table border="0" align="center" >
                        <tr>
                            <td>
                                Tên sách
                            </td>
                            <td>
                                <br><br>
                                <input type="text" name="Ten" id="Ten" style="width:930px;height: 30px"/>
                                <br>
                                <span id="loi_tensach" class="baoloi" style="color: red"></span>

                                <br /><br/>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                Giá sách
                            </td>
                            <td>
                                <br><br>
                                <input type="text" name="Gia" id="Gia" style="width:930px;height: 30px"/>
                                <br>
                                <span id="loi_gia" class="baoloi" style="color: red"></span>
                                <br /><br />
                            </td>
                        <tr>
                            <td>
                                Hình Ảnh
                            </td>
                            <td>
                                <br><br>
                                <input type="file" name="HinhAnh" id="HinhAnh"/>
                                <br>
                                <span id="loi_hinhanh" class="baoloi" style="color: red"></span>
                                <br /><br />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                Mô tả
                            </td>
                            <td>
                                <textarea name="MoTa" id="MoTa" rows="20" cols="200"></textarea>
                                <script langague="javascript">
                                    CKEDITOR.replace('MoTa');
                                </script>            
                                <br>
                                <span id="loi_mota" class="baoloi" style="color: red"></span>
                                <br /><br />
                            </td>
                        <tr>
                            <td>
                                Nhóm sách  
                            </td>

                            <td>
                                <br><br>
                                <select name="Nhom" id="nhom" style="width: 200px;height: 30px">
                                    <option value="0">Chọn loại sách</option>
                                    <%
                                        Vector<clsCatagory> ds = new Vector<clsCatagory>();
                                        clsCatagory pro = new clsCatagory();
                                        tbProductAdmin.GetProduct(ds);
                                        for (clsCatagory p : ds) {
                                    %>
                                    <option value="<%=p.getId()%>"><%=p.getTen()%></option>
                                    <%
                                        }
                                    %>

                                </select>
                                <br>
                                <span id="loi_nhom" class="baoloi" style="color: red"></span>
                                <br /><br />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <br><br>
                                Bày bán  <input  class="hienthi" type="checkbox" name="trangthai" id="trangthai" value="1" style="height: 30px;width: 30px"/> 
                                <br /><br />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center">
                                <input  type="submit" id="Themmoi" name="Gia" value="Thêm mới" onclick="return kiemtra();" style="width:100%;height:40px;background-color:red;border-radius:10px;"/>
                            </td>
                        </tr>
                    </table>

                </form>

            </div><!-- /.box-body -->
        </div><!-- /.box -->
    </div>

</div>
