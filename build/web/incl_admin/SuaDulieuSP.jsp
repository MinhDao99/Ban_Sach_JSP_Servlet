<%-- 
    Document   : SuDulieuSP
    Created on : Sep 7, 2020, 10:04:53 PM
    Author     : Minh Dao
--%>

<%@page import="model.ListProduct"%>
<%@page import="CSDLAdmin.tbProductAdmin"%>
<%@page import="java.util.Vector"%>
<%@page import="model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

                <%
                    int id;
                    if (request.getParameter("id") == null || Controller.Tientich.isInteger(request.getParameter("id")) == false) {
                        out.println("<h3>Lỗi ID</h3>");
                    } else {
                        id = Integer.parseInt(request.getParameter("id"));
                        ListProduct sp = new ListProduct();
                        int kq = tbProductAdmin.GetOneProduct(id, sp);

                %>
                <form id="FDK" action="XuLySuaSP" method="post" enctype="multipart/form-data">
                    <table border="0" align="center" >
                        <input type="hidden" name="id" id="id" value="<%=sp.getId()%>"/>

                        <tr>
                            <td>
                                Tên sách <input type="text" name="Ten" id="Ten" value="<%=sp.getTensp()%>"/>

                                <br /><br />
                            </td>
                        </tr>
                        <tr>
                           
                            <td>
                              Giá sách  <input type="text" name="Gia" id="Gia" value="<%=sp.getGiaSP()%>"/>

                                <br /><br />
                            </td>
                        </tr>
                        <tr>
                            <td>
                               Hình Ảnh <img src="Uploads/<%=sp.getHinhAnh()%>" height="300px" width="200px">
                                <br>
                                         <input type="text" readonly name="tAnhHientai" id="tAnhHientai" value="<%=sp.getHinhAnh()%>">
                                <input type="file" name="HinhAnh" id="HinhAnh"/>

                                <br /><br />
                            </td>
                        </tr>
                        <tr>
                           
                            <td>
                                Mô tả<textarea type="text" name="MoTa" id="MoTa" style="width: 700px;height: 300px;"><%=sp.getMoTa()%></textarea>

                                <br /><br />
                            </td>
                        </tr>
                        <tr>


                            <td>
                               Nhóm sách<select name="Nhom" id="nhom">
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
                                <br /><br />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                Bày bán  <input  class="hienthi" type="checkbox" name="trangthai" id="trangthai" value="1"<%=(sp.isTrangthai() == true) ? "checked" : ""%>/> 
                                <br /><br />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center">
                                <input  type="submit" id="Sua" name="Sua" value="Sửa" style="width:100%;height:40px;background-color:red;border-radius:10px;"/>
                            </td>
                        </tr>
                    </table>
                </form>
                <%
                    }
                %>
            </div><!-- /.box-body -->
        </div><!-- /.box -->
    </div>
</div>