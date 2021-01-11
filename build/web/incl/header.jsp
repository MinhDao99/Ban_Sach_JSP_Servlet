<%-- 
    Document   : header
    Created on : Aug 27, 2020, 11:54:00 PM
    Author     : Minh Dao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<header class="header">
    <div class="header__top">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-md-6">
                    <div class="header__top__left">
                        <ul>
                            <li><i class="fa fa-envelope"></i> dao.d.minh.190299@gmail.com | 
                            Miễn phí vận chuyển cho đơn hàng trên 200,000VNĐ</li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-6 col-md-6">
                    <div class="header__top__right">
                        
                        <div class="header__top__right__auth">
                            <%
                                String tk = (String) session.getAttribute("user");
                                if (tk == null) {
                            %>
                            <a href="Login_home.jsp"><i class="fa fa-user"></i> Login</a>
                            <%
                            } else{ 
                            %>
                            <a href="Login_home.jsp"><i class="fa fa-user"></i> <%=tk%></a>
                            <%
                                }
                            %>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-lg-3">
                <div class="header__logo">
                    <a href="index.jsp"><img src="img/logobyminh1.png" alt=""></a>
                </div>
            </div>
            <div class="col-lg-6">
                
            </div>
            <div class="col-lg-3">
                <div class="header__cart">
                    <ul>
                        <li><a href="#"><i class="fa fa-heart"></i></a></li>
                        <li><a href="index.jsp?module=cart"><i class="fa fa-shopping-bag"></i></a></li>
                    </ul>
                    
                </div>
            </div>
        </div>
        <div class="humberger__open">
            <i class="fa fa-bars"></i>
        </div>
    </div>
</header>
