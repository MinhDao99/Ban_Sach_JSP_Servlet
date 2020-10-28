<%-- 
    Document   : ex_Products
    Created on : Oct 27, 2020, 9:21:48 PM
    Author     : Minh Dao
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="model.ListProduct"%>
<%@page import="CSDLAdmin.tbProductAdmin"%>
<%@page import="java.util.Vector"%>
<%@page import="model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<table>
    <br>
    <tr>

        <th>STT</th>
        <th>Tên sách</th>
        <th>Giá sách</th>
        <th>Hình Ảnh</th>
        <th>Mô tả</th>
        <th>Nhóm sản phẩm </th>
        <th>Trạng thái</th>


    </tr>
    <%
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "inline;filename=Product.xls");
        response.setCharacterEncoding("utf-8");
        Vector<ListProduct> ds = new Vector<ListProduct>();
        ListProduct pro = new ListProduct();
        tbProductAdmin.LayDuLieuAdmin(ds);
        int dem = 0;
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        for (ListProduct p : ds) {
            String img = "noimage.jpg";
            if (p.getHinhAnh() != null && p.getHinhAnh().equals("") == false) {
                img = p.getHinhAnh();
            }

            dem++;

    %>
    <tr>
        <td><%=dem%></td>
        <td style="width: 100px"><%=p.getTensp()%></td>
        <td><%=formatter.format(Integer.parseInt(p.getGiaSP()))%></td>
        <td style="width: 100px"><<%=img%></td>
        <td style="width: 500px"><%=p.getMoTa()%></td>
        <td><%=p.getIdproducts()%></td>
        <td><%=p.isTrangthai() ? "Đang bán" : "Không được bán"%></td>
        </th>
    </tr>
    <% 
     
            }
    %>
</table>