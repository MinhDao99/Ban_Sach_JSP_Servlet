package org.apache.jsp.incl_005fadmin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import CSDL.tbProduct;
import java.util.Vector;
import model.Product;

public final class themloaisanpham_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                        <th>Tên loại sách</th>\n");
      out.write("                        <th>Thao tác</th>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <form id=\"FDK\" action=\"Xulydangky\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                    <table border=\"0\" align=\"center\" >\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <input  class=\"hienthi\" type=\"text\" name=\"email\" id=\"email\" placeholder=\"   Email\"/>\n");
      out.write("\n");
      out.write("                                <br /><br />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <input  class=\"hienthi\" type=\"password\" name=\"Password\" id=\"Password\" placeholder=\"   Password\"/>\n");
      out.write("                                <br /><br />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <input  class=\"hienthi\" type=\"password\" name=\"nhaplaimatkhau\" id=\"nhaplaimatkhau\" placeholder=\"   Nhập lại password\"/>\n");
      out.write("                                <br /><br />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <input  class=\"hienthi\" type=\"text\" name=\"hoten\" id=\"hoten\" placeholder=\"   Họ tên\"/>\n");
      out.write("                                <br /><br />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <input class=\"hienthi\" type=\"text\" name=\"tenhienthi\" id=\"tenhienthi\" placeholder=\"   Tên hiển thị\"/>\n");
      out.write("                                <br /><br />\n");
      out.write("\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <input class=\"hienthi\" type=\"text\" name=\"sdt\" id=\"sdt\" placeholder=\"   Số điện thoại\"/>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <input class=\"hienthi\" type=\"file\" name=\"fAnh\" id=\"fAnh\">\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <input class=\"checkbox\" type=\"checkbox\" name=\"dieukhoan\" id=\"dieukhoan\" checked/>\n");
      out.write("                                Tối đồng ý với <a href=\"#\">Điều khoản dịch vụ</a> và <a href=\"#\">Chính sách bảo mật</a> \n");
      out.write("                                <br /><br />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"2\" align=\"center\">\n");
      out.write("                                <input  type=\"submit\" id=\"DangKyNgay\" name=\"DangKyNgay\" value=\"Đăng ký ngay\" style=\"width:100%;height:40px;background-color:red;border-radius:10px;\"/>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("           \n");
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
