<%-- 
    Document   : Admin_main
    Created on : Sep 7, 2020, 10:04:53 PM
    Author     : Minh Dao
--%>

<%@page import="java.text.DecimalFormat"%>
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
                <table class="table table-hover">
                    <tr>
                        <th>STT</th>
                        <th>Tên loại sách</th>
                        <th>Trạng thái</th>
                        <th>Thao tác</th>


                    </tr>
                    <%
                        Vector<Product> ds = new Vector<Product>();
                        Product pro = new Product();
                        tbProductAdmin.GetProductAdmin(ds);
                        int dem = 0;
                        for (Product p : ds) {
                            dem++;


                    %>
                    <tr>
                        <td><%=dem%></td>
                        <td><%=p.getTen()%></td>
                        <td><%=p.isTrangthai() ? "Đang bán" : "Đang không bán"%></td>

                        <th><a href="admin.jsp?module=SuaDulieu&id=<%=p.getId()%>"><input type="submit" name="fix" id="fix" value="Sửa"></a>
                            <a href="DoiTrangThaiLoaiSP?id=<%=p.getId()%>&tt=<%=p.gettrangthai()%>"><input type="submit" name="show" id="show" value="Đổi trạng thái"></a></th>
                    </tr>
                    <%    }
                    %>
                    <tr>
                      <td colspan="4" align="center"><a href="EXPORT/export.jsp">Export</a></td>

                        
                    </tr>
                </table>
            </div><!-- /.box-body -->
        </div><!-- /.box -->
    </div>
</div>