<%-- 
    Document   : checkout
    Created on : Aug 27, 2020, 11:37:28 PM
    Author     : Minh Dao
--%>

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
        <script language="javascript">
            function   kiemtra() {
                alert("123123");
                f = document.f1;
                hoten = f.FirstName.value;
                if (hoten == "") {
                    alert("Bạn chưa nhập họ tên");
                    document.getElementById("loi_hoten").innerHTML = "Bạn chưa nhập họ tên";
                    //f.tHoten.select();
                    return false;
                } else
                {
                    document.getElementById("loi_hoten").innerHTML = "";
                }
//                tPhone = f1.Phone.value;
//                re_phone = /^\d{10,11}$/;
//                if (re_dienthoai.test(tPhone) == false)
//                {
//                    document.getElementById("loi_dienthoai").innerHTML = "Bạn nhập điện thoại sai";
//                    f.Phone.select();
//                    return false;
//                } else
//                {
//                    document.getElementById("loi_dienthoai").innerHTML = "";
//                }
            }

        </script>
    </head>

    <body>
        <!-- Checkout Section Begin -->
        <section class="checkout spad">
            <div class="container">

                <div class="checkout__form">
                    <h4>Thông tin hóa đơn</h4>
                    <form action="Cart_checkout" method="post" id="f1" name="f1">
                        <div class="row">
                            <div class="col-lg-8 col-md-6">
                                <div class="row">
                                    <div class="col-lg-6">
                                        <div class="checkout__input">
                                            <p>Fist Name<span>*</span></p>
                                            <input type="text" name="FirstName" id="FirstName">
                                            <br>
                                            <span id="loi_hoten" class="baoloi"></span>
                                        </div>
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="checkout__input">
                                            <p>Last Name<span>*</span></p>
                                            <input type="text" name="LastName" id="LastName">
                                        </div>
                                    </div>
                                </div>

                                <div class="checkout__input">
                                    <p>Address<span>*</span></p>
                                    <input type="text" placeholder="Street Address" name="Address" id="Address" class="checkout__input__add">

                                </div>
                                <div class="checkout__input">
                                    <p>Town/City<span>*</span></p>
                                    <input type="text" name="Town" id="Town">
                                </div>

                                <div class="row">
                                    <div class="col-lg-6">
                                        <div class="checkout__input">
                                            <p>Phone<span>*</span></p>
                                            <input type="text" name="Phone" id="Phone">
                                            <span id="loi_dienthoai" class="baoloi"></span>
                                        </div>
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="checkout__input">
                                            <p>Email<span>*</span></p>
                                            <input type="text" name="Email" id="Email">
                                        </div>
                                    </div>
                                </div>

                                <div class="checkout__input">
                                    <p>Order notes<span>*</span></p>
                                    <input type="text" name="Note" id="Note"
                                           placeholder="Notes about your order, e.g. special notes for delivery.">
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-6">
                                <div class="checkout__order">
                                    <h4>Your Order</h4>
                                    <div class="checkout__order__products">Products <span>Total</span></div>
                                    <ul>
                                        <li>Vegetable’s Package <span>$75.99</span></li>
                                        <li>Fresh Vegetable <span>$151.99</span></li>
                                        <li>Organic Bananas <span>$53.99</span></li>
                                    </ul>
                                    <div class="checkout__order__subtotal">Subtotal <span>$750.99</span></div>
                                    <div class="checkout__order__total">Total <span>$750.99</span></div>

                                    <button type="submit" class="site-btn" onclick="return kiemtra();">PLACE ORDER</button>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </section>
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