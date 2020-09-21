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
                        Vector<ListProduct> dsSP = new Vector<ListProduct>();
                        tbProduct.LayDuLieuACus(dsSP);
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
                            <div class="button_group"><button class="button add-cart" type="button"><a href="XuLyCart?id=<%=p.getId()%>">Add To Cart</a></button></div>

                        </div>
                    </div>
                    <%
                        }

                    %>
                </div>
            </div>

        </div>
    </div>
</section>