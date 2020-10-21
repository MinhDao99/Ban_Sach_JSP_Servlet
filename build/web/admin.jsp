<%-- 
    Document   : admin
    Created on : Sep 7, 2020, 8:15:44 PM
    Author     : Minh Dao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Quản trị admin</title>
        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>

        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />    
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <link href="http://code.ionicframework.com/ionicons/2.0.0/css/ionicons.min.css" rel="stylesheet" type="text/css" />    
        <link href="dist/css/AdminLTE.min.css" rel="stylesheet" type="text/css" />
        <link href="dist/css/skins/_all-skins.min.css" rel="stylesheet" type="text/css" />
    </head>
    <body class="skin-blue">
        <div class="wrapper">

            <header class="main-header">


                <!-- Header Navbar: style can be found in header.less -->
                <nav class="navbar navbar-static-top" role="navigation">
                    <!-- Sidebar toggle button-->

                    <div class="navbar-custom-menu">
                        <ul class="nav navbar-nav">
                            <li class="dropdown user user-menu">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                    <img src="dist/img/user2-160x160.jpg" class="user-image" alt="User Image"/>
                                    <span class="hidden-xs"><%=session.getAttribute("useradmin")%></span>
                                </a>
                                <ul class="dropdown-menu">
                                    <!-- User image -->
                                    <li class="user-header">
                                        <img src="dist/img/user2-160x160.jpg" class="img-circle" alt="User Image" />
                                        <p>
                                            <a href="loginadmin.jsp" class="btn btn-default btn-flat">Sign out</a>
                                        </p>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </nav>
            </header>
            <!-- Left side column. contains the logo and sidebar -->
            <aside class="main-sidebar">
                <!-- sidebar: style can be found in sidebar.less -->
                <section class="sidebar">
                    <!-- Sidebar user panel -->
                    <div class="user-panel">
                        <div class="pull-left image">
                            <img src="dist/img/user2-160x160.jpg" class="img-circle" alt="User Image" />
                        </div>
                        <div class="pull-left info">
                            <p><%=session.getAttribute("useradmin")%></p>
                        </div>
                    </div>
                    <!-- sidebar menu: : style can be found in sidebar.less -->
                    <%@include file="incl_admin/menu.jsp" %>
                </section>
                <!-- /.sidebar -->
            </aside>

            <!-- Right side column. Contains the navbar and content of the page -->
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>
                        Quản lý
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li class="active">Dashboard</li>
                    </ol>
                </section>

                <!-- Main content -->
                <section class="content">
                    <%
                        String module = "";
                        if (request.getParameter("module") != null) {
                            module = request.getParameter("module");
                        }
                        if (module.equalsIgnoreCase("loaisach")) {

                    %>
                    <%@include file="incl_admin/Admin_main.jsp" %>
                    <%    } else if (module.equalsIgnoreCase("themloaisp")) {
                    %>
                    <%@include file="incl_admin/themloaisanpham.jsp" %>
                    <%
                    } else if (module.equalsIgnoreCase("DSSP")) {
                    %>
                    <%@include file="incl_admin/DSSP.jsp" %>
                    <%} else if (module.equalsIgnoreCase("themSP")) {
                    %>
                    <%@include file="incl_admin/themSP.jsp" %>
                    <%} else if (module.equalsIgnoreCase("SuaDulieu")) {
                    %>
                    <%@include file="incl_admin/SuaDuLieuLoaiSP.jsp" %>
                    <%}else if (module.equalsIgnoreCase("DSTKKH")) {
                    %>
                    <%@include file="incl_admin/TKKH.jsp" %>
                    <%} else if (module.equalsIgnoreCase("SuaDulieuSP")) {
                    %>
                    <%@include file="incl_admin/SuaDulieuSP.jsp" %>
                    <%} else if (module.equalsIgnoreCase("hoaDon")) {
                    %>
                    <%@include file="incl_admin/hoaDon.jsp" %>
                    <%}else if (module.equalsIgnoreCase("DSTKAdmin")) {
                    %>
                    <%@include file="incl_admin/TKAdmin.jsp" %>
                    <%}
                    %>
                </section><!-- /.Left col -->
                <!-- right col (We are only adding the ID to make the widgets sortable)-->

            </div><!-- /.row (main row) -->

        </section><!-- /.content -->
    </div><!-- /.content-wrapper -->

</div><!-- ./wrapper -->

<script src="js/jQuery-2.1.3.min.js"></script>
<script src="http://code.jquery.com/ui/1.11.2/jquery-ui.min.js" type="text/javascript"></script>
<script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>    
<script src="dist/js/app.min.js" type="text/javascript"></script>

</body>
</html>