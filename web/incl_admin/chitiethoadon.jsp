<%-- 
    Document   : Admin_main
    Created on : Sep 7, 2020, 10:04:53 PM
    Author     : Minh Dao
--%>

<%@page import="model.ChiTietHoaDon"%>
<%@page import="CSDLCustomer.tbHoaDon"%>
<%@page import="model.HoaDon"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="model.ListProduct"%>
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
                        String hinhanh = "";
                        String tensp = "";
                        Vector<ChiTietHoaDon> dscthd = new Vector<ChiTietHoaDon>();
                        ChiTietHoaDon cthd = new ChiTietHoaDon();
                        CSDLAdmin.tbChiTietHoaDon.DanhSachChiTietHD(mahd, dscthd);
                       
                        int dem = 0;
                        for (ChiTietHoaDon p : dscthd) {
                            dem++;
                            ListProduct sp = new ListProduct();
                            tbProductAdmin.GetOneProduct(p.getidsp(), sp);
                            hinhanh = sp.getHinhAnh();
                            tensp = sp.getTensp();
                    %>
                    <tr>
                        <td><%=dem%></td>
                        <td style="width: 100px"><%=tensp%></td>
                        <td style="width: 100px"><img src="Uploads/<%=hinhanh%>" width="100px" height="100px"></td>
                        <td style="width: 100px"><%=p.getSoluong()%></td>

                        <td><%=String.format("%,d", CSDLAdmin.tbChiTietHoaDon.TongTienHoaDon(p.getId()))%></td>
                    </tr>
                    <%    }
                    %>
                </table>
            </div><!-- /.box-body -->
        </div><!-- /.box -->
    </div>
</div>