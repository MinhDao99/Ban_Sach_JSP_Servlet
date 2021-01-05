<%-- 
    Document   : checkout
    Created on : Aug 27, 2020, 11:37:28 PM
    Author     : Minh Dao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <script language="javascript">
            function   kiemtra() {
                f = document.f1;
                hoten = f.FirstName.value;
                if (hoten == "") {
                    document.getElementById("loi_firstname").innerHTML = "Bạn chưa nhập họ tên";
                    return false;
                } else
                {

                    document.getElementById("loi_firstname").innerHTML = "";
                }

                hotendem = f.LastName.value;
                if (hotendem == "")
                {
                    document.getElementById("loi_lastname").innerHTML = "Bạn chưa nhập tên";
                    return false;


                } else
                {
                    document.getElementById("loi_lastname").innerHTML = "";
                }
                Address = f.Address.value;
                if (Address == "")
                {
                    document.getElementById("loi_address").innerHTML = "Chưa nhập địa chỉ";
                    return false;


                } else
                {
                    document.getElementById("loi_address").innerHTML = "";

                }
                Town = f.Town.value;
                if (Town == "")
                {
                    document.getElementById("loi_Town").innerHTML = "Chưa nhập thành phố";
                    return false;


                } else
                {
                    document.getElementById("loi_Town").innerHTML = "";

                }
                tPhone = f.Phone.value;
                re_phone = /^(\+84)?0?\d[1-9]{9,11}$/;
                if (re_phone.test(tPhone) == false)
                {
                    document.getElementById("loi_phone").innerHTML = "Bạn nhập điện thoại sai";
                    return false;
                } else
                {
                    document.getElementById("loi_phone").innerHTML = "";
                }
                email = f.Email.value;
                re_email = /^\w+([\.\-]?\w+)*@\w+(\.\w+){1,2}$/;
                if (re_email.test(email) == false)
                {
                    document.getElementById("loi_email").innerHTML = "bạn nhập sai định dạng";
                    return false;

                } else
                {
                    document.getElementById("loi_email").innerHTML = "";
                }

                alert("Đặt hàng thành công");
            }

        </script>
 

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
                                            <p>Họ và đệm<span>*</span></p>
                                            <input type="text" name="FirstName" id="FirstName">
                                            <br>
                                            <span id="loi_firstname" class="baoloi" style="color: red"></span>
                                        </div>
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="checkout__input">
                                            <p>Tên<span>*</span></p>
                                            <input type="text" name="LastName" id="LastName">
                                            <br>
                                            <span id="loi_lastname" class="baoloi" style="color: red"></span>
                                        </div>
                                    </div>
                                </div>

                                <div class="checkout__input">
                                    <p>Địa chỉ<span>*</span></p>
                                    <input type="text" placeholder="Street Address" name="Address" id="Address" class="checkout__input__add">
                                    <br>
                                    <span id="loi_address" class="baoloi" style="color: red"></span>
                                </div>
                                <div class="checkout__input">
                                    <p>Thành Phố<span>*</span></p>
                                    <input type="text" name="Town" id="Town">
                                    <br>
                                    <span id="loi_Town" class="baoloi" style="color: red"></span>
                                </div>

                                <div class="row">
                                    <div class="col-lg-6">
                                        <div class="checkout__input">
                                            <p>Số điện thoại<span>*</span></p>
                                            <input type="text" name="Phone" id="Phone">
                                            <br>
                                            <span id="loi_phone" class="baoloi" style="color: red"></span>
                                        </div>
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="checkout__input">
                                            <p>Email<span>*</span></p>
                                            <input type="text" name="Email" id="Email">
                                            <br>
                                            <span id="loi_email"  class="baoloi" style="color: red"></span>
                                        </div>
                                    </div>
                                </div>
                                <div class="checkout__input">
                                    <p>Ghi chú</p>
                                    <textarea name="Note" id="Note" cols="100" rows="10" placeholder="Vui lòng điền ghi chú của bạn vào đây"></textarea>
                                    <script language="javascript">
                                        CKEDITOR.replace('Note');
                                    </script>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-6">
                                <div class="checkout__order">
                                    <button type="submit" class="site-btn" onclick="return kiemtra();">Hoàn tất đặt hàng</button>
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