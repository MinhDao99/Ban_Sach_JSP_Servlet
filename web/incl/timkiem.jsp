<%-- 
    Document   : futureProduct
    Created on : Aug 28, 2020, 12:11:45 AM
    Author     : Minh Dao
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.Vector"%>
<%@page import="javafx.scene.control.Alert"%>
<%@page import="model.ListProduct"%>
<%@page import="CSDLCustomer.tbProduct"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<section class="featured spad">
    <div class="container">
        <div class="section-title">
            <h2> Search by name</h2>
        </div>
        <div class="row">
            <%
                request.setCharacterEncoding("utf-8");

                String name = request.getParameter("search");
                Vector<ListProduct> list = new Vector<ListProduct>();
                tbProduct tb = new tbProduct();
                tb.Search(name, list);
                DecimalFormat format = new DecimalFormat("###,###,###");
                for (ListProduct p : list) {
                    String img = "noimage.jpg";
                    if (p.getHinhAnh() != null && p.getHinhAnh().equals("") == false) {
                        img = p.getHinhAnh();
                    }

            %>

            <div class="col-md-3 col-sm-6">
                <div class="products">
                    <div class="thumbnail"><a href="index.jsp?module=detail&id=<%=p.getIdproducts()%>&masach=<%=p.getId()%>"><img style="height: 200px;width: 100%" src="Uploads/<%=img%>" alt="Product Name"></a></div>
                    <div class="productname"><%=p.getTensp()%></div>
                    <h4 class="price">$<%=format.format(Integer.parseInt(p.getGiaSP()))%></h4>

                    <div class="button_group" ><button class="button add-cart" type="button">Add To Cart</button><button class="button compare" type="button"> <a href="FixDaTa.jsp?id=<%=p.getId()%>"><i class="fa fa-pencil"></i></button><button class="button wishlist" type="button"><a href="XuLyXoa?id=<%=p.getId()%>"><i class="fa fa-ban"></i></a></</button></div>
                </div>
            </div>
            <%
                }

            %>
        </div>

    </div>
</section>