package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import CSDLAdmin.tbProductAdmin;
import java.util.Vector;
import model.clsCatagory;
import java.text.DecimalFormat;
import model.clsProduct;
import CSDLAdmin.tbProductAdmin;
import java.util.Vector;
import CSDLAdmin.tbProductAdmin;
import java.util.Vector;
import model.clsCatagory;
import CSDLAdmin.tbProductAdmin;
import java.util.Vector;
import model.clsCatagory;
import model.clsChiTietHoaDon;
import CSDLCustomer.tbHoaDon;
import java.text.DecimalFormat;
import model.clsProduct;
import CSDLAdmin.tbProductAdmin;
import java.util.Vector;
import CSDLAdmin.tbUserAdmin;
import model.cls_Account_Customer;
import java.text.DecimalFormat;
import java.util.Vector;
import model.clsProduct;
import CSDLAdmin.tbProductAdmin;
import java.util.Vector;
import model.clsCatagory;
import CSDLCustomer.tbHoaDon;
import model.clsHoaDon;
import java.text.DecimalFormat;
import java.util.Vector;
import model.cls_Account_Admin;
import CSDLAdmin.tbUserAdmin;
import java.text.DecimalFormat;
import java.util.Vector;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(11);
    _jspx_dependants.add("/incl_admin/hero.jsp");
    _jspx_dependants.add("/incl_admin/Catalog.jsp");
    _jspx_dependants.add("/incl_admin/Catalog_add.jsp");
    _jspx_dependants.add("/incl_admin/Product.jsp");
    _jspx_dependants.add("/incl_admin/Product_add.jsp");
    _jspx_dependants.add("/incl_admin/Catalog_Update.jsp");
    _jspx_dependants.add("/incl_admin/Bill_Detail.jsp");
    _jspx_dependants.add("/incl_admin/Account_Customer.jsp");
    _jspx_dependants.add("/incl_admin/Product_Update.jsp");
    _jspx_dependants.add("/incl_admin/Bill.jsp");
    _jspx_dependants.add("/incl_admin/Account_Admin.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Quản trị admin</title>\n");
      out.write("        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>\n");
      out.write("\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />    \n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"http://code.ionicframework.com/ionicons/2.0.0/css/ionicons.min.css\" rel=\"stylesheet\" type=\"text/css\" />    \n");
      out.write("        <link href=\"dist/css/AdminLTE.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"dist/css/skins/_all-skins.min.css\" rel=\"stylesheet\" type=\"text/css\" \n");
      out.write("        <script src=\"js/jQuery-2.1.3.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"ckeditor/ckeditor.js\"></script>\n");
      out.write("        \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"skin-blue\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("\n");
      out.write("            <header class=\"main-header\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- Header Navbar: style can be found in header.less -->\n");
      out.write("                <nav class=\"navbar navbar-static-top\" role=\"navigation\">\n");
      out.write("                    <!-- Sidebar toggle button-->\n");
      out.write("\n");
      out.write("                    <div class=\"navbar-custom-menu\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            <li class=\"dropdown user user-menu\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                    <img src=\"dist/img/user2-160x160.jpg\" class=\"user-image\" alt=\"User Image\"/>\n");
      out.write("                                    <span class=\"hidden-xs\">");
      out.print(session.getAttribute("useradmin"));
      out.write("</span>\n");
      out.write("                                </a>\n");
      out.write("                                <ul class=\"dropdown-menu\">\n");
      out.write("                                    <!-- User image -->\n");
      out.write("                                    <li class=\"user-header\">\n");
      out.write("                                        <img src=\"dist/img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\" />\n");
      out.write("                                        <p>\n");
      out.write("                                            <a href=\"Account_Admin_Login.jsp\" class=\"btn btn-default btn-flat\">Sign out</a>\n");
      out.write("                                        </p>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </header>\n");
      out.write("            <!-- Left side column. contains the logo and sidebar -->\n");
      out.write("            <aside class=\"main-sidebar\">\n");
      out.write("                <!-- sidebar: style can be found in sidebar.less -->\n");
      out.write("                <section class=\"sidebar\">\n");
      out.write("                    <!-- Sidebar user panel -->\n");
      out.write("                    <div class=\"user-panel\">\n");
      out.write("                        <div class=\"pull-left image\">\n");
      out.write("                            <img src=\"dist/img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"pull-left info\">\n");
      out.write("                            <p>");
      out.print(session.getAttribute("useradmin"));
      out.write("</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- sidebar menu: : style can be found in sidebar.less -->\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<ul class=\"sidebar-menu\">\n");
      out.write("    <li class=\"treeview\">\n");
      out.write("        <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-table\"></i> <span>Quản lý danh mục</span>\n");
      out.write("            <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("        </a>\n");
      out.write("        <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"admin.jsp?module=loaisach\"><i class=\"fa fa-circle-o\"></i> Loại sách</a></li>\n");
      out.write("            <li><a href=\"admin.jsp?module=themloaisp\"><i class=\"fa fa-circle-o\"></i> Thêm mới</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"treeview\">\n");
      out.write("        <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-table\"></i> <span>Quản lý sản phẩm</span>\n");
      out.write("            <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("        </a>\n");
      out.write("        <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"admin.jsp?module=DSSP\"><i class=\"fa fa-circle-o\"></i> Danh sách sản phẩm</a></li>\n");
      out.write("            <li><a href=\"admin.jsp?module=themSP\"><i class=\"fa fa-circle-o\"></i> Thêm mới</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"treeview\">\n");
      out.write("        <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-table\"></i> <span>Quản lý hóa đơn</span>\n");
      out.write("            <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("        </a>\n");
      out.write("        <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"?module=hoaDon\"><i class=\"fa fa-circle-o\"></i> Danh sách</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"treeview\">\n");
      out.write("        <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-table\"></i> <span>Tài khoản khách hàng</span>\n");
      out.write("            <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("        </a>\n");
      out.write("        <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"admin.jsp?module=DSTKKH\"><i class=\"fa fa-circle-o\"></i> Danh sách</a></li>\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"treeview\">\n");
      out.write("        <a href=\"#\">\n");
      out.write("            <i class=\"fa fa-table\"></i> <span>Tài khoản Admin và NV</span>\n");
      out.write("            <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("        </a>\n");
      out.write("        <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"admin.jsp?module=DSTKAdmin\"><i class=\"fa fa-circle-o\"></i> Danh sách</a></li>\n");
      out.write("            <li><a href=\"Account_Admin_Resgister.jsp\"><i class=\"fa fa-circle-o\"></i> Thêm mới</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("    </li>\n");
      out.write("\n");
      out.write("</ul>");
      out.write("\n");
      out.write("                </section>\n");
      out.write("                <!-- /.sidebar -->\n");
      out.write("            </aside>\n");
      out.write("\n");
      out.write("            <!-- Right side column. Contains the navbar and content of the page -->\n");
      out.write("            <div class=\"content-wrapper\">\n");
      out.write("                <!-- Content Header (Page header) -->\n");
      out.write("                <section class=\"content-header\">\n");
      out.write("                    <h1>\n");
      out.write("                        Quản lý\n");
      out.write("                    </h1>\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                        <li><a href=\"admin.jsp\"><i class=\"fa fa-dashboard\"></i> Home</a></li>\n");
      out.write("\n");
      out.write("                    </ol>\n");
      out.write("                </section>\n");
      out.write("                 <div class=\"box-header\">\n");
      out.write("                <div class=\"box-tools\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input type=\"text\" name=\"table_search\" class=\"form-control input-sm pull-right\" style=\"width: 150px;\" placeholder=\"Search\"/>\n");
      out.write("                        <div class=\"input-group-btn\">\n");
      out.write("                            <button class=\"btn btn-sm btn-default\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div><!-- /.box-header -->\n");
      out.write("\n");
      out.write("                <!-- Main content -->\n");
      out.write("                <section class=\"content\">\n");
      out.write("                    ");

                        String module = "";
                        if (request.getParameter("module") != null) {
                            module = request.getParameter("module");
                        }
                        if (module.equalsIgnoreCase("loaisach")) {

                    
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-xs-12\">\n");
      out.write("        <div class=\"box\">\n");
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

                        Vector<clsCatagory> ds = new Vector<clsCatagory>();
                        clsCatagory pro = new clsCatagory();
                        tbProductAdmin.GetProductAdmin(ds);
                        int dem = 0;
                        for (clsCatagory p : ds) {
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
      out.print(p.isTrangthai() ? "Đang bán" : "Đang không bán");
      out.write("</td>\n");
      out.write("\n");
      out.write("                        <th><a href=\"admin.jsp?module=SuaDulieu&id=");
      out.print(p.getId());
      out.write("\"><input type=\"submit\" name=\"fix\" id=\"fix\" value=\"Sửa\"></a>\n");
      out.write("                            <a href=\"DoiTrangThaiLoaiSP?id=");
      out.print(p.getId());
      out.write("&tt=");
      out.print(p.gettrangthai());
      out.write("\"><input type=\"submit\" name=\"show\" id=\"show\" value=\"Đổi trạng thái\"></a></th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
    }
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                      <td colspan=\"4\" align=\"center\"><a href=\"EXPORT/ex_Category.jsp\">Export</a></td>\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </div><!-- /.box-body -->\n");
      out.write("        </div><!-- /.box -->\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("                    ");
    } else if (module.equalsIgnoreCase("themloaisp")) {
                    
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-xs-12\">\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <div class=\"box-body table-responsive no-padding\">\n");
      out.write("                </table>\n");
      out.write("                <form id=\"FDK\" action=\"XuLythemLoaiSach\" method=\"post\">\n");
      out.write("                    <table border=\"0\" align=\"center\" >\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <input  class=\"hienthi\" type=\"text\" name=\"loaisach\" id=\"loaisach\" placeholder=\"   Tên loại sách\"/>\n");
      out.write("\n");
      out.write("                                <br /><br />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                              Bày bán  <input  class=\"hienthi\" type=\"checkbox\" name=\"trangthai\" id=\"trangthai\" value=\"1\"/> \n");
      out.write("                                <br /><br />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"2\" align=\"center\">\n");
      out.write("                                <input  type=\"submit\" id=\"Themmoi\" name=\"Themmoi\" value=\"Thêm mới\" style=\"width:100%;height:40px;background-color:red;border-radius:10px;\"/>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div><!-- /.box-body -->\n");
      out.write("        </div><!-- /.box -->\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("                    ");

                    } else if (module.equalsIgnoreCase("DSSP")) {
                    
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-xs-12\">\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <div class=\"box-body table-responsive no-padding\">\n");
      out.write("                <table class=\"table table-hover\">\n");
      out.write("                    <br>\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <th>STT</th>\n");
      out.write("                        <th>Tên sách</th>\n");
      out.write("                        <th>Giá sách</th>\n");
      out.write("                        <th>Hình Ảnh</th>\n");
      out.write("                        <th>Mô tả</th>\n");
      out.write("                        <th>Nhóm sản phẩm </th>\n");
      out.write("                        <th>Trạng thái</th>\n");
      out.write("                        <th>Thao tác</th>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        //   Vector<clsProduct> ds = new Vector<clsProduct>();
                        Vector<clsProduct> ds = (Vector<clsProduct>) session.getAttribute("list");
                        //  tbProductAdmin.LayDuLieuAdmin(ds);
                        if (ds == null || ds.isEmpty()) {
                    
      out.write("\n");
      out.write("                    <h3>Chưa có </h3>\n");
      out.write("                    ");

                    } else {
                        int dem = 0;
                        DecimalFormat formatter = new DecimalFormat("###,###,###");
                        for (clsProduct p : ds) {
                            String img = "noimage.jpg";
                            if (p.getHinhAnh() != null && p.getHinhAnh().equals("") == false) {
                                img = p.getHinhAnh();
                            }

                            dem++;

                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(dem);
      out.write("</td>\n");
      out.write("                        <td style=\"width: 100px\">");
      out.print(p.getTensp());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(formatter.format(Integer.parseInt(p.getGiaSP())));
      out.write("</td>\n");
      out.write("                        <td><img src=\"Uploads/");
      out.print(img);
      out.write("\" height=\"100px\" width=\"100px\"></td>\n");
      out.write("                        <td style=\"width: 500px\">");
      out.print(p.getMoTa());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(p.getIdproducts());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(p.isTrangthai() ? "Đang bán" : "Không được bán");
      out.write("</td>\n");
      out.write("                        <th><a href=\"admin.jsp?module=SuaDulieuSP&id=");
      out.print(p.getId());
      out.write("\"><input type=\"submit\" name=\"fix\" id=\"fix\" value=\"Sửa\" ></a>\n");
      out.write("                            <a href=\"XuLyXoa?id=");
      out.print(p.getId());
      out.write("\"><input type=\"submit\" name=\"delete\" id=\"delete\" value=\"Xóa\"></a>\n");
      out.write("                            <a href=\"DoiTrangThaiSP?id=");
      out.print(p.getId());
      out.write("&tt=");
      out.print(p.gettrangthai());
      out.write("\"><input type=\"submit\" name=\"fix\" id=\"fix\" value=\"Đổi trạng thái\" ></a>\n");
      out.write("                        </th>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    ");
    }
                        }

                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <td colspan=\"8\" align=\"center\"><a href=\"EXPORT/ex_Products.jsp\">export</a>\n");
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Pagani/Pa_Product_Admin.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            </div><!-- /.box-body -->\n");
      out.write("        </div><!-- /.box -->\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("                    ");
} else if (module.equalsIgnoreCase("themSP")) {
                    
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script language=\"javascript\">\n");
      out.write("    function kiemtra()\n");
      out.write("    {\n");
      out.write("        f = document.FDK;\n");
      out.write("        tensach = f.Ten.value;\n");
      out.write("        if (tensach == \"\")\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"loi_tensach\").innerHTML = \"Chưa nhập tên sách\";\n");
      out.write("            return false;\n");
      out.write("\n");
      out.write("        } else\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"loi_tensach\").innerHTML = \"\";\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        gia = f.Gia.value;\n");
      out.write("        if (gia == null)\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"loi_gia\").innerHTML = \"Chưa nhập giá sách\";\n");
      out.write("            return false;\n");
      out.write("\n");
      out.write("        } else\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"loi_gia\").innerHTML = \"\";\n");
      out.write("        }\n");
      out.write("        hinhanh = f.HinhAnh.value;\n");
      out.write("        if (hinhanh == null || hinhanh == \"\")\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"loi_hinhanh\").innerHTML = \"Vui lòng chọn hình ảnh\";\n");
      out.write("            return false;\n");
      out.write("\n");
      out.write("        } else\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"loi_hinhanh\").innerHTML = \"\";\n");
      out.write("        }\n");
      out.write("        mota = f.MoTa.value;\n");
      out.write("        if (mota == null) {\n");
      out.write("            document.getElementById(\"loi_mota\").innerHTML = \"phải có mô tả sản phẩm\";\n");
      out.write("            return false;\n");
      out.write("\n");
      out.write("        } else\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"loi_mota\").innerHTML = \"\";\n");
      out.write("        }\n");
      out.write("        if (f.Nhom.selectedIndex == 0)\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"loi_nhom\").innerHTML = \"Bạn chưa chọn nhóm sách\";\n");
      out.write("            return false;\n");
      out.write("        } else\n");
      out.write("        {\n");
      out.write("            document.getElementById(\"loi_nhom\").innerHTML = \"\";\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-xs-12\">\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <div class=\"box-body table-responsive no-padding\">\n");
      out.write("                </table>\n");
      out.write("                <form id=\"FDK\" name=\"FDK\"action=\"XuLythemSach\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                    <table border=\"0\" align=\"center\" >\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                Tên sách\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <br><br>\n");
      out.write("                                <input type=\"text\" name=\"Ten\" id=\"Ten\" style=\"width:930px;height: 30px\"/>\n");
      out.write("                                <br>\n");
      out.write("                                <span id=\"loi_tensach\" class=\"baoloi\" style=\"color: red\"></span>\n");
      out.write("\n");
      out.write("                                <br /><br/>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                Giá sách\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <br><br>\n");
      out.write("                                <input type=\"text\" name=\"Gia\" id=\"Gia\" style=\"width:930px;height: 30px\"/>\n");
      out.write("                                <br>\n");
      out.write("                                <span id=\"loi_gia\" class=\"baoloi\" style=\"color: red\"></span>\n");
      out.write("                                <br /><br />\n");
      out.write("                            </td>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                Hình Ảnh\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <br><br>\n");
      out.write("                                <input type=\"file\" name=\"HinhAnh\" id=\"HinhAnh\"/>\n");
      out.write("                                <br>\n");
      out.write("                                <span id=\"loi_hinhanh\" class=\"baoloi\" style=\"color: red\"></span>\n");
      out.write("                                <br /><br />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                Mô tả\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <textarea name=\"MoTa\" id=\"MoTa\" rows=\"20\" cols=\"200\"></textarea>\n");
      out.write("                                <script langague=\"javascript\">\n");
      out.write("                                    CKEDITOR.replace('MoTa');\n");
      out.write("                                </script>            \n");
      out.write("                                <br>\n");
      out.write("                                <span id=\"loi_mota\" class=\"baoloi\" style=\"color: red\"></span>\n");
      out.write("                                <br /><br />\n");
      out.write("                            </td>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                Nhóm sách  \n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                            <td>\n");
      out.write("                                <br><br>\n");
      out.write("                                <select name=\"Nhom\" id=\"nhom\" style=\"width: 200px;height: 30px\">\n");
      out.write("                                    <option value=\"0\">Chọn loại sách</option>\n");
      out.write("                                    ");

                                        Vector<clsCatagory> ds = new Vector<clsCatagory>();
                                        clsCatagory pro = new clsCatagory();
                                        tbProductAdmin.GetProduct(ds);
                                        for (clsCatagory p : ds) {
                                    
      out.write("\n");
      out.write("                                    <option value=\"");
      out.print(p.getId());
      out.write('"');
      out.write('>');
      out.print(p.getTen());
      out.write("</option>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                                <br>\n");
      out.write("                                <span id=\"loi_nhom\" class=\"baoloi\" style=\"color: red\"></span>\n");
      out.write("                                <br /><br />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <br><br>\n");
      out.write("                                Bày bán  <input  class=\"hienthi\" type=\"checkbox\" name=\"trangthai\" id=\"trangthai\" value=\"1\" style=\"height: 30px;width: 30px\"/> \n");
      out.write("                                <br /><br />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"2\" align=\"center\">\n");
      out.write("                                <input  type=\"submit\" id=\"Themmoi\" name=\"Gia\" value=\"Thêm mới\" onclick=\"return kiemtra();\" style=\"width:100%;height:40px;background-color:red;border-radius:10px;\"/>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div><!-- /.box-body -->\n");
      out.write("        </div><!-- /.box -->\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("                    ");
} else if (module.equalsIgnoreCase("SuaDulieu")) {
                    
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-xs-12\">\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <div class=\"box-body table-responsive no-padding\">\n");
      out.write("                </table>\n");
      out.write("                ");

                    int id;
                    if (request.getParameter("id") == null || Controller.Tientich.isInteger(request.getParameter("id")) == false) {
                        out.println("<h3>Lỗi ID</h3>");
                    } else {
                        id = Integer.parseInt(request.getParameter("id"));
                        clsCatagory pro = new clsCatagory();
                        int kq = tbProductAdmin.GetOneTypeProduct(id, pro);
                        if (kq > 0) {

                
      out.write("\n");
      out.write("                <form id=\"FDK\" action=\"XuLySuaLoaiSP\" method=\"post\">\n");
      out.write("                    <table border=\"0\" align=\"center\" >\n");
      out.write("                        <input type=\"hidden\" readonly name=\"id\" id=\"id\" value=\"");
      out.print(pro.getId());
      out.write("\"/>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                               Tên sách <input type=\"text\" name=\"Ten\" id=\"Ten\" value=\"");
      out.print(pro.getTen());
      out.write("\"/>\n");
      out.write("                                <br /><br />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                Bày bán  <input  class=\"hienthi\" type=\"checkbox\" name=\"trangthai\" id=\"trangthai\" value=\"1\"");
      out.print((pro.isTrangthai() == true) ? "checked" : "");
      out.write("/> \n");
      out.write("                                <br /><br />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"2\" align=\"center\">\n");
      out.write("                                <input  type=\"submit\" id=\"Sua\" name=\"Sua\" value=\"Sửa\" style=\"width:100%;height:40px;background-color:red;border-radius:10px;\"/>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("                ");

                        }
                    }
                
      out.write("\n");
      out.write("            </div><!-- /.box-body -->\n");
      out.write("        </div><!-- /.box -->\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("                    ");
} else if (module.equalsIgnoreCase("chitiethoadon")) {
                    
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-xs-12\">\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <div class=\"box-body table-responsive no-padding\">\n");
      out.write("                <table class=\"table table-hover\">\n");
      out.write("                    <br>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>STT</th>\n");
      out.write("                        <th>TÊN SẢN PHẨM</th>\n");
      out.write("                        <th>Hình Ảnh</th>\n");
      out.write("                        <th>Số lượng </th>\n");
      out.write("                        <th>THÀNH TIỀN</th>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        int mahd = Integer.parseInt(request.getParameter("mahd"));
                        String hinhanh = "";
                        String tensp = "";
                        Vector<clsChiTietHoaDon> dscthd = new Vector<clsChiTietHoaDon>();
                        clsChiTietHoaDon cthd = new clsChiTietHoaDon();
                        CSDLAdmin.tbChiTietHoaDon.DanhSachChiTietHD(mahd, dscthd);
                       
                        int dem = 0;
                        for (clsChiTietHoaDon p : dscthd) {
                            dem++;
                            clsProduct sp = new clsProduct();
                            tbProductAdmin.GetOneProduct(p.getidsp(), sp);
                            hinhanh = sp.getHinhAnh();
                            tensp = sp.getTensp();
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(dem);
      out.write("</td>\n");
      out.write("                        <td style=\"width: 100px\">");
      out.print(tensp);
      out.write("</td>\n");
      out.write("                        <td style=\"width: 100px\"><img src=\"Uploads/");
      out.print(hinhanh);
      out.write("\" width=\"100px\" height=\"100px\"></td>\n");
      out.write("                        <td style=\"width: 100px\">");
      out.print(p.getSoluong());
      out.write("</td>\n");
      out.write("\n");
      out.write("                        <td>");
      out.print(String.format("%,d", CSDLAdmin.tbChiTietHoaDon.TongTienHoaDonChiTiet(p.getidsp())));
      out.write("</td>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    ");
    }//session.setAttribute("export", dscthd);
                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div><!-- /.box-body -->\n");
      out.write("        </div><!-- /.box -->\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("                    ");
} else if (module.equalsIgnoreCase("DSTKKH")) {
                    
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("                        <th>Email</th>\n");
      out.write("                        <th>Password</th>\n");
      out.write("                        <th>Họ tên</th>\n");
      out.write("                        <th>Số điện thoại </th>\n");
      out.write("                        <th>Thao tác</th>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        Vector<cls_Account_Customer> ds = new Vector<cls_Account_Customer>();
                        tbUserAdmin.GetUserCus(ds);
                        int dem = 0;
                        for (cls_Account_Customer p : ds) {
                            dem++;
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(dem);
      out.write("</td>\n");
      out.write("                        <td style=\"width: 100px\">");
      out.print(p.getEmail());
      out.write("</td>\n");
      out.write("                        <td style=\"width: 500px\">");
      out.print(p.getPass());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(p.getHoten());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(p.getSdt());
      out.write("</td>\n");
      out.write("\n");
      out.write("                        <th>\n");
      out.write("                            <a href=\"XyLyXoaUserCus?id=");
      out.print(p.getId());
      out.write("\" onclick=\"return confirm('Chắc chắn xóa');\"><input type=\"submit\" name=\"delete\" id=\"delete\" value=\"Xóa\"></a>\n");
      out.write("                        </th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
    }
                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div><!-- /.box-body -->\n");
      out.write("        </div><!-- /.box -->\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("                    ");
} else if (module.equalsIgnoreCase("SuaDulieuSP")) {
                    
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-xs-12\">\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <div class=\"box-body table-responsive no-padding\">\n");
      out.write("\n");
      out.write("                ");

                    int id;
                    if (request.getParameter("id") == null || Controller.Tientich.isInteger(request.getParameter("id")) == false) {
                        out.println("<h3>Lỗi ID</h3>");
                    } else {
                        id = Integer.parseInt(request.getParameter("id"));
                        clsProduct sp = new clsProduct();
                        int kq = tbProductAdmin.GetOneProduct(id, sp);

                
      out.write("\n");
      out.write("                <form id=\"FDK\" action=\"XuLySuaSP\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                    <table border=\"0\" align=\"center\" >\n");
      out.write("                        <input type=\"hidden\" name=\"id\" id=\"id\" value=\"");
      out.print(sp.getId());
      out.write("\"/>\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                Tên sách <input type=\"text\" name=\"Ten\" id=\"Ten\" value=\"");
      out.print(sp.getTensp());
      out.write("\"/>\n");
      out.write("\n");
      out.write("                                <br /><br />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                           \n");
      out.write("                            <td>\n");
      out.write("                              Giá sách  <input type=\"text\" name=\"Gia\" id=\"Gia\" value=\"");
      out.print(sp.getGiaSP());
      out.write("\"/>\n");
      out.write("\n");
      out.write("                                <br /><br />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                               Hình Ảnh <img src=\"Uploads/");
      out.print(sp.getHinhAnh());
      out.write("\" height=\"300px\" width=\"200px\">\n");
      out.write("                                <br>\n");
      out.write("                                         <input type=\"text\" readonly name=\"tAnhHientai\" id=\"tAnhHientai\" value=\"");
      out.print(sp.getHinhAnh());
      out.write("\">\n");
      out.write("                                <input type=\"file\" name=\"HinhAnh\" id=\"HinhAnh\"/>\n");
      out.write("\n");
      out.write("                                <br /><br />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                           \n");
      out.write("                            <td>\n");
      out.write("                                Mô tả<textarea type=\"text\" name=\"MoTa\" id=\"MoTa\" style=\"width: 700px;height: 300px;\">");
      out.print(sp.getMoTa());
      out.write("</textarea>\n");
      out.write("\n");
      out.write("                                <br /><br />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <td>\n");
      out.write("                               Nhóm sách<select name=\"Nhom\" id=\"nhom\">\n");
      out.write("                                    ");

                                        Vector<clsCatagory> ds = new Vector<clsCatagory>();
                                        clsCatagory pro = new clsCatagory();
                                        tbProductAdmin.GetProduct(ds);
                                        for (clsCatagory p : ds) {
                                    
      out.write("\n");
      out.write("                                    <option value=\"");
      out.print(p.getId());
      out.write('"');
      out.write('>');
      out.print(p.getTen());
      out.write("</option>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                                <br /><br />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                Bày bán  <input  class=\"hienthi\" type=\"checkbox\" name=\"trangthai\" id=\"trangthai\" value=\"1\"");
      out.print((sp.isTrangthai() == true) ? "checked" : "");
      out.write("/> \n");
      out.write("                                <br /><br />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"2\" align=\"center\">\n");
      out.write("                                <input  type=\"submit\" id=\"Sua\" name=\"Sua\" value=\"Sửa\" style=\"width:100%;height:40px;background-color:red;border-radius:10px;\"/>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </div><!-- /.box-body -->\n");
      out.write("        </div><!-- /.box -->\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("                    ");
} else if (module.equalsIgnoreCase("hoaDon")) {
                    
      out.write("\n");
      out.write("                    ");
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
      out.write("                    <td colspan=\"6\" align=\"center\"><a href=\"reportInvoice.java\">Export</a></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div><!-- /.box-body -->\n");
      out.write("        </div><!-- /.box -->\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("                    ");
} else if (module.equalsIgnoreCase("DSTKAdmin")) {
                    
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-xs-12\">\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <div class=\"box-body table-responsive no-padding\">\n");
      out.write("                <table class=\"table table-hover\">\n");
      out.write("                    <br>\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                        <th>STT</th>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <th>Password</th>\n");
      out.write("                        <th>Họ tên</th>\n");
      out.write("                        <th>Tên hiển thị</th>\n");
      out.write("                        <th>Số điện thoại </th>\n");
      out.write("                        <th>Thao tác</th>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    ");


                        Vector<cls_Account_Admin> ds = new Vector<cls_Account_Admin>();
                        tbUserAdmin.GetUserAdmin(ds);
                        int dem = 0;
                        for (cls_Account_Admin p : ds) {
                            dem++;
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(dem);
      out.write("</td>\n");
      out.write("                        <td style=\"width: 100px\">");
      out.print(p.getEmail());
      out.write("</td>\n");
      out.write("                        <td style=\"width: 500px\">");
      out.print(p.getPass());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(p.getHoten());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(p.getTenhienthi());
      out.write("</td>\n");
      out.write("\n");
      out.write("                        <td>");
      out.print(p.getSdt());
      out.write("</td>\n");
      out.write("\n");
      out.write("                        <th>\n");
      out.write("                            <a href=\"XyLyXoaUserAdmin?id=");
      out.print(p.getId());
      out.write("\" onclick=\"return confirm('Chắc chắn xóa');\"><input type=\"submit\" name=\"delete\" id=\"delete\" value=\"Xóa\"></a>\n");
      out.write("\n");
      out.write("                        </th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
    }
                       // session.setAttribute("export", ds);
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"6\" align=\"center\"><a href=\"EXPORT/ex_AccountAdmin.jsp\">Export</a></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <form action=\"importAccountAdmin\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                    <input type=\"file\" name=\"filename\">\n");
      out.write("                    <input type=\"submit\" value=\"import\">\n");
      out.write("                </form>\n");
      out.write("            </div><!-- /.box-body -->\n");
      out.write("        </div><!-- /.box -->\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("                    ");
}
                    
      out.write("\n");
      out.write("                </section><!-- /.Left col -->\n");
      out.write("                <!-- right col (We are only adding the ID to make the widgets sortable)-->\n");
      out.write("\n");
      out.write("            </div><!-- /.row (main row) -->\n");
      out.write("\n");
      out.write("        </section><!-- /.content -->\n");
      out.write("    </div><!-- /.content-wrapper -->\n");
      out.write("\n");
      out.write("</div><!-- ./wrapper -->\n");
      out.write("<script src=\"js/jQuery-2.1.3.min.js\"></script>\n");
      out.write("<script src=\"http://code.jquery.com/ui/1.11.2/jquery-ui.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>    \n");
      out.write("<script src=\"dist/js/app.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
