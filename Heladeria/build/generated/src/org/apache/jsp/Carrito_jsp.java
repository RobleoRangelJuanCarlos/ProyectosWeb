package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import java.text.*;

public final class Carrito_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset='utf-8'>\n");
      out.write("        <meta http-equiv='X-UA-Compatible' content='IE=edge'>\n");
      out.write("        <title>Carrito</title>\n");
      out.write("        <link rel=\"icon\" href= \"images/icon.png\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Mukta+Vaani:wght@300&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <meta name='viewport' content='width=device-width, initial-scale=1'>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\n");
      out.write("        <script src=\"scripts/script.js\"></script>\n");
      out.write("        <link rel = \"stylesheet\" type = 'text/css' href = 'Styles/Estilos.css'>\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Bangers&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/9fb0a1aa63.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div class = \"container logo-nav-container\">\n");
      out.write("    \n");
      out.write("                <span class=\"menu-icon\"> <i class=\"fas fa-chevron-down\"></i></span>\n");
      out.write("                <nav class = \"navigation\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li onclick=\"javascript:Inicio();\"><i></i>INICIO</li>\n");
      out.write("                        <li onclick=\"javascript:IniciarSesion()\"><i class=></i>CERRAR SESION</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <section>\n");
      out.write("            <main>\n");
      out.write("                <div class=\"texto\">\n");
      out.write("\n");
      out.write("                    ");

                        Connection con = null;
                        Statement set = null;
                        ResultSet rs = null;
                        String url, userName, password, driver;
                        url = "jdbc:mysql://localhost/helados";
                        userName = "root";
                        password = "juanito123";
                        driver = "com.mysql.cj.jdbc.Driver";
                        try {
                            Class.forName(driver);
                            con = DriverManager.getConnection(url, userName, password);
                            try {
                                String q = "select * from carrito order by heladoCompro";
                                set = con.createStatement();
                                rs = set.executeQuery(q);
                                while (rs.next()) {
                    
      out.write("\n");
      out.write("\n");
      out.write("                          <table class=\"default\">\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("\n");
      out.write("                                <th colspan=\"3\">CLIENTES</th>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("\n");
      out.write("                                <th>ID</th>\n");
      out.write("\n");
      out.write("                                <th>Nombre</th>\n");
      out.write("\n");
      out.write("                                <th>ApPaterno</th>\n");
      out.write("                                \n");
      out.write("                                <th>ApMaterno</th>\n");
      out.write("                                \n");
      out.write("                                <th>FechaNacimiento</th>\n");
      out.write("                                \n");
      out.write("                                <th>Telefono</th>\n");
      out.write("                                \n");
      out.write("                                <th>Domicilio</th>\n");
      out.write("                                \n");
      out.write("                                <th>Usuario</th>\n");
      out.write("                                \n");
      out.write("                                <th>Contraseña</th>\n");
      out.write("                                \n");
      out.write("\n");
      out.write("                            </tr>                            \n");
      out.write("                            \n");
      out.write("                            <tr>\n");
      out.write("\n");
      out.write("                                <td>Celda 4</td>\n");
      out.write("\n");
      out.write("                                <td>Celda 5</td>\n");
      out.write("\n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                               \n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                            <tr>\n");
      out.write("\n");
      out.write("                                <td>Celda 4</td>\n");
      out.write("\n");
      out.write("                                <td>Celda 5</td>\n");
      out.write("\n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                               \n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                            <tr>\n");
      out.write("\n");
      out.write("                                <td>Celda 4</td>\n");
      out.write("\n");
      out.write("                                <td>Celda 5</td>\n");
      out.write("\n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                               \n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                            <tr>\n");
      out.write("\n");
      out.write("                                <td>Celda 4</td>\n");
      out.write("\n");
      out.write("                                <td>Celda 5</td>\n");
      out.write("\n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                               \n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                            <tr>\n");
      out.write("\n");
      out.write("                                <td>Celda 4</td>\n");
      out.write("\n");
      out.write("                                <td>Celda 5</td>\n");
      out.write("\n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                               \n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                            <tr>\n");
      out.write("\n");
      out.write("                                <td>Celda 4</td>\n");
      out.write("\n");
      out.write("                                <td>Celda 5</td>\n");
      out.write("\n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                                \n");
      out.write("                                <td>Celda 6</td>\n");
      out.write("                               \n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                          </table>\n");
      out.write("\n");
      out.write("                    ");

                                }
                                rs.close();
                                set.close();
                            } catch (SQLException ed) {
                                System.out.println("Error al consultar la tabla");
                                System.out.println(ed.getMessage());
                            }
                            con.close();
                        } catch (Exception e) {
                            System.out.println("Error al conectar con la bd");
                            System.out.println(e.getMessage());
                            System.out.println(e.getStackTrace());
                        }
                    
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </main>\n");
      out.write("        </section>\n");
      out.write("        <footer>\n");
      out.write("            <h4>Integrantes:</h4>\n");
      out.write("            <p>Gervasio Flores Isaac Antonio</p>\n");
      out.write("            <p>Robledo Rangel Juan Carlos</p>\n");
      out.write("            <p>Romero Tovar Adrian</p>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
