<%-- 
    Document   : Admin_main
    Created on : Sep 7, 2020, 10:04:53 PM
    Author     : Minh Dao
--%>

<%@page import="CSDLAdmin.tbUserAdmin"%>
<%@page import="model.cls_Account_Customer"%>
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
                        <th>Số điện thoại </th>
                        <th>Thao tác</th>


                    </tr>
                    <%
                        Vector<cls_Account_Customer> ds = new Vector<cls_Account_Customer>();
                        tbUserAdmin.GetUserCus(ds);
                        int dem = 0;
                        for (cls_Account_Customer p : ds) {
                            dem++;
                    %>
                    <tr>
                        <td><%=dem%></td>
                        <td style="width: 100px"><%=p.getEmail()%></td>
                        <td style="width: 500px"><%=p.getPass()%></td>
                        <td><%=p.getHoten()%></td>
                        <td><%=p.getSdt()%></td>

                        <th>
                            <a href="XyLyXoaUserCus?id=<%=p.getId()%>" onclick="return confirm('Chắc chắn xóa');"><input type="submit" name="delete" id="delete" value="Xóa"></a>
                        </th>
                    </tr>
                    <%    }
                    %>
                </table>
            </div><!-- /.box-body -->
        </div><!-- /.box -->
    </div>
</div>