package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import CSDL.tbProduct;
import java.util.Vector;
import model.Product;
import CSDL.tbProduct;
import java.util.Vector;
import model.Product;
import java.text.DecimalFormat;
import model.ListProduct;
import CSDL.tbProduct;
import java.util.Vector;
import model.Product;
import CSDL.tbProduct;
import java.util.Vector;
import model.Product;
import model.ListProduct;
import CSDL.tbProduct;
import java.util.Vector;
import model.Product;
import model.ListProduct;
import CSDL.tbProduct;
import java.util.Vector;
import model.Product;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(7);
    _jspx_dependants.add("/incl_admin/menu.jsp");
    _jspx_dependants.add("/incl_admin/Admin_main.jsp");
    _jspx_dependants.add("/incl_admin/themloaisanpham.jsp");
    _jspx_dependants.add("/incl_admin/DSSP.jsp");
    _jspx_dependants.add("/incl_admin/themSP.jsp");
    _jspx_dependants.add("/incl_admin/SuaDuLieuLoaiSP.jsp");
    _jspx_dependants.add("/incl_admin/SuaDulieuSP.jsp");
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
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>AdminLTE 2 | Dashboard</title>\n");
      out.write("        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>\n");
      out.write("\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />    \n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"http://code.ionicframework.com/ionicons/2.0.0/css/ionicons.min.css\" rel=\"stylesheet\" type=\"text/css\" />    \n");
      out.write("        <link href=\"dist/css/AdminLTE.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"dist/css/skins/_all-skins.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
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
      out.write("                                            <a href=\"#\" class=\"btn btn-default btn-flat\">Sign out></a>\n");
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
      out.write("                            <p>Alexander Pierce</p>\n");
      out.write("\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-circle text-success\"></i> Online</a>\n");
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
      out.write("            <i class=\"fa fa-table\"></i> <span>Quản lý slide</span>\n");
      out.write("            <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("        </a>\n");
      out.write("        <ul class=\"treeview-menu\">\n");
      out.write("            <li><a href=\"#\"><i class=\"fa fa-circle-o\"></i> Danh sách silde</a></li>\n");
      out.write("            <li><a href=\"#\"><i class=\"fa fa-circle-o\"></i> Thêm mới</a></li>\n");
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
      out.write("                        Dashboard\n");
      out.write("                        <small>Control panel</small>\n");
      out.write("                    </h1>\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> Home</a></li>\n");
      out.write("                        <li class=\"active\">Dashboard</li>\n");
      out.write("                    </ol>\n");
      out.write("                </section>\n");
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

                        Vector<ListProduct> ds = new Vector<ListProduct>();
                        ListProduct pro = new ListProduct();
                        tbProduct.LayDuLieuAdmin(ds);
                        int dem = 0;
                        DecimalFormat formatter = new DecimalFormat("###,###,###");
                        for (ListProduct p : ds) {
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
} else if (module.equalsIgnoreCase("themSP")) {
                    
      out.write("\n");
      out.write("                    ");
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
      out.write("                </table>\n");
      out.write("                <form id=\"FDK\" action=\"XuLythemSach\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                    <table border=\"0\" align=\"center\" >\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                Tên sách\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"text\" name=\"Ten\" id=\"Ten\"/>\n");
      out.write("\n");
      out.write("                                <br /><br />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                Giá sách\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"text\" name=\"Gia\" id=\"Gia\"/>\n");
      out.write("\n");
      out.write("                                <br /><br />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                Hình Ảnh\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"file\" name=\"HinhAnh\" id=\"HinhAnh\"/>\n");
      out.write("\n");
      out.write("                                <br /><br />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                Mô tả\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <textarea type=\"text\" name=\"MoTa\" id=\"MoTa\" style=\"width: 700px;height: 300px;\"></textarea>\n");
      out.write("\n");
      out.write("                                <br /><br />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                Nhóm sách  \n");
      out.write("                            </td>\n");
      out.write("\n");
      out.write("                            <td>\n");
      out.write("                                <select name=\"Nhom\" id=\"nhom\">\n");
      out.write("                                    ");

                                        Vector<Product> ds = new Vector<Product>();
                                        Product pro = new Product();
                                        tbProduct.GetProduct(ds);
                                        for (Product p : ds) {
                                    
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
      out.write("                                Bày bán  <input  class=\"hienthi\" type=\"checkbox\" name=\"trangthai\" id=\"trangthai\" value=\"1\"/> \n");
      out.write("                                <br /><br />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"2\" align=\"center\">\n");
      out.write("                                <input  type=\"submit\" id=\"Themmoi\" name=\"Gia\" value=\"Thêm mới\" style=\"width:100%;height:40px;background-color:red;border-radius:10px;\"/>\n");
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
      out.write("                </table>\n");
      out.write("                ");

                    int id;
                    if (request.getParameter("id") == null || Controller.Tientich.isInteger(request.getParameter("id")) == false) {
                        out.println("<h3>Lỗi ID</h3>");
                    } else {
                        id = Integer.parseInt(request.getParameter("id"));
                        Product pro = new Product();
                        int kq = tbProduct.GetOneTypeProduct(id, pro);
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
      out.write("\n");
      out.write("                ");

                    int id;
                    if (request.getParameter("id") == null || Controller.Tientich.isInteger(request.getParameter("id")) == false) {
                        out.println("<h3>Lỗi ID</h3>");
                    } else {
                        id = Integer.parseInt(request.getParameter("id"));
                        ListProduct sp = new ListProduct();
                        int kq = tbProduct.GetOneProduct(id, sp);

                
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

                                        Vector<Product> ds = new Vector<Product>();
                                        Product pro = new Product();
                                        tbProduct.GetProduct(ds);
                                        for (Product p : ds) {
                                    
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
      out.write("\n");
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
