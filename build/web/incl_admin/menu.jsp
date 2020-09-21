<%-- 
    Document   : menu
    Created on : Sep 7, 2020, 10:12:25 PM
    Author     : Minh Dao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<ul class="sidebar-menu">
    <li class="treeview">
        <a href="#">
            <i class="fa fa-table"></i> <span>Quản lý danh mục</span>
            <i class="fa fa-angle-left pull-right"></i>
        </a>
        <ul class="treeview-menu">
            <li><a href="admin.jsp?module=loaisach"><i class="fa fa-circle-o"></i> Loại sách</a></li>
            <li><a href="admin.jsp?module=themloaisp"><i class="fa fa-circle-o"></i> Thêm mới</a></li>
        </ul>
    </li>
    <li class="treeview">
        <a href="#">
            <i class="fa fa-table"></i> <span>Quản lý sản phẩm</span>
            <i class="fa fa-angle-left pull-right"></i>
        </a>
        <ul class="treeview-menu">
            <li><a href="admin.jsp?module=DSSP"><i class="fa fa-circle-o"></i> Danh sách sản phẩm</a></li>
            <li><a href="admin.jsp?module=themSP"><i class="fa fa-circle-o"></i> Thêm mới</a></li>
        </ul>
    </li>
    <li class="treeview">
        <a href="#">
            <i class="fa fa-table"></i> <span>Tài khoản khách hàng</span>
            <i class="fa fa-angle-left pull-right"></i>
        </a>
        <ul class="treeview-menu">
            <li><a href="admin.jsp?module=DSTKKH"><i class="fa fa-circle-o"></i> Danh sách</a></li>

        </ul>
    </li>
    <li class="treeview">
        <a href="#">
            <i class="fa fa-table"></i> <span>Tài khoản Admin và NV</span>
            <i class="fa fa-angle-left pull-right"></i>
        </a>
        <ul class="treeview-menu">
            <li><a href="admin.jsp?module=DSTKAdmin"><i class="fa fa-circle-o"></i> Danh sách</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> Thêm mới</a></li>


        </ul>
    </li>

</ul>