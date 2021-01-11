package org.apache.jsp.EXPORT;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.clsHoaDon;
import model.clsChiTietHoaDon;
import CSDLCustomer.tbHoaDon;
import java.text.DecimalFormat;
import model.clsProduct;
import CSDLAdmin.tbProductAdmin;
import java.util.Vector;

public final class ex_005fBill_005fDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<table>\n");
      out.write("    <br>\n");
      out.write("    <tr>\n");
      out.write("        <th>STT</th>\n");
      out.write("        <th>Mã hóa đơn</th>\n");
      out.write("        <th>TÊN </th>\n");
      out.write("        <th>ĐỊA CHỈ</th>\n");
      out.write("        <th>THÀNH PHỐ</th>\n");
      out.write("        <th>SĐT </th>\n");
      out.write("        <th>NGÀY ĐẶT</th>\n");
      out.write("        <th>TÊN SẢN PHẨM</th>\n");
      out.write("        <th>Số lượng </th>\n");
      out.write("        <th>GHI CHÚ</th>\n");
      out.write("        <th>THÀNH TIỀN</th>\n");
      out.write("        <th>TRẠNG THÁI</th>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </tr>\n");
      out.write("    ");

        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "inline;filename=HoaDon.xls");
        Vector<clsHoaDon> dshd = new Vector<clsHoaDon>();
//        Vector<clsChiTietHoaDon> dscthd = (Vector<clsChiTietHoaDon>) session.getAttribute("export");
        Vector<clsChiTietHoaDon> dscthd = new Vector<clsChiTietHoaDon>();
        clsHoaDon hd = new clsHoaDon();
        CSDLAdmin.tbhoaDon.GetData(dshd);
        String trangthai = "";
        int dem = 0;
        for (clsHoaDon p : dshd) {
            CSDLAdmin.tbChiTietHoaDon.DanhSachChiTietHD(p.getId(), dscthd);
            for (clsChiTietHoaDon p1 : dscthd) {
                dem++;
                clsProduct sp = new clsProduct();
                tbProductAdmin.GetOneProduct(p1.getidsp(), sp);
                if (p.getStatus() == 0) {
                    trangthai = "Mới";
                } else if (p.getStatus() == 1) {
                    trangthai = "Đã duyệt";

                } else if (p.getStatus() == 2) {
                    trangthai = "Đã thanh toán";

                } else {
                    trangthai = "Đã hủy";

                }
    
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td>");
      out.print(dem);
      out.write("</td>\n");
      out.write("        <td>");
      out.print(p.getId());
      out.write("</td>\n");
      out.write("        <td style=\"width: 100px\">");
      out.print(p.getLastName());
      out.write("</td>\n");
      out.write("        <td style=\"width: 100px\">");
      out.print(p.getAddress());
      out.write("</td>\n");
      out.write("        <td style=\"width: 100px\">");
      out.print(p.getTown());
      out.write("</td>\n");
      out.write("        <td style=\"width: 100px\">");
      out.print(p.getPhone());
      out.write("</td>\n");
      out.write("        <td style=\"width: 100px\">");
      out.print(p.getOderDate());
      out.write("</td>\n");
      out.write("        <td style=\"width: 100px\">");
      out.print(sp.getTensp());
      out.write("</td>\n");
      out.write("        <td style=\"width: 100px\">");
      out.print(p1.getSoluong());
      out.write("</td>\n");
      out.write("        <td style=\"width: 100px\">");
      out.print(p.getOrderNote());
      out.write("</td>\n");
      out.write("        <td>");
      out.print(String.format("%,d", CSDLAdmin.tbChiTietHoaDon.TongTienHoaDonChiTiet(p1.getidsp())));
      out.write("</td>\n");
      out.write("        <td style=\"width: 100px\">");
      out.print(trangthai);
      out.write("</td>\n");
      out.write("\n");
      out.write("    </tr>\n");
      out.write("    ");
    }
        }
    
      out.write("\n");
      out.write("</table>\n");
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
