<%-- 
    Document   : hero
    Created on : Aug 28, 2020, 2:52:53 PM
    Author     : Minh Dao
--%>

<%@page import="model.Product"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
  <section class="hero">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-3">
                            <div class="hero__categories">
                                <ul>
                                    <%
                                       
                                        Vector<Product> ds = new Vector<Product>();
                                        int kq = CSDLCustomer.tbProduct.GetProduct(ds);
                                        if (kq == 0) {


                                    %>
                                    <li><a href="#">No product</a></li>
                                        <%                        } else if (kq > 0) {
                                            for (Product p : ds) {
                                        %>
                                    <li><a href="index.jsp?module=product&id=<%=p.getId()%>"><%=p.getTen()%></a></li>

                                    <%
                                            }
                                        }
                                    %>
                                </ul>
                            </div>
                        </div>
                        <div class="col-lg-9">
                            <div class="hero__search">
                                <div class="hero__search__form">
                                    <form action="index.jsp?module=timkiem" method="post">
                                       
                                        <input type="text" name="search" placeholder="Tìm kiếm sách của bạn ở đây  -> ">
                                        <button type="submit" class="site-btn">SEARCH</button>
                                    </form>
                                </div>
                                <div class="hero__search__phone">
                                    <div class="hero__search__phone__icon">
                                        <i class="fa fa-phone"></i>
                                    </div>
                                    <div class="hero__search__phone__text">
                                        <h5>(+84) 0327 614 768</h5>
                                        <span>support 24/7 time</span>
                                    </div>
                                </div>
                            </div>
                            <div class="hero__item set-bg" data-setbg="img/hero/bannerr.jpg">
                                <div class="hero__text">
                                    <span>BOOK STORE</span>
                                    <h2>BOOK <br />100% REAL</h2>
                                    
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>