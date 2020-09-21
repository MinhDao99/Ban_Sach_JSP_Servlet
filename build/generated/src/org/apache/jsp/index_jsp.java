package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Vector;
import model.Product;
import model.ListProduct;
import CSDLCustomer.tbProduct;
import model.Product;
import java.util.Vector;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/incl/header.jsp");
    _jspx_dependants.add("/incl/hero.jsp");
    _jspx_dependants.add("/incl/footer.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"description\" content=\"Ogani Template\">\n");
      out.write("        <meta name=\"keywords\" content=\"Ogani, unica, creative, html\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <title>Ogani | Template</title>\n");
      out.write("\n");
      out.write("        <!-- Google Font -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Css Styles -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/elegant-icons.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/nice-select.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery-ui.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/slicknav.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<header class=\"header\">\n");
      out.write("    <div class=\"header__top\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6 col-md-6\">\n");
      out.write("                    <div class=\"header__top__left\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><i class=\"fa fa-envelope\"></i> dao.d.minh.190299@gmail.com</li>\n");
      out.write("                            <li>Free Shipping for all Order of $99</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6 col-md-6\">\n");
      out.write("                    <div class=\"header__top__right\">\n");
      out.write("                        <div class=\"header__top__right__social\">\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-pinterest-p\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"header__top__right__language\">\n");
      out.write("                            <img src=\"img/language.png\" alt=\"\">\n");
      out.write("                            <div>English</div>\n");
      out.write("                            <span class=\"arrow_carrot-down\"></span>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">Spanis</a></li>\n");
      out.write("                                <li><a href=\"#\">English</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"header__top__right__auth\">\n");
      out.write("                            ");

                                String tk = (String) session.getAttribute("user");
                                if (tk == null) {
                            
      out.write("\n");
      out.write("                            <a href=\"login.jsp\"><i class=\"fa fa-user\"></i> Login</a>\n");
      out.write("                            ");

                            } else{ 
                            
      out.write("\n");
      out.write("                            <a href=\"login.jsp\"><i class=\"fa fa-user\"></i> ");
      out.print(tk);
      out.write("</a>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-3\">\n");
      out.write("                <div class=\"header__logo\">\n");
      out.write("                    <a href=\"index.jsp\"><img src=\"img/logo.png\" alt=\"\"></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-6\">\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-3\">\n");
      out.write("                <div class=\"header__cart\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-heart\"></i></a></li>\n");
      out.write("                        <li><a href=\"index.jsp?module=cart\"><i class=\"fa fa-shopping-bag\"></i></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"humberger__open\">\n");
      out.write("            <i class=\"fa fa-bars\"></i>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <section class=\"hero\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-3\">\n");
      out.write("                            <div class=\"hero__categories\">\n");
      out.write("                                <ul>\n");
      out.write("                                    ");

                                       
                                        Vector<Product> ds = new Vector<Product>();
                                        int kq = CSDLCustomer.tbProduct.GetProduct(ds);
                                        if (kq == 0) {


                                    
      out.write("\n");
      out.write("                                    <li><a href=\"#\">No product</a></li>\n");
      out.write("                                        ");
                        } else if (kq > 0) {
                                            for (Product p : ds) {
                                        
      out.write("\n");
      out.write("                                    <li><a href=\"index.jsp?module=product&id=");
      out.print(p.getId());
      out.write('"');
      out.write('>');
      out.print(p.getTen());
      out.write("</a></li>\n");
      out.write("\n");
      out.write("                                    ");

                                            }
                                        }
                                    
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-9\">\n");
      out.write("                            <div class=\"hero__search\">\n");
      out.write("                                <div class=\"hero__search__form\">\n");
      out.write("                                    <form action=\"index.jsp?module=timkiem\" method=\"post\">\n");
      out.write("                                       \n");
      out.write("                                        <input type=\"text\" name=\"search\" placeholder=\"Tìm kiếm sách của bạn ở đây  -> \">\n");
      out.write("                                        <button type=\"submit\" class=\"site-btn\">SEARCH</button>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"hero__search__phone\">\n");
      out.write("                                    <div class=\"hero__search__phone__icon\">\n");
      out.write("                                        <i class=\"fa fa-phone\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"hero__search__phone__text\">\n");
      out.write("                                        <h5>(+84) 0327 614 768</h5>\n");
      out.write("                                        <span>support 24/7 time</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"hero__item set-bg\" data-setbg=\"img/hero/bannerr.jpg\">\n");
      out.write("                                <div class=\"hero__text\">\n");
      out.write("                                    <span>BOOK STORE</span>\n");
      out.write("                                    <h2>BOOK <br />100% REAL</h2>\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
            request.setCharacterEncoding("utf-8");

            String md = "";
            if (request.getParameter("module") != null) {
                md = (String) request.getParameter("module");
            }
            if (md.equalsIgnoreCase("product")) {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "incl/futureProduct.jsp", out, false);
      out.write("\n");
      out.write("        ");

        } else if (md.equalsIgnoreCase("detail")) {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "shopdetails.jsp", out, false);
      out.write("\n");
      out.write("        ");

        } else if (md.equalsIgnoreCase("contact")) {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "contact.jsp", out, false);
      out.write("\n");
      out.write("        ");

        } else if (md.equalsIgnoreCase("cart")) {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "shopingcart.jsp", out, false);
      out.write("\n");
      out.write("        ");

        } else if (md.equalsIgnoreCase("timkiem")) {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "incl/timkiem.jsp", out, false);
      out.write("\n");
      out.write("        ");

        } else {
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "incl/slideProduct.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "incl/LatestProduct.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        ");
            }
        
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer class=\"footer spad\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-3 col-md-6 col-sm-6\">\n");
      out.write("                <div class=\"footer__about\">\n");
      out.write("                    <div class=\"footer__about__logo\">\n");
      out.write("                        <a href=\"./index.jsp\"><img src=\"img/logo.png\" alt=\"\"></a>\n");
      out.write("                    </div>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Address: 60-49 Road 11378 New York</li>\n");
      out.write("                        <li>Phone: +65 11.188.888</li>\n");
      out.write("                        <li>Email: hello@colorlib.com</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 col-md-6 col-sm-6 offset-lg-1\">\n");
      out.write("                <div class=\"footer__widget\">\n");
      out.write("                    <h6>Useful Links</h6>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">About Us</a></li>\n");
      out.write("                        <li><a href=\"#\">About Our Shop</a></li>\n");
      out.write("                        <li><a href=\"#\">Secure Shopping</a></li>\n");
      out.write("                        <li><a href=\"#\">Delivery infomation</a></li>\n");
      out.write("                        <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                        <li><a href=\"#\">Our Sitemap</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">Who We Are</a></li>\n");
      out.write("                        <li><a href=\"#\">Our Services</a></li>\n");
      out.write("                        <li><a href=\"#\">Projects</a></li>\n");
      out.write("                        <li><a href=\"#\">Contact</a></li>\n");
      out.write("                        <li><a href=\"#\">Innovation</a></li>\n");
      out.write("                        <li><a href=\"#\">Testimonials</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 col-md-12\">\n");
      out.write("                <div class=\"footer__widget\">\n");
      out.write("                    <h6>Join Our Newsletter Now</h6>\n");
      out.write("                    <p>Get E-mail updates about our latest shop and special offers.</p>\n");
      out.write("                    <form action=\"#\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Enter your mail\">\n");
      out.write("                        <button type=\"submit\" class=\"site-btn\">Subscribe</button>\n");
      out.write("                    </form>\n");
      out.write("                    <div class=\"footer__widget__social\">\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-pinterest\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("                <div class=\"footer__copyright\">\n");
      out.write("                    <div class=\"footer__copyright__text\"><p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                            Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"fa fa-heart\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\n");
      out.write("                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p></div>\n");
      out.write("                    <div class=\"footer__copyright__payment\"><img src=\"img/payment-item.png\" alt=\"\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>");
      out.write("\n");
      out.write("        <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.nice-select.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery-ui.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.slicknav.js\"></script>\n");
      out.write("        <script src=\"js/mixitup.min.js\"></script>\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
