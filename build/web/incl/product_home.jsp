<%-- 
    Document   : LatestProduct
    Created on : Aug 28, 2020, 11:16:26 PM
    Author     : Minh Dao
--%>

<%@page import="CSDLCustomer.tbView"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="CSDLCustomer.tbProduct"%>
<%@page import="java.util.Vector"%>
<%@page import="model.clsProduct"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<section class="latest-product spad">
    <div class="container">
        <div class="row">
            <div class="latest-product__text">
                <h4>Sách bán chạy</h4>
                <div class="row">

                    <%
                        tbView viewDAO = new tbView();
                        if (session.isNew()) {
                            viewDAO.updateView();
                        }
                        Vector<clsProduct> dsSP = (Vector<clsProduct>) session.getAttribute("list1");
                        if (dsSP == null || dsSP.isEmpty()) {
                    %>
                    <h3>Chưa có </h3>
                    <%
                    } else {
                        DecimalFormat formatter = new DecimalFormat("###,###,###");
                        for (clsProduct p : dsSP) {
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
                            <div class="button_group"><button class="button add-cart" type="button"><a href="Cart_add?id=<%=p.getId()%>">Thêm vào giở hàng</a></button></div>

                        </div>
                    </div>
                    <%
                            }
                        }

                    %>
                    <%--<jsp:include page="../Pagani/Paganition.jsp"></jsp:include>--%>
                </div>

            </div>

        </div>
    </div>

</section>