package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class MenuAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("        <header>\n");
      out.write("            <div class = \"container logo-nav-container\">\n");
      out.write("    \n");
      out.write("                <span class=\"menu-icon\"> <i class=\"fas fa-chevron-down\"></i></span>\n");
      out.write("                <nav class = \"navigation\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li onclick = \"javascript:Carrito()\"><i></i>CARRITO</li>\n");
      out.write("                        <li><a href = \"Clientes.jsp\">CLIENTES</a></li>\n");
      out.write("                        <li><a href = \"AddHelado.jsp\">AGREGAR HELADO</a></li>\n");
      out.write("                        <li onclick=\"javascript:Inicio()\"><i></i>CERRAR SESION</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("    <articule>\n");
      out.write("                <div class=\"producto\" align=\"left\">\n");
      out.write("                                    \n");
      out.write("                    <image src = \"images/heladozzz.jpg\" class=\"helados\"></image>\n");
      out.write("                    <div class=\"precios\">\n");
      out.write("                        <form name=\"formularioCompra\" onsubmit=\"return validarCompra(this)\">\n");
      out.write("                            <p class=\"izquierda\">Helado: Fresa</p>\n");
      out.write("                            <p class=\"izquierda\">Precio: 25 </p>\n");
      out.write("                            <p class=\"izquierda\">Mayoreo: 22 </p>\n");
      out.write("                            <p class=\"em7\"></p>\n");
      out.write("                            <a href=\"FormularioCompra.jsp?id=\" name=\"heladoComprar\" class=\"boton\">Comprar</a>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"producto\" align=\"center\">\n");
      out.write("                                    \n");
      out.write("                    <image src = \"images/heladozzz.jpg\" class=\"helados\"></image>\n");
      out.write("                    <div class=\"precios\">\n");
      out.write("                        <form name=\"formularioCompra\" onsubmit=\"return validarCompra(this)\">\n");
      out.write("                            <p class=\"izquierda\">Helado: Vainilla</p>\n");
      out.write("                            <p class=\"izquierda\">Precio: 25 </p>\n");
      out.write("                            <p class=\"izquierda\">Mayoreo: 22 </p>\n");
      out.write("                            <p class=\"em7\"></p>\n");
      out.write("                            <a href=\"FormularioCompra.jsp?id=\" name=\"heladoComprar\" class=\"boton\">Comprar</a>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"producto\" align=\"right\">\n");
      out.write("                                    \n");
      out.write("                    <image src = \"images/heladozzz.jpg\" class=\"helados\"></image>\n");
      out.write("                    <div class=\"precios\">\n");
      out.write("                        <form name=\"formularioCompra\" onsubmit=\"return validarCompra(this)\">\n");
      out.write("                            <p class=\"izquierda\">Helado: Chocolate</p>\n");
      out.write("                            <p class=\"izquierda\">Precio: 25 </p>\n");
      out.write("                            <p class=\"izquierda\">Mayoreo: 22 </p>\n");
      out.write("                            <p class=\"em7\"></p>\n");
      out.write("                            <a href=\"FormularioCompra.jsp?id=\" name=\"heladoComprar\" class=\"boton\">Comprar</a>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("    </articule>\n");
      out.write("\n");
      out.write("        <section>\n");
      out.write("            <main>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");

                    Connection con = null;
                    Statement set = null;
                    ResultSet rs = null;
                    String url, userName, password, driver;
                    url = "jdbc:mysql://localhost/helados";
                    userName = "root";
                    password = "tutankamonroot";
                    driver = "com.mysql.cj.jdbc.Driver";
                    try {
                        Class.forName(driver);
                        con = DriverManager.getConnection(url, userName, password);
                        try {
                            String q = "select * from inventario order by helado";
                            set = con.createStatement();
                            rs = set.executeQuery(q);
                            while (rs.next()) {
                
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"producto\">\n");
      out.write("                                    \n");
      out.write("                    <image src = \"images/heladozzz.jpg\" class=\"helados\"></image>\n");
      out.write("                    <div class=\"precios\">\n");
      out.write("                        <form name=\"formularioCompra\" onsubmit=\"return validarCompra(this)\">\n");
      out.write("                            <p class=\"izquierda\">Helado: ");
      out.print( rs.getString("helado"));
      out.write("</p>\n");
      out.write("                            <p class=\"izquierda\">Precio: $");
      out.print( rs.getInt("precio"));
      out.write(" </p>\n");
      out.write("                            <p class=\"izquierda\">Mayoreo: $");
      out.print( rs.getInt("precioMayoreo"));
      out.write(" </p>\n");
      out.write("                            <p class=\"em7\"></p>\n");
      out.write("                            <a href=\"FormularioCompra.jsp?id=");
      out.print( rs.getInt("idH"));
      out.write("\" name=\"heladoComprar\" class=\"boton\">Comprar</a>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("\n");
      out.write("                ");

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
      out.write("                \n");
      out.write("\n");
      out.write("            </main>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <footer>\n");
      out.write("            <h4>Integrantes:</h4>\n");
      out.write("            <p>Gervasio Flores Isaac Antonio</p>\n");
      out.write("            <p>Robledo Rangel Juan Carlos</p>\n");
      out.write("            <p>Romero Tovar Adrian</p>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <script src=\"./scripts/script.js\"></script>\n");
      out.write("        <script src=\"./scripts/validarFormularios.js\"></script>   \n");
      out.write("\n");
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
