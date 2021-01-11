<%-- 
    Document   : Admin_main
    Created on : Sep 7, 2020, 10:04:53 PM
    Author     : Minh Dao
--%>

<%@page import="model.cls_Account_Admin"%>
<%@page import="CSDLAdmin.tbUserAdmin"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="CSDLAdmin.tbProductAdmin"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<table>
    <tr>
        <th>STT</th>
        <th>Email</th>
        <th>Password</th>
        <th>Họ tên</th>
        <th>Tên hiển thị</th>
        <th>Số điện thoại </th>
    </tr>
    <%
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "inline;filename=DuLieu.xls");
        
//        Vector<cls_Account_Admin> ds = (Vector<cls_Account_Admin>) session.getAttribute("export");
        Vector<cls_Account_Admin> ds = new Vector<cls_Account_Admin>();
         tbUserAdmin.GetUserAdmin(ds);
        int dem = 0;
        for (cls_Account_Admin p : ds) {
            dem++;
    %>
    <tr>
        <td style="width: 100px"><%=dem%></td>
        <td style="width: 500px"><%=p.getEmail()%></td>
        <td style="width: 300px"><%=p.getPass()%></td>
        <td style="width: 200px"><%=p.getHoten()%></td>
        <td style="width: 200px"><%=p.getTenhienthi()%></td>
        <td style="width: 200px"> <%=p.getSdt()%></td>

    </tr>
    <%    }

    %>
</table>

