<%-- 
    Document   : shopdetails
    Created on : Aug 27, 2020, 11:39:16 PM
    Author     : Minh Dao
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="CSDL.tbProduct"%>
<%@page import="model.ListProduct"%>
<%@page import="java.util.Vector"%>
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
        <!-- Page Preloder -->


        <!-- Humberger Begin -->

        <!-- Humberger End -->

        <!-- Header Section Begin -->

        <!-- Header Section End -->

        <!-- Hero Section Begin -->

        <!-- Hero Section End -->

        <!-- Breadcrumb Section Begin -->

        <!-- Breadcrumb Section End -->

        <!-- Product Details Section Begin -->
        <section class="product-details spad">
            <div class="container">
                <%
                    int Detailid = Integer.parseInt(request.getParameter("masach"));
                    Vector<ListProduct> ds = new Vector<ListProduct>();
                    int kq = tbProduct.GetDetail(Detailid, ds);
                    DecimalFormat formatter = new DecimalFormat("###,###,###");
                    for (ListProduct p : ds) {
                        String img = "noimage.jpg";
                        if (p.getHinhAnh() != null && p.getHinhAnh().equals("") == false) {
                                img=p.getHinhAnh();
                        }

                %>
                <div class="row">
                    <div class="col-lg-6 col-md-6">
                        <div class="product__details__pic">
                            <div class="product__details__pic__item">
                                <img class="product__details__pic__item--large"
                                     src="Uploads/<%=img%>" alt="">
                            </div>
                            <div class="product__details__pic__slider owl-carousel">
                                <img data-imgbigurl="img/product/details/product-details-2.jpg"
                                     src="img/product/details/thumb-1.jpg" alt="">
                                <img data-imgbigurl="img/product/details/product-details-3.jpg"
                                     src="img/product/details/thumb-2.jpg" alt="">
                                <img data-imgbigurl="img/product/details/product-details-5.jpg"
                                     src="img/product/details/thumb-3.jpg" alt="">
                                <img data-imgbigurl="img/product/details/product-details-4.jpg"
                                     src="img/product/details/thumb-4.jpg" alt="">
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6">
                        <div class="product__details__text">
                            <h3><%=p.getTensp()%></h3>
                            
                            <div class="product__details__price"><%=formatter.format(Integer.parseInt(p.getGiaSP()))%></div>
                            <p><%=p.getMoTa()%></p>
                            
                            <a href="#" class="primary-btn">ADD TO CARD</a>
                            <a href="#" class="heart-icon"><span class="icon_heart_alt"></span></a>
                           
                        </div>
                    </div>
                  
                </div>
                            <%
                            }
                            %>
            </div>
        </section>
        <!-- Product Details Section End -->

        <!-- Related Product Section Begin -->
      
        <!-- Related Product Section End -->

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