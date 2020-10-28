<%-- 
    Document   : Admin_main
    Created on : Sep 7, 2020, 10:04:53 PM
    Author     : Minh Dao
--%>

<%@page import="model.TaikhoanAdmin"%>
<%@page import="CSDLAdmin.tbUserAdmin"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="model.ListProduct"%>
<%@page import="CSDLAdmin.tbProductAdmin"%>
<%@page import="java.util.Vector"%>
<%@page import="model.Product"%>
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
        response.setCharacterEncoding("utf-8");
        Vector<TaikhoanAdmin> ds = (Vector<TaikhoanAdmin>) session.getAttribute("export");
        int dem = 0;
        for (TaikhoanAdmin p : ds) {
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
        session.setAttribute("export", ds);
    %>
</table>

