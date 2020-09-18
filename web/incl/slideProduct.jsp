<%-- 
    Document   : slideProduct
    Created on : Aug 30, 2020, 2:54:34 PM
    Author     : Minh Dao
--%>

<%@page import="model.ImageSlide"%>
<%@page import="model.ListProduct"%>
<%@page import="model.Product"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<section class="categories">
    <div class="container">
        <div class="row">

            <div class="categories__slider owl-carousel">
                <%
                    Vector<ImageSlide> ds = new Vector<ImageSlide>();
                    int kq = CSDL.tbProduct.GetAllProduct(ds);
                    if (kq == -1)
                        out.println("<h3>Lỗi kết nối CSDL</h3>");
                    else if (kq == -2)
                        out.println("<h3>Lỗi SQL</h3>");
                    else if (kq == 0)
                        out.println("<h3>Chưa có dữ liệu</h3>");
                    else {
                        for (ImageSlide p : ds) {
                            String img = "noimage.jpg";
                            if (p.getHinhAnh() != null && p.getHinhAnh().equals("") == false) {
                                img = p.getHinhAnh();
                            }

                %>
                <div class="products">
                    <div class="thumbnail"><img style="height: 200px;width: 100%" src="Uploads/<%=img%>" alt="Product Name"></div>

                </div>
                <%
                        }
                    }
                %>
            </div>
        </div>
    </div>
</section>