/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-09-10 01:18:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class users_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- saved from url=(0060)https://getbootstrap.com/docs/4.1/examples/starter-template/ -->\r\n");
      out.write("<html lang=\"en\"><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    \r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <link rel=\"icon\" href=\"./Signin/bootstrap-solid.jpg\">\r\n");
      out.write("\r\n");
      out.write("    <title>IDC work</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("    <link href=\"./Signin/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"./Signin/starter-template.css\" rel=\"stylesheet\">\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("\r\n");
      out.write("    <nav class=\"navbar navbar-expand-md navbar-dark bg-dark fixed-top\">\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"/idc_a.do\">IDC</a>\r\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExampleDefault\" aria-controls=\"navbarsExampleDefault\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("      </button>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarsExampleDefault\">\r\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"/admin.do\">Users</a>\r\n");
      out.write("          </li>\r\n");
      out.write("\t\t  <li class=\"nav-item text-nowrap\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"/login.do\">Sign out</a>\r\n");
      out.write("          </li>\r\n");
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <main role=\"main\" class=\"container\">\r\n");
      out.write("    \r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t<h1 class=\"mt-3\">\r\n");
      out.write("\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t</h1>\r\n");
      out.write("\t<h2 class=\"mt-4\">\r\n");
      out.write("\t\tUsers\r\n");
      out.write("\t</h2>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write(" <hr class=\"mb-4\">\r\n");
      out.write("\r\n");
      out.write("         \t <h4 class=\"mb-3\">Add New User</h4>\r\n");
      out.write("        \t<form  name=\"f1\" action=\"/users.do\" method=\"POST\">\r\n");
      out.write("         \t <div class=\"mb-3\">\r\n");
      out.write("              <div class=\"input-group\">\r\n");
      out.write("                <div class=\"input-group-prepend\">\r\n");
      out.write("                  <span class=\"input-group-text\">ID:</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                 <input type=\"text\" class=\"form-control\" name=\"id\" id=\"inputid\" placeholder=\"\" required=\"\">\r\n");
      out.write("                 <div class=\"invalid-feedback\" style=\"width: 100%;\">\r\n");
      out.write("                   ID is required.\r\n");
      out.write("                 </div>\r\n");
      out.write("               </div>\r\n");
      out.write("             </div>\r\n");
      out.write("             <div class=\"mb-3\">\r\n");
      out.write("              <div class=\"input-group\">\r\n");
      out.write("                <div class=\"input-group-prepend\">\r\n");
      out.write("                  <span class=\"input-group-text\">Username:</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                 <input type=\"text\" class=\"form-control\" name=\"username\" id=\"inputusername\" placeholder=\"\" required=\"\">\r\n");
      out.write("                 <div class=\"invalid-feedback\" style=\"width: 100%;\">\r\n");
      out.write("                   Username is required.\r\n");
      out.write("                 </div>\r\n");
      out.write("               </div>\r\n");
      out.write("             </div>\r\n");
      out.write("             <div class=\"mb-3\">\r\n");
      out.write("              <div class=\"input-group\">\r\n");
      out.write("                <div class=\"input-group-prepend\">\r\n");
      out.write("                  <span class=\"input-group-text\">Password:</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                 <input type=\"text\" class=\"form-control\" name=\"password\" id=\"inputpassword\" placeholder=\"\" required=\"\">\r\n");
      out.write("                 <div class=\"invalid-feedback\" style=\"width: 100%;\">\r\n");
      out.write("                   Password is required.\r\n");
      out.write("                 </div>\r\n");
      out.write("               </div>\r\n");
      out.write("             </div>\r\n");
      out.write("             <div class=\"mb-3\">\r\n");
      out.write("              <div class=\"input-group\">\r\n");
      out.write("                <div class=\"input-group-prepend\">\r\n");
      out.write("                  <span class=\"input-group-text\">Firstname:</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" name=\"firstname\" id=\"inputfirstname\" placeholder=\"\" required=\"\">\r\n");
      out.write("                 <div class=\"invalid-feedback\" style=\"width: 100%;\">\r\n");
      out.write("                   Firstname is required.\r\n");
      out.write("                 </div>\r\n");
      out.write("               </div>\r\n");
      out.write("             </div>\r\n");
      out.write("             <div class=\"mb-3\">\r\n");
      out.write("               <div class=\"input-group\">\r\n");
      out.write("                <div class=\"input-group-prepend\">\r\n");
      out.write("                  <span class=\"input-group-text\">Lastname:</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                 <input type=\"text\" class=\"form-control\" name=\"lastname\" id=\"inputlastname\" placeholder=\"\" required=\"\">\r\n");
      out.write("                 <div class=\"invalid-feedback\" style=\"width: 100%;\">\r\n");
      out.write("                   Lastname is required.\r\n");
      out.write("                 </div>\r\n");
      out.write("                </div>\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"mb-3\">\r\n");
      out.write("                <div class=\"input-group\">\r\n");
      out.write("                 <div class=\"input-group-prepend\">\r\n");
      out.write("                  <span class=\"input-group-text\">Address:</span>\r\n");
      out.write("                 </div>                \r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" name=\"address\" id=\"inputaddress\" placeholder=\"\" value=\"\" required=\"\">\r\n");
      out.write("                  <div class=\"invalid-feedback\">\r\n");
      out.write("                    Address is required.\r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("             </div>\r\n");
      out.write("             <div class=\"mb-3\">\r\n");
      out.write("              <div class=\"input-group\">\r\n");
      out.write("                <div class=\"input-group-prepend\">\r\n");
      out.write("                  <span class=\"input-group-text\">Phone:</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"phone\" id=\"inputphone\" placeholder=\" \" required=\"\">\r\n");
      out.write("                <div class=\"invalid-feedback\" style=\"width: 100%;\">\r\n");
      out.write("                  Phone is required.\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("           <hr class=\"mb-4\">\r\n");
      out.write("\r\n");
      out.write("<button class=\"btn btn-primary btn-lg btn-block\" value=\"Submit\" type=\"submit\">Submit</button>\r\n");
      out.write("           </form>\r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("</main>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/users.jsp(56,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/users.jsp(56,2) '${users}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${users}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/users.jsp(56,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("user");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t  \t<form action=\"/delete_user.do\" method=\"post\">\r\n");
          out.write("\t\t\t\t<div class=\"card info-panel\" style=\"width: 18rem;\">\r\n");
          out.write("\t\t\t\t\t<div class=\"card-header\">\r\n");
          out.write("\t\t\t\t\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write('-');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t<div class=\"card-body\">\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t    <h5 class=\"card-title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.firstname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.lastname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</h5>\r\n");
          out.write("\t\t\t\t\t    <p class=\"card-text\">Address: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.address}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</p>\r\n");
          out.write("\t\t\t\t\t    <p class=\"card-text\">Phone: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.phone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</p>\r\n");
          out.write("\t\t\t\t\t    <input id=\"username\" name=\"username\" type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Delete</button>\r\n");
          out.write("\t\t\t\t\t\t<a href=\"/edit_user.do?username=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" class=\"btn btn-primary\">Edit</a>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t</form>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
