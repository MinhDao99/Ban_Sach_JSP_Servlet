package org.apache.jsp.incl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import CSDLCustomer.tbProduct;
import java.util.Vector;
import model.clsProduct;

public final class product_005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<section class=\"latest-product spad\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"latest-product__text\">\n");
      out.write("                <h4>Sách bán chạy</h4>\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    ");

//                        int first = 0, last = 0, pages = 1;
//                        if (request.getParameter("pages") != null) {
//                            pages = (int) Integer.parseInt(request.getParameter("pages"));
//                        }
//
//                        int total = new tbProduct().getCount();
                        // Vector<clsProduct> dsSP = new Vector<clsProduct>();
                        Vector<clsProduct> dsSP = (Vector<clsProduct>) session.getAttribute("list");
                        if (dsSP == null || dsSP.isEmpty()) {
                    
      out.write("\n");
      out.write("                    <h3>Chưa có </h3>\n");
      out.write("                    ");

                    } else {
//                        if (total <= 8) {
//                            first = 0;
//                            last = total;
//                        } else {
//                            first = (pages - 1) * 8;
//                            last = 8;
//                        }
                        //  tbProduct.LayDuLieuACus(dsSP);
                        //  tbProduct.LayDuLieuACus(dsSP);
                        DecimalFormat formatter = new DecimalFormat("###,###,###");
                        for (clsProduct p : dsSP) {
                            String img = "noimage.jpg";
                            if (p.getHinhAnh() != null && p.getHinhAnh().equals("") == false) {
                                img = p.getHinhAnh();
                            }

                    
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                        <div class=\"products\">\n");
      out.write("                            <div class=\"thumbnail\"><a href=\"index.jsp?module=detail&id=");
      out.print(p.getIdproducts());
      out.write("&masach=");
      out.print(p.getId());
      out.write("\"><img style=\"height: 200px;width: 100%\" src=\"Uploads/");
      out.print(img);
      out.write("\" alt=\"Product Name\"></a></div>\n");
      out.write("                            <div class=\"productname\">");
      out.print(p.getTensp());
      out.write("</div>\n");
      out.write("                            <h4 class=\"price\">$");
      out.print(formatter.format(Integer.parseInt(p.getGiaSP())));
      out.write("</h4>\n");
      out.write("                            <div class=\"button_group\"><button class=\"button add-cart\" type=\"button\"><a href=\"Cart_add?id=");
      out.print(p.getId());
      out.write("\">Thêm vào giở hàng</a></button></div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");

                            }
                        }

                    
      out.write("\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Pagani/Paganition.jsp", out, false);
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</section>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
