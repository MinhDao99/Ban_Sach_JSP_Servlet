<%-- 
    Document   : Admin_main
    Created on : Sep 7, 2020, 10:04:53 PM
    Author     : Minh Dao
--%>

<%@page import="model.cls_Account_Admin"%>
<%@page import="CSDLAdmin.tbUserAdmin"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.Vector"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="row">
    <div class="col-xs-12">
        <div class="box">
            <div class="box-body table-responsive no-padding">
                <table class="table table-hover">
                    <br>
                    <tr>

                        <th>STT</th>
                        <th>Email</th>
                        <th>Password</th>
                        <th>Họ tên</th>
                        <th>Tên hiển thị</th>
                        <th>Số điện thoại </th>
                        <th>Thao tác</th>


                    </tr>
                    <%

                        Vector<cls_Account_Admin> ds = new Vector<cls_Account_Admin>();
                        tbUserAdmin.GetUserAdmin(ds);
                        int dem = 0;
                        for (cls_Account_Admin p : ds) {
                            dem++;
                    %>
                    <tr>
                        <td><%=dem%></td>
                        <td style="width: 100px"><%=p.getEmail()%></td>
                        <td style="width: 500px"><%=p.getPass()%></td>
                        <td><%=p.getHoten()%></td>
                        <td><%=p.getTenhienthi()%></td>

                        <td><%=p.getSdt()%></td>

                        <th>
                            <a href="XyLyXoaUserAdmin?id=<%=p.getId()%>" onclick="return confirm('Chắc chắn xóa');"><input type="submit" name="delete" id="delete" value="Xóa"></a>

                        </th>
                    </tr>
                    <%    }
                       // session.setAttribute("export", ds);
                    %>
                    <tr>
                        <td colspan="6" align="center"><a href="EXPORT/ex_AccountAdmin.jsp">Export</a></td>


                    </tr>
                </table>
                <form action="importAccountAdmin" method="post" enctype="multipart/form-data">
                    <input type="file" name="filename">
                    <input type="submit" value="import">
                </form>
            </div><!-- /.box-body -->
        </div><!-- /.box -->
    </div>
</div>