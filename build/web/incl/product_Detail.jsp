<%-- 
    Document   : shopdetails
    Created on : Aug 27, 2020, 11:39:16 PM
    Author     : Minh Dao
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="CSDLCustomer.tbProduct"%>
<%@page import="model.clsProduct"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <body>
        <section class="product-details spad">
            <div class="container">
                <%
                    int Detailid = Integer.parseInt(request.getParameter("masach"));
                    Vector<clsProduct> ds = new Vector<clsProduct>();
                    int kq = tbProduct.GetDetail(Detailid, ds);
                    DecimalFormat formatter = new DecimalFormat("###,###,###");
                    for (clsProduct p : ds) {
                        String img = "noimage.jpg";
                        if (p.getHinhAnh() != null && p.getHinhAnh().equals("") == false) {
                            img = p.getHinhAnh();
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

                            <div class="button_group"><button class="button add-cart" type="button"> <a href="Cart_add?id=<%=p.getId()%>">Thêm vào giỏ hàng</a></button></div>


                        </div>
                    </div>

                </div>
                <%
                    }
                %>
            </div>
        </section>
       


    </body>

</html>