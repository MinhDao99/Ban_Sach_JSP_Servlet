
<%-- 
    Document   : index
    Created on : Aug 27, 2020, 11:35:48 PM
    Author     : Minh Dao
--%>

<%@page import="java.util.Vector"%>
<%@page import="model.clsCatagory"%>
<%@page import="model.clsProduct"%>
<%@page import="CSDLCustomer.tbProduct"%>
<%@page import="CSDLAdmin.tbProductAdmin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">

    <head>
        <meta charset="UTF-8">
        <meta name="description" content="Ogani Template">
        <meta name="keywords" content="Ogani, unica, creative, html">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>BookStore | MinhDao</title>

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
        <script type="text/javascript" src="js/jQuery-2.1.3.min.js"></script>
        <script type="text/javascript" src="ckeditor/ckeditor.js"></script>



    </head>

    <body>

        <%@include file="incl/header.jsp" %>
        <%@include file="incl/hero.jsp" %>
        <%request.setCharacterEncoding("utf-8");

            String md = "";
            if (request.getParameter("module") != null) {
                md = (String) request.getParameter("module");
            }
            if (md.equalsIgnoreCase("product")) {
        %>
        <jsp:include page="incl/product_Catalog.jsp"></jsp:include>
        <%
        } else if (md.equalsIgnoreCase("detail")) {
        %>
        <jsp:include page="incl/product_Detail.jsp"></jsp:include>
        <%
        } else if (md.equalsIgnoreCase("cart")) {
        %>
        <jsp:include page="incl/product_Cart.jsp"></jsp:include>
        <%
        } else if (md.equalsIgnoreCase("timkiem")) {
        %>
        <jsp:include page="incl/product_Search.jsp"></jsp:include>
        <%
        } else if (md.equalsIgnoreCase("checkout")) {
        %>
        <jsp:include page="incl/product_CheckOut.jsp"></jsp:include>
        <%
        } else {
        %>
        <jsp:include page="incl/product_Slide.jsp"></jsp:include>
        <jsp:include page="incl/product_home.jsp"></jsp:include>
            <div class="container">
                <div class="row">
                    <div class="latest-product__text">

                        <div class="row">
                        <jsp:include page="Pagani/Paganition.jsp"></jsp:include>
                        </div>
                    </div>
                </div>
            </div>
        <%            }
        %>
        <%@include file="incl/footer.jsp" %>

        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.nice-select.min.js"></script>
        <script src="js/jquery-ui.min.js"></script>
        <script src="js/jquery.slicknav.js"></script>
        <script src="js/mixitup.min.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/main.js"></script>
    </body>

</html>