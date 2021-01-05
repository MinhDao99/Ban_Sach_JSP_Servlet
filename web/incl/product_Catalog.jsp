<%-- 
    Document   : futureProduct
    Created on : Aug 28, 2020, 12:11:45 AM
    Author     : Minh Dao
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.Vector"%>
<%@page import="javafx.scene.control.Alert"%>
<%@page import="model.clsProduct"%>
<%@page import="CSDLCustomer.tbProduct"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<section class="featured spad">
    <div class="container">
        <div class="section-title">
            <h2> Sách theo thể loại</h2>
        </div>
        <div class="row">
            <%
                int catid = Integer.parseInt(request.getParameter("id"));
                Vector<clsProduct> dsSP = new Vector<clsProduct>();
                tbProduct.LayDuLieu(catid, dsSP);
                DecimalFormat formatter = new DecimalFormat("###,###,###");
                for (clsProduct p : dsSP) {
                    String img = "noimage.jpg";
                    if (p.getHinhAnh() != null && p.getHinhAnh().equals("") == false) {
                        img = p.getHinhAnh();
                    }

            %>

            <div class="col-md-3 col-sm-6">
                <div class="products">
                    <div class="thumbnail"><a href="index.jsp?module=detail&id=<%=catid%>&masach=<%=p.getId()%>"><img style="height: 200px;width: 100%" src="Uploads/<%=img%>" alt="Product Name"></a></div>
                    <div class="productname"><%=p.getTensp()%></div>
                    <h4 class="price">$<%=formatter.format(Integer.parseInt(p.getGiaSP()))%></h4>

                    <div class="button_group"><button class="button add-cart" type="button"> <a href="Cart_add?id=<%=p.getId()%>">Thêm vào giỏ hàng</a></button></div>
                </div>
            </div>
            <%
                }

            %>
        </div>

    </div>
</section>