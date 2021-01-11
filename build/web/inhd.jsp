
<%@page import="model.clsHoaDon"%>
<%@page import="CSDLAdmin.tbProductAdmin"%>
<%@page import="model.clsProduct"%>
<%@page import="java.util.Vector"%>
<%@page import="model.clsChiTietHoaDon"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<title>HÓA ĐƠN BÁN HÀNG</title>
<body onLoad="window.print()">

    <div id="wrapper" style="margin:0 auto; width:500px;">
        <table width="100%">
            <!--DWLayoutTable-->
            <tr>
                <td height="25" valign="top"align="center"><div align="left">
                        <table width="100%">
                            <tbody>
                                <tr>
                                    <td width="5" height="95">&nbsp;</td>

                                    <td width="500"><table border="0" cellpadding="0" cellspacing="0" width="100%">
                                            <tbody>
                                                <tr>
                                                    <td><table border="0" cellpadding="0" cellspacing="0" width="100%">
                                                            <tbody>
                                                                <tr>
                                                                    <td colspan="2"><strong>MinhDao|Book Store</strong></td>
                                                                    <td><img src="img/logobyminh1.png" height="50" width="100" ></td>
                                                                </tr>
                                                                <tr>
                                                                    <td>Địa chỉ</td>
                                                                    <td>: 5 Ngõ 72, Phố Bắc Cầu, P. Ngọc Thụy, Q. Long Biên, TP.Hà Nội</td>
                                                                </tr>
                                                                <tr>
                                                                    <td>Di Động </td>
                                                                    <td>: 0327614768-0989457236</td>
                                                                </tr>
                                                                <tr>
                                                                    <td>Email</td>
                                                                    <td>:dao.d.minh.190299@gmail.com</td>
                                                                </tr>
                                                            </tbody>
                                                        </table></td>
                                                </tr>
                                            </tbody>
                                        </table></td>
                                </tr>
                            </tbody>
                        </table>
                    </div></td>
            </tr>
            <tr>
                <td width="562" height="25" valign="top"align="center">  <hr>
                        <strong><font color="#FF0000" size="+2">HÓA ĐƠN XUẤT HÀNG</font></strong></td>
            </tr>
            <%
                
                Vector<clsHoaDon> ds = new Vector<clsHoaDon>();
                int mahd = Integer.parseInt(request.getParameter("id"));
                CSDLAdmin.tbhoaDon.GetDataByIdHD(mahd, ds);
                for (clsHoaDon hd : ds) {
            %>
            <tr>
                <td height="54"  >                    
                    <div align="left">
                        <b>Thông tin Khách hàng:</b> </div>
                    <table width="100%" >
                        <tr>
                            <td width="3%" >&nbsp;</td>
                            <td width="34%" >Họ tên:</td>
                            <td width="63%" >   <%=hd.getLastName()%>  </td>
                        </tr>
                        <tr>
                            <td >&nbsp;</td>
                            <td >Địa chỉ :</td>
                            <td >  <%=hd.getAddress()%>  </td>
                        </tr>
                        <tr>
                            <td >&nbsp;</td>
                            <td >Điện thoại :</td>
                            <td ><%=hd.getPhone()%></td>
                        </tr>

                        <tr>
                            <td>&nbsp;</td>
                            <td>Email : </td>
                            <td ><%=hd.getEmail()%> </td>
                        </tr>
                    </table>
                    <br />
                    <%}%>
                    <span class="style3"><B>Thông tin về đơn đặt hàng : </B></span>
                    <table width="100%" style="border-collapse:collapse;">
                        <tr>
                            <td width="5%" bgcolor="#CCCCCC"  align="left" style="border:1px solid green;"><div align="center">STT</div></td>
                            <td width="30%" bgcolor="#CCCCCC"  align="left" style="border:1px solid green;"><div align="center">Tên hàng</div></td>
                            <td width="25%" bgcolor="#CCCCCC"  align="left" style="border:1px solid green;"><div align="center">Giá</div></td>
                            <td width="5%" bgcolor="#CCCCCC"  align="left" style="border:1px solid green;"><div align="center">Số lượng</div></td>
                            <td width="25%" align="right" bgcolor="#CCCCCC"  align="left" style="border:1px solid green;"><div align="center">Tổng cộng</div></td>
                        </tr>
                        <%
                            int dem = 0;
                            double tongtien = 0;
                            String tensp = "";
                            Vector<clsChiTietHoaDon> dscthd = (Vector<clsChiTietHoaDon>) session.getAttribute("dscthd");
                            for (clsChiTietHoaDon p : dscthd) {
                                dem++;
                                clsProduct sp = new clsProduct();
                                tbProductAdmin.GetOneProduct(p.getidsp(), sp);
                                tensp = sp.getTensp();


                        %>
                        <tr>
                            <td align="left" style="border:1px solid green;"><%=dem%></td>
                            <td align="left" style="border:1px solid green;"><div align="center"></div><%=sp.getTensp()%></td>
                            <td align="center" align="left" style="border:1px solid green;"><%=p.getGiamua()%> </td>
                            <td align="center"  align="left" style="border:1px solid green;"> <%=p.getSoluong()%> </td>
                            <td align="center" align="left" style="border:1px solid green;"> <%=String.format("%,d", CSDLAdmin.tbChiTietHoaDon.TongTienHoaDonChiTiet(p.getidsp()))%> </td>
                        </tr>
                        <%
                                tongtien += CSDLAdmin.tbChiTietHoaDon.TongTienHoaDonChiTiet(p.getidsp());
                            }

                        %>
                        <tr style="border:1px solid green;">
                            <td colspan="4" align="left"><div align="right">Tổng giá trị đơn hàng: </div></td>
                            <td align="right" ><%=tongtien%></td>
                        </tr>     

                    </table>

                    <table width="452" border="0" align="right">
                        <tr>
                            <td colspan="3"><div align="right"></div></td>
                        </tr>
                        <tr>

                            <td><div align="center"><strong><br />Nhân viên Bán hàng</strong></div></td>
                            <td>&nbsp;</td>

                            <td><div align="center"><strong><br />Khách hàng</strong></div></td>
                        </tr>
                        <tr>
                            <td height="23"><div align="center">(Ký tên + Đóng dấu Công ty)</div></td>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td height="73">&nbsp;</td>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                        </tr>

                    </table>
                    <p>&nbsp;</p>
                    <p><br>
                    </p>
                </td>
            </tr>
        </table>
    </div>
</body>
</html>
