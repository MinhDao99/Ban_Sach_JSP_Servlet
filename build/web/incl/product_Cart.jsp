<%-- 
    Document   : shopong-cart
    Created on : Aug 27, 2020, 11:40:12 PM
    Author     : Minh Dao
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Vector"%>
<%@page import="model.clsProduct"%>
<%@page import="CSDLCustomer.tbProduct"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <body>
        <%
            DecimalFormat formatter = new DecimalFormat("###,###,###");
            double tongtien = 0;

        %>
        <section class="shopingcart spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="shoping__cart__table">
                            <form name="f1" id="f1" method="post" action="Cart_Update">

                                <table>

                                    <thead>
                                        <tr>
                                            <th class="shoping__product">Tên sản phẩm</th>
                                            <th>Đơn giá(VNĐ)</th>
                                            <th>Số lượng</th>
                                            <th>Thành tiền</th>
                                            <th></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <%                                           
                                            HashMap<Integer, Integer> cart = (HashMap<Integer, Integer>) session.getAttribute("cart");
                                            if (cart == null || cart.isEmpty()) {
                                        %>
                                        <tr>
                                            <td class="shoping__cart__item">
                                                <img src="Uploads/noimage.jpg" alt="">
                                                <h5>Bạn chưa mua sản phẩm</h5>
                                            </td>
                                            <%
                                            } else {
                                                for (int id : cart.keySet()) {
                                                    clsProduct pro = new clsProduct();
                                                    int kq = tbProduct.GetOneProduct(id, pro);
                                                    if (kq > 0) {
                                                        int soluong = cart.get(id);
                                                        int tien = soluong * Integer.parseInt(pro.getGiaSP());
                                                        tongtien += tien;

                                            %>
                                        </tr>
                                        <tr>

                                            <td class="shoping__cart__item">
                                                <img src="Uploads/<%=pro.getHinhAnh()%>" height="100px" width="100px" alt="">
                                                <h5><%=pro.getTensp()%></h5>
                                            </td>
                                            <td class="shoping__cart__price">
                                                <%=formatter.format(Integer.parseInt(pro.getGiaSP()))%>
                                            </td>
                                            <td class="shoping__cart__quantity">
                                                <div class="quantity">

                                                    <input type="text"  name="soluongmoi_<%=id%>" value="<%=soluong%>" style="text-align: center">

                                                </div>
                                            </td>
                                            <td class="shoping__cart__total">
                                                <%=formatter.format(tien)%>
                                            </td>
                                            <td >
                                                <span> <a href="Cart_Del?id=<%=id%>"> Xóa</a></span>
                                            </td>
                                        </tr>

                                        <%          }
                                                }
                                            }

                                        %>

                                    </tbody>
                                    <tr>
                                        <td>
                                        </td>
                                        <td>
                                        </td> <td>
                                        </td>

                                        <td>
                                            <input type="submit"  class="primary-btn cart-btn cart-btn-right" value="Cập nhật giỏ hàng">
                                        </td>
                                    </tr>
                                </table>

                            </form>

                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-12">
                        <div class="shoping__cart__btns">
                            <a href="index.jsp?" class="primary-btn cart-btn">Tiếp tục mua sản phẩm</a>
                        </div>
                    </div>

                    <div class="col-lg-6">
                        <div class="shoping__continue">
                            <div class="shoping__discount">
                                <h5>Mã khuyễn mãi</h5>
                                <form action="#">
                                    <input type="text">
                                    <button type="submit" class="site-btn">Nhập mã khuyễn mãi</button>
                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="shoping__checkout">
                            <h5>Thành tiền</h5>
                            <ul>
                                <li>Giảm giá <span>0 VNĐ</span></li>
                                <li>Tổng tiền <span><%=formatter.format(tongtien)%></span></li>
                            </ul>
                            <a href="index.jsp?module=checkout" class="primary-btn">Tiếp tục thanh toán</a>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </body>

</html>