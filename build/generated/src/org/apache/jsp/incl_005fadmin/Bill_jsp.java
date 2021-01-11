package org.apache.jsp.incl_005fadmin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import CSDLCustomer.tbHoaDon;
import model.clsHoaDon;
import java.text.DecimalFormat;
import java.util.Vector;

public final class Bill_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<script language=\"javascript\">\n");
      out.write("    function DoiTT(mahd, tthientai, sTatus)\n");
      out.write("    {\n");
      out.write("        ttmoi = parseInt(sTatus.value);\n");
      out.write("        if (tthientai == ttmoi)\n");
      out.write("        {\n");
      out.write("            return false\n");
      out.write("        }\n");
      out.write("        if ((tthientai == 0)\n");
      out.write("                || (tthientai == 1 && (ttmoi == 2 || ttmoi == 3))\n");
      out.write("                || (tthientai == 3 && (ttmoi == 1 || ttmoi == 2)))\n");
      out.write("        {\n");
      out.write("            window.location.href = \"DoiTrangThaiHoaDon?mahd=\" + mahd + \"&tthientai=\" + tthientai + \"&ttmoi=\" + ttmoi;\n");
      out.write("\n");
      out.write("\n");
      out.write("        } else {\n");
      out.write("            alert(\"Không được phép đổi\");\n");
      out.write("            sTatus.value = tthientai;\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-xs-12\">\n");
      out.write("        <div class=\"box\">\n");
      out.write("\n");
      out.write("            <div class=\"box-body table-responsive no-padding\">\n");
      out.write("                <table class=\"table table-hover\">\n");
      out.write("                    <br>\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <th>STT</th>\n");
      out.write("                        <th>TÊN ĐỆM</th>\n");
      out.write("                        <th>TÊN </th>\n");
      out.write("                        <th>ĐỊA CHỈ</th>\n");
      out.write("                        <th>THÀNH PHỐ</th>\n");
      out.write("                        <th>SĐT </th>\n");
      out.write("                        <th>EMAIL</th>\n");
      out.write("                        <th>GHI CHÚ</th>\n");
      out.write("                        <th>NGÀY ĐẶT</th>\n");
      out.write("                        <th>TỔNG TIỀN</th>\n");
      out.write("                        <th>TRẠNG THÁI</th>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        Vector<clsHoaDon> ds = new Vector<clsHoaDon>();
                        clsHoaDon hd = new clsHoaDon();
                        CSDLAdmin.tbhoaDon.GetData(ds);
                        int dem = 0;
                        for (clsHoaDon p : ds) {
                            dem++;
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td><a href=\"admin.jsp?module=chitiethoadon&mahd=");
      out.print(p.getId());
      out.write('"');
      out.write('>');
      out.print(dem);
      out.write("</a></td>\n");
      out.write("                        <td style=\"width: 100px\">");
      out.print(p.getFirstName());
      out.write("</td>\n");
      out.write("                        <td style=\"width: 100px\">");
      out.print(p.getLastName());
      out.write("</td>\n");
      out.write("                        <td style=\"width: 100px\">");
      out.print(p.getAddress());
      out.write("</td>\n");
      out.write("                        <td style=\"width: 100px\">");
      out.print(p.getTown());
      out.write("</td>\n");
      out.write("                        <td style=\"width: 100px\">");
      out.print(p.getPhone());
      out.write("</td>\n");
      out.write("                        <td style=\"width: 100px\">");
      out.print(p.getEmail());
      out.write("</td>\n");
      out.write("                        <td style=\"width: 100px\">");
      out.print(p.getOrderNote());
      out.write("</td>\n");
      out.write("                        <td style=\"width: 100px\">");
      out.print(p.getOderDate());
      out.write("</td>\n");
      out.write("\n");
      out.write("                        <td>");
      out.print(String.format("%,d", CSDLAdmin.tbChiTietHoaDon.TongTienHoaDon(p.getId())));
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                            <select name=\"sTatus\" id=\"sTatus\" onchange=\"return DoiTT(");
      out.print(p.getId());
      out.write(',');
      out.print(p.getStatus());
      out.write(", this);\" >\n");
      out.write("                                <option value=\"0\" ");
      out.print((p.getStatus() == 0) ? "selected" : "");
      out.write(">Mới</option>\n");
      out.write("                                <option value=\"1\" ");
      out.print((p.getStatus() == 1) ? "selected" : "");
      out.write(">Đã duyệt</option>\n");
      out.write("                                <option value=\"2\" ");
      out.print((p.getStatus() == 2) ? "selected" : "");
      out.write(">Đã thanh toán</option>\n");
      out.write("                                <option value=\"3\" ");
      out.print((p.getStatus() == 3) ? "selected" : "");
      out.write(">Hủy</option>\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
    }
                    
      out.write("\n");
      out.write("                    <td colspan=\"6\" align=\"center\"><a href=\"EXPORT/ex_Bill_Detail.jsp\">Export</a></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("                <form action=\"reportInvoice\" method=\"POST\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"6\" align=\"center\"><a href=\"reportInvoice.jsp\">Print Invoice</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                </form>\n");
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
