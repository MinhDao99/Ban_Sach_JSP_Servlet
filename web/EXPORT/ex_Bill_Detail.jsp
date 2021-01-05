<%-- 
    Document   : Admin_main
    Created on : Sep 7, 2020, 10:04:53 PM
    Author     : Minh Dao
--%>

<%@page import="model.clsHoaDon"%>
<%@page import="model.clsChiTietHoaDon"%>
<%@page import="CSDLCustomer.tbHoaDon"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="model.clsProduct"%>
<%@page import="CSDLAdmin.tbProductAdmin"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<table>
    <br>
    <tr>
        <th>STT</th>
        <th>TÊN ĐỆM</th>
        <th>TÊN </th>
        <th>ĐỊA CHỈ</th>
        <th>THÀNH PHỐ</th>
        <th>SĐT </th>
        <th>EMAIL</th>
        <th>GHI CHÚ</th>
        <th>NGÀY ĐẶT </th>
        <th>TÔNG TIỀN</th>
        <th>TRẠNG THÁI</th>


    </tr>
    <%
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "inline;filename=HoaDon.xls");
        Vector<clsHoaDon> dshd = new Vector<clsHoaDon>();
//        Vector<clsChiTietHoaDon> dscthd = (Vector<clsChiTietHoaDon>) session.getAttribute("export");
        Vector<clsChiTietHoaDon> dscthd = new Vector<clsChiTietHoaDon>();
        clsHoaDon hd = new clsHoaDon();
        CSDLAdmin.tbhoaDon.GetData(dshd);
        String trangthai = "";
        int dem = 0;
        for (clsHoaDon p : dshd) {
                dem++;
                if (p.getStatus() == 0) {
                    trangthai = "Mới";
                } else if (p.getStatus() == 1) {
                    trangthai = "Đã duyệt";

                } else if (p.getStatus() == 2) {
                    trangthai = "Đã thanh toán";

                } else {
                    trangthai = "Đã hủy";

                }
    %>
    <tr>
        <td><%=dem%></td>
        <td style="width: 100px"><%=p.getFirstName()%></td>
        <td style="width: 100px"><%=p.getLastName()%></td>
        <td style="width: 100px"><%=p.getAddress()%></td>
        <td style="width: 100px"><%=p.getTown()%></td>
        <td style="width: 100px"><%=p.getPhone()%></td>
        <td style="width: 100px"><%=p.getEmail()%></td>
        <td style="width: 100px"><%=p.getOrderNote()%></td>
        <td style="width: 100px"><%=p.getOderDate()%></td>
        <td style="width: 100px"><%=String.format("%,d", CSDLAdmin.tbChiTietHoaDon.TongTienHoaDon(p.getId()))%></td>
        <td style="width: 100px"><%=trangthai%></td>

    </tr>
    <%    
           dscthd.removeAllElements();
        }
    %>
</table>
