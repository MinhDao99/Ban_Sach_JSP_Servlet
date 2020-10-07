<%-- 
    Document   : shopong-cart
    Created on : Aug 27, 2020, 11:40:12 PM
    Author     : Minh Dao
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Vector"%>
<%@page import="model.ListProduct"%>
<%@page import="CSDLCustomer.tbProduct"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">

    <head>
        <meta charset="UTF-8">
        <meta name="description" content="Ogani Template">
        <meta name="keywords" content="Ogani, unica, creative, html">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Ogani | Template</title>

        <!-- Google Font -->
        <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">

        <!-- Css Styles -->
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
        <link rel="stylesheet" href="css/nice-select.css" type="text/css">
        <link rel="stylesheet" href="css/jquery-ui.min.css" type="text/css">
        <link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
        <link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
        <link rel="stylesheet" href="css/style.css" type="text/css">
    </head>

    <body>
        <%
            DecimalFormat formatter = new DecimalFormat("###,###,###");
            int tongtien = 0;

        %>
        <section class="shopingcart spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="shoping__cart__table">
                            <form name="f1" id="f1" method="post" action="XuLyUpdateCart">

                                <table>

                                    <thead>
                                        <tr>
                                            <th class="shoping__product">Products</th>
                                            <th>Đơn giá(VNĐ)</th>
                                            <th>Số lượng</th>
                                            <th>Thành tiền</th>
                                            <th></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <%                                            HashMap<Integer, Integer> cart = (HashMap<Integer, Integer>) session.getAttribute("cart");
                                            if (cart == null) {
                                        %>
                                        <tr>
                                            <td class="shoping__cart__item">
                                                <img src="img/cart/cart-1.jpg" alt="">
                                                <h5>No product in cart</h5>
                                            </td>
                                            <%
                                            } else {
                                                for (int id : cart.keySet()) {
                                                    ListProduct pro = new ListProduct();
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
                                                <span> <a href="XuLyXoaCart?id=<%=id%>"> Xóa</a></span>
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
                                            <input type="submit"  class="primary-btn cart-btn cart-btn-right" value="Update Cart">
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
                            <a href="index.jsp?" class="primary-btn cart-btn">CONTINUE SHOPPING</a>


                        </div>
                    </div>

                    <div class="col-lg-6">
                        <div class="shoping__continue">
                            <div class="shoping__discount">
                                <h5>Discount Codes</h5>
                                <form action="#">
                                    <input type="text" placeholder="Enter your coupon code">
                                    <button type="submit" class="site-btn">APPLY COUPON</button>
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
                            <a href="index.jsp?module=checkout" class="primary-btn">PROCEED TO CHECKOUT</a>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Shoping Cart Section End -->

        <!-- Footer Section Begin -->

        <!-- Footer Section End -->

        <!-- Js Plugins -->
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.nice-select.min.js"></script>
        <script src="js/jquery-ui.min.js"></script>
        <script src="js/jquery.slicknav.js"></script>
        <script src="js/mixitup.min.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/main.js"></script>


    </body>

</html>