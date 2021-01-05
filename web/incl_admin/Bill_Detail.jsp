<%-- 
    Document   : Admin_main
    Created on : Sep 7, 2020, 10:04:53 PM
    Author     : Minh Dao
--%>

<%@page import="model.clsChiTietHoaDon"%>
<%@page import="CSDLCustomer.tbHoaDon"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="model.clsProduct"%>
<%@page import="CSDLAdmin.tbProductAdmin"%>
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
                        <th>TÊN SẢN PHẨM</th>
                        <th>Hình Ảnh</th>
                        <th>Số lượng </th>
                        <th>THÀNH TIỀN</th>


                    </tr>
                    <%
                        int mahd = Integer.parseInt(request.getParameter("mahd"));
                        String hinhanh = "noimage.jpg";
                        String tensp = "";
                        Vector<clsChiTietHoaDon> dscthd = new Vector<clsChiTietHoaDon>();
                        clsChiTietHoaDon cthd = new clsChiTietHoaDon();
                        CSDLAdmin.tbChiTietHoaDon.DanhSachChiTietHD(mahd, dscthd);

                        int dem = 0;
                        for (clsChiTietHoaDon p : dscthd) {
                            dem++;
                            clsProduct sp = new clsProduct();
                            tbProductAdmin.GetOneProduct(p.getidsp(), sp);
                            if (sp.getHinhAnh() != null && sp.getHinhAnh().equals("") == false) {
                                hinhanh = sp.getHinhAnh();
                            }
                            tensp = sp.getTensp();
                    %>
                    <tr>
                        <td><%=dem%></td>
                        <td style="width: 100px"><%=tensp%></td>
                        <td style="width: 100px"><img src="Uploads/<%=hinhanh%>" width="100px" height="100px"></td>
                        <td style="width: 100px"><%=p.getSoluong()%></td>

                        <td><%=String.format("%,d", CSDLAdmin.tbChiTietHoaDon.TongTienHoaDonChiTiet(p.getidsp()))%></td>

                    </tr>
                    <%    }session.setAttribute("dscthd", dscthd);
%>
                    <tr>
                    <a href="inhd.jsp?id=<%=mahd%>">In hóa đơn</a>
                    </tr>
                </table>
            </div><!-- /.box-body -->
        </div><!-- /.box -->
    </div>
</div>