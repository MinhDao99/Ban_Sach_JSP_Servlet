package org.apache.jsp.incl_005fadmin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import CSDL.tbProduct;
import java.util.Vector;
import model.Product;

public final class Admin_005fmain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-xs-12\">\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <div class=\"box-header\">\n");
      out.write("                <div class=\"box-tools\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input type=\"text\" name=\"table_search\" class=\"form-control input-sm pull-right\" style=\"width: 150px;\" placeholder=\"Search\"/>\n");
      out.write("                        <div class=\"input-group-btn\">\n");
      out.write("                            <button class=\"btn btn-sm btn-default\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div><!-- /.box-header -->\n");
      out.write("            <div class=\"box-body table-responsive no-padding\">\n");
      out.write("                <table class=\"table table-hover\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>STT</th>\n");
      out.write("                        <th>Tên loại sách</th>\n");
      out.write("                        <th>Trạng thái</th>\n");
      out.write("                        <th>Thao tác</th>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        Vector<Product> ds = new Vector<Product>();
                        Product pro = new Product();
                        tbProduct.GetProductAdmin(ds);
                        int dem = 0;
                        for (Product p : ds) {
                            dem++;

                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(dem);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(p.getTen());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(p.isTrangthai()?"Đang bán":"Đang không bán");
      out.write("</td>\n");
      out.write("\n");
      out.write("                        <th><input type=\"submit\" name=\"fix\" id=\"fix\" value=\"Sửa\">\n");
      out.write("                            <a href=\"DoiTrangThaiLoaiSP?id=");
      out.print(p.getId());
      out.write("&tt=");
      out.print(p.gettrangthai());
      out.write("\"><input type=\"submit\" name=\"show\" id=\"show\" value=\"Đổi trạng thái\"></a></th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
    }
                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div><!-- /.box-body -->\n");
      out.write("        </div><!-- /.box -->\n");
      out.write("    </div>\n");
      out.write("</div>");
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
