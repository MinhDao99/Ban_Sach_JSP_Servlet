<%-- 
    Document   : ex_Category
    Created on : Oct 27, 2020, 9:14:39 PM
    Author     : Minh Dao
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="CSDLAdmin.tbProductAdmin"%>
<%@page import="java.util.Vector"%>
<%@page import="model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<table class="table table-hover">
    <tr>
        <th>STT</th>
        <th>Tên loại sách</th>
        <th>Trạng thái</th>


    </tr>
    <%
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "inline;filename=TheLoai.xls");
        response.setCharacterEncoding("utf-8");
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


    </tr>
    <%    }
    %>
</table>
