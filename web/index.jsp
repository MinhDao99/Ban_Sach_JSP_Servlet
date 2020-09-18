<%-- 
    Document   : index
    Created on : Aug 27, 2020, 11:35:48 PM
    Author     : Minh Dao
--%>

<%@page import="java.util.Vector"%>
<%@page import="model.Product"%>
<%@page import="model.ListProduct"%>
<%@page import="CSDL.tbProduct"%>
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

        <%@include file="incl/header.jsp" %>
        <%@include file="incl/hero.jsp" %>



        <%            request.setCharacterEncoding("utf-8");

            String md = "";
            if (request.getParameter("module") != null) {
                md = (String) request.getParameter("module");
            }
            if (md.equalsIgnoreCase("product")) {
        %>
        <jsp:include page="incl/futureProduct.jsp"></jsp:include>
        <%
        } else if (md.equalsIgnoreCase("detail")) {
        %>
        <jsp:include page="shopdetails.jsp"></jsp:include>
        <%
        } else if (md.equalsIgnoreCase("contact")) {
        %>
        <jsp:include page="contact.jsp"></jsp:include>
        <%
        } else if (md.equalsIgnoreCase("cart")) {
        %>
        <jsp:include page="shopingcart.jsp"></jsp:include>
        <%
        } else if (md.equalsIgnoreCase("timkiem")) {
        %>
        <jsp:include page="incl/timkiem.jsp"></jsp:include>
        <%
        } else {
        %>
        <jsp:include page="incl/slideProduct.jsp"></jsp:include>
        <jsp:include page="incl/LatestProduct.jsp"></jsp:include>

        <%            }
        %>
        <%@include file="incl/footer.jsp" %>
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