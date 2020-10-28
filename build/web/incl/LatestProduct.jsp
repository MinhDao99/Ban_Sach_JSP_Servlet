<%-- 
    Document   : LatestProduct
    Created on : Aug 28, 2020, 11:16:26 PM
    Author     : Minh Dao
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="CSDLCustomer.tbProduct"%>
<%@page import="java.util.Vector"%>
<%@page import="model.ListProduct"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<section class="latest-product spad">
    <div class="container">
        <div class="row">
            <div class="latest-product__text">
                <h4>Hot books</h4>
                <div class="row">
                    <%
                        int first = 0, last = 0, pages = 1;
                        if (request.getParameter("pages") != null) {
                            pages = (int) Integer.parseInt(request.getParameter("pages"));
                        }

                        int total = new tbProduct().getCount();
                        Vector<ListProduct> dsSP = new Vector<ListProduct>();
                        if (total <= 8) {
                            first = 0;
                            last = total;
                        } else {
                            first = (pages - 1) * 8;
                            last = 8;
                        }
                        //  tbProduct.LayDuLieuACus(dsSP);
                        tbProduct.LayDuLieuACus(dsSP, first, last);
                        DecimalFormat formatter = new DecimalFormat("###,###,###");
                        for (ListProduct p : dsSP) {
                            String img = "noimage.jpg";
                            if (p.getHinhAnh() != null && p.getHinhAnh().equals("") == false) {
                                img = p.getHinhAnh();
                            }

                    %>

                    <div class="col-md-3 col-sm-6">
                        <div class="products">
                            <div class="thumbnail"><a href="index.jsp?module=detail&id=<%=p.getIdproducts()%>&masach=<%=p.getId()%>"><img style="height: 200px;width: 100%" src="Uploads/<%=img%>" alt="Product Name"></a></div>
                            <div class="productname"><%=p.getTensp()%></div>
                            <h4 class="price">$<%=formatter.format(Integer.parseInt(p.getGiaSP()))%></h4>
                            <div class="button_group"><button class="button add-cart" type="button"><a href="Cart_add?id=<%=p.getId()%>">Add To Cart</a></button></div>

                        </div>
                    </div>
                    <%
                        }

                    %>
                </div>
                    <jsp:include page="Paganition.jsp"></jsp:include>
            </div>

        </div>
    </div>

</section>