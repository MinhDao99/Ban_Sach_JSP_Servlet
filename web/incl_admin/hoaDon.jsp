<%-- 
    Document   : Admin_main
    Created on : Sep 7, 2020, 10:04:53 PM
    Author     : Minh Dao
--%>

<%@page import="CSDLCustomer.tbHoaDon"%>
<%@page import="model.HoaDon"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="model.ListProduct"%>
<%@page import="CSDLAdmin.tbProductAdmin"%>
<%@page import="java.util.Vector"%>
<%@page import="model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<script language="javascript">
    function DoiTT(mahd, tthientai, sTatus)
    {
        ttmoi = parseInt(sTatus.value);
        if (tthientai == ttmoi)
        {
            return false
        }
        if ((tthientai == 0)
                || (tthientai == 1 && (ttmoi == 2 || ttmoi == 3))
                || (tthientai == 3 && (ttmoi == 1 || ttmoi == 2)))
        {
            window.location.href = "DoiTrangThaiHoaDon?mahd=" + mahd + "&tthientai=" + tthientai + "&ttmoi=" + ttmoi;


        } else {
            alert("Không được phép đổi");
            sTatus.value = tthientai;
            return false;
        }
    }
</script>
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
                        <th>TÊN ĐỆM</th>
                        <th>TÊN </th>
                        <th>ĐỊA CHỈ</th>
                        <th>THÀNH PHỐ</th>
                        <th>SĐT </th>
                        <th>EMAIL</th>
                        <th>GHI CHÚ</th>
                        <th>NGÀY ĐẶT</th>
                        <th>TỔNG TIỀN</th>
                        <th>TRẠNG THÁI</th>
                        
                    </tr>
                    <%
                        Vector<HoaDon> ds = new Vector<HoaDon>();
                        HoaDon hd = new HoaDon();
                        CSDLAdmin.tbhoaDon.GetData(ds);
                        int dem = 0;
                        for (HoaDon p : ds) {
                            dem++;
                    %>
                    <tr>
                        <td><a href="admin.jsp?module=chitiethoadon&mahd=<%=p.getId()%>"><%=dem%></a></td>
                        <td style="width: 100px"><%=p.getFirstName()%></td>
                        <td style="width: 100px"><%=p.getLastName()%></td>
                        <td style="width: 100px"><%=p.getAddress()%></td>
                        <td style="width: 100px"><%=p.getTown()%></td>
                        <td style="width: 100px"><%=p.getPhone()%></td>
                        <td style="width: 100px"><%=p.getEmail()%></td>
                        <td style="width: 100px"><%=p.getOrderNote()%></td>
                        <td style="width: 100px"><%=p.getOderDate()%></td>

                        <td><%=String.format("%,d", CSDLAdmin.tbChiTietHoaDon.TongTienHoaDon(p.getId()))%></td>
                        <td>
                            <select name="sTatus" id="sTatus" onchange="return DoiTT(<%=p.getId()%>,<%=p.getStatus()%>, this);" >
                                <option value="0" <%=(p.getStatus() == 0) ? "selected" : ""%>>Mới</option>
                                <option value="1" <%=(p.getStatus() == 1) ? "selected" : ""%>>Đã duyệt</option>
                                <option value="2" <%=(p.getStatus() == 2) ? "selected" : ""%>>Đã thanh toán</option>
                                <option value="3" <%=(p.getStatus() == 3) ? "selected" : ""%>>Hủy</option>
                            </select>
                        </td>
                    </tr>
                    <%    }
                    %>
                </table>
            </div><!-- /.box-body -->
        </div><!-- /.box -->
    </div>
</div>