<%-- 
    Document   : Admin_main
    Created on : Sep 7, 2020, 10:04:53 PM
    Author     : Minh Dao
--%>

<%@page import="CSDLAdmin.tbProductAdmin"%>
<%@page import="java.util.Vector"%>
<%@page import="model.Product"%>
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
        if (gia == "")
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
        if (mota == "") {
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
            <div class="box-header">
                <div class="box-tools">
                    <div class="input-group">
                        <input type="text" name="table_search" class="form-control input-sm pull-right" style="width: 150px;" placeholder="Search"/>
                        <div class="input-group-btn">
                            <button class="btn btn-sm btn-default"><i class="fa fa-search"></i></button>
                        </div>
                    </div>
                </div>
            </div><!-- /.box-header -->
            <div class="box-body table-responsive no-padding">
                </table>
                <form id="FDK" name="FDK"action="XuLythemSach" method="post" enctype="multipart/form-data">
                    <table border="0" align="center" >
                        <tr>
                            <td>
                                Tên sách
                            </td>
                            <td>
                                <input type="text" name="Ten" id="Ten"/>
                                <br>
                                <span id="loi_tensach" class="baoloi" style="color: red"></span>

                                <br /><br />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                Giá sách
                            </td>
                            <td>
                                <input type="text" name="Gia" id="Gia"/>
                                <br>
                                <span id="loi_gia" class="baoloi" style="color: red"></span>
                                <br /><br />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                Hình Ảnh
                            </td>
                            <td>
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
                                <textarea type="text" name="MoTa" id="MoTa" style="width: 700px;height: 300px;"></textarea>
                                <br>
                                <span id="loi_mota" class="baoloi" style="color: red"></span>
                                <br /><br />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                Nhóm sách  
                            </td>

                            <td>
                                <select name="Nhom" id="nhom">
                                    <option value="0">Chọn loại sách</option>
                                    <%
                                        Vector<Product> ds = new Vector<Product>();
                                        Product pro = new Product();
                                        tbProductAdmin.GetProduct(ds);
                                        for (Product p : ds) {
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
                                Bày bán  <input  class="hienthi" type="checkbox" name="trangthai" id="trangthai" value="1"/> 
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