<%-- 
    Document   : Admin_main
    Created on : Sep 7, 2020, 10:04:53 PM
    Author     : Minh Dao
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="CSDLAdmin.tbProductAdmin"%>
<%@page import="java.util.Vector"%>
<%@page import="model.clsCatagory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="row">
    <div class="col-xs-12">
        <div class="box">
            <div class="box-body table-responsive no-padding">
                <table class="table table-hover">
                    <tr>
                        <th>STT</th>
                        <th>Tên loại sách</th>
                        <th>Trạng thái</th>
                        <th>Thao tác</th>


                    </tr>
                    <%
                        Vector<clsCatagory> ds = new Vector<clsCatagory>();
                        clsCatagory pro = new clsCatagory();
                        tbProductAdmin.GetProductAdmin(ds);
                        int dem = 0;
                        for (clsCatagory p : ds) {
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
                      <td colspan="4" align="center"><a href="EXPORT/ex_Category.jsp">Export</a></td>

                        
                    </tr>
                </table>
            </div><!-- /.box-body -->
        </div><!-- /.box -->
    </div>
</div>