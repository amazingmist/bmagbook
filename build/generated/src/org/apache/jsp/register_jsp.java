package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import util.StringUtil;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "WEB-INF/head_tag.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("title", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Register", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <nav class=\"container-fluid\" id=\"main-nav-login\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("                        <a href=\"/\" id=\"logo-large\">BMAGBOOK</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("                        <form action=\"/\" method=\"post\" class=\"login-form-top\">\r\n");
      out.write("                            <div class=\"login-form-input\">\r\n");
      out.write("                                <label>Email or phone</label>\r\n");
      out.write("                                <input type=\"text\" name=\"user-login-id\" />\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"login-form-input\">\r\n");
      out.write("                                <label>Password</label>\r\n");
      out.write("                                <input type=\"password\" name=\"user-login-password\" />\r\n");
      out.write("                                <button type=\"button\" id=\"btn-login\">Login</button>\r\n");
      out.write("                                <a href=\"/\">Forgotten password?</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <section class=\"container-fluid\" id=\"body-register-form\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("                        <h3>BMAGBOOK helps you connect and share with the people in your life.</h3>\r\n");
      out.write("                        <img src=\"img/user-map.png\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("                        <h3>Create an account</h3>\r\n");
      out.write("                        <p>It's free and always will be.</p>\r\n");
      out.write("                        ");

                            Object error = request.getAttribute("error");
                            if (!StringUtil.getString(error).equals("")) {
                        
      out.write("\r\n");
      out.write("                        <div class=\"alert-danger\" style=\"padding: 5px 15px\">\r\n");
      out.write("                            ");
      out.print( error);
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");

                            }
                        
      out.write("\r\n");
      out.write("                        <form action=\"dang-ky\" method=\"post\" class=\"register-form\">\r\n");
      out.write("                            <div class=\"reg-input-full-name\">\r\n");
      out.write("                                <div class=\"reg-input\" id=\"first-name\">\r\n");
      out.write("                                    <input type=\"text\" name=\"first-name\" placeholder=\"First name\" \r\n");
      out.write("                                           value=\"");
      out.print(StringUtil.getString(request.getParameter("first-name")));
      out.write("\">\r\n");
      out.write("                                    <i class=\"fa fa-exclamation-triangle\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <span class=\"error-popup\">Input your first name\r\n");
      out.write("                                        <span></span><span></span>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"reg-input\" id=\"last-name\">\r\n");
      out.write("                                    <input type=\"text\" name=\"last-name\" placeholder=\"Last name\"\r\n");
      out.write("                                           value=\"");
      out.print(StringUtil.getString(request.getParameter("last-name")));
      out.write("\">\r\n");
      out.write("                                    <i class=\"fa fa-exclamation-triangle\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    <span class=\"error-popup\">Input your last name\r\n");
      out.write("                                        <span></span><span></span>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"reg-input\" id=\"mobile-or-email\">\r\n");
      out.write("                                <input type=\"text\" name=\"mobile-or-email\" placeholder=\"Mobile phone or email address\"\r\n");
      out.write("                                       value=\"");
      out.print(StringUtil.getString(request.getParameter("mobile-or-email")));
      out.write("\">\r\n");
      out.write("                                <i class=\"fa fa-exclamation-triangle\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                <span class=\"error-popup\">Input your email or phone\r\n");
      out.write("                                    <span></span><span></span>\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"reg-input\" id=\"user-password\">\r\n");
      out.write("                                <input type=\"password\" name=\"user-password\" placeholder=\"New password\">\r\n");
      out.write("                                <i class=\"fa fa-exclamation-triangle\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                <span class=\"error-popup\">Input your password\r\n");
      out.write("                                    <span></span><span></span>\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <label style=\"display:block;\">Birthday</label>\r\n");
      out.write("                            <div class=\"reg-input\">\r\n");
      out.write("                                <select name=\"day\" id=\"days\">\r\n");
      out.write("                                    <option>Day</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                                <select name=\"month\" id=\"months\">\r\n");
      out.write("                                    <option>Month</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                                <select name=\"year\" id=\"years\">\r\n");
      out.write("                                    <option>Year</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                                <i class=\"fa fa-exclamation-triangle\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                <span class=\"error-popup\">Select your birthday\r\n");
      out.write("                                    <span></span><span></span>\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"reg-input\">\r\n");
      out.write("                                <input checked=\"true\" type=\"radio\" name=\"sex\" value=\"female\"><label>Female</label>\r\n");
      out.write("                                <input type=\"radio\" name=\"sex\" value=\"male\"><label>Male</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <p class=\"help-block\">\r\n");
      out.write("                                By clicking Create an account, you agree to our Terms and that you have read our Data Policy, including our Cookie Use.\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <button type=\"submit\" id=\"reg-button\" name=\"submit\">Create an account</button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <footer class=\"container\">\r\n");
      out.write("            <ul id=\"lans\">\r\n");
      out.write("                <li>English (UK)</li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">Tiáº¿ng viá»t</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">ä¸­æ(å°ç£)</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">íêµ­ì´</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">æ¥æ¬èª</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">FranÃ§ais (France)</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">à¸ à¸²à¸©à¸²à¹à¸à¸¢</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">EspaÃ±ol</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">PortuguÃªs (Brasil)</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">Deutsch</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">Italiano</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>+</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <ul id=\"footer-tools\">\r\n");
      out.write("                <li><a href=\"/\">Sign Up</a></li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">Log In</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">Messenger</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">Facebook Lite</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">Mobile</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">Find Friends</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">Badges</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">People</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">Pages</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">Places</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">Games</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li><a href=\"/\">Locations</a></li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">Celebrities</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">Groups</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">Facebook Lite</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">Mobile</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">Find Friends</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">Badges</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">People</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">Pages</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">Places</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">Games</a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            BMAGBOOK &copy; 2016\r\n");
      out.write("        </footer>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"./js/app.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            $(function () {\r\n");
      out.write("                var day = \"");
      out.print(StringUtil.getString(request.getParameter("day")));
      out.write("\"\r\n");
      out.write("                var month = \"");
      out.print(StringUtil.getString(request.getParameter("month")));
      out.write("\"\r\n");
      out.write("                var year = \"");
      out.print(StringUtil.getString(request.getParameter("year")));
      out.write("\"\r\n");
      out.write("                var sex = \"");
      out.print(StringUtil.getString(request.getParameter("sex")));
      out.write("\"\r\n");
      out.write("                \r\n");
      out.write("                for (var i = 1; i <= 31; i++) {\r\n");
      out.write("                    if(i == day)\r\n");
      out.write("                        $(\"#days\").append(\"<option selected>\" + i + \"</option>\");\r\n");
      out.write("                    else\r\n");
      out.write("                    $(\"#days\").append(\"<option >\" + i + \"</option>\");\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                for (var i = 1; i <= 12; i++) {\r\n");
      out.write("                    if(i == month)\r\n");
      out.write("                        $(\"#months\").append(\"<option selected>\" + i + \"</option>\");\r\n");
      out.write("                    else\r\n");
      out.write("                    $(\"#months\").append(\"<option>\" + i + \"</option>\");\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                for (var i = 2010; i >= 1900; i--) {\r\n");
      out.write("                    if(i == year)\r\n");
      out.write("                        $(\"#years\").append(\"<option selected>\" + i + \"</option>\");\r\n");
      out.write("                    else\r\n");
      out.write("                    $(\"#years\").append(\"<option>\" + i + \"</option>\");\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                $(\"input[name=sex][value=\" + sex + \"]\").prop(\"checked\", true);\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
