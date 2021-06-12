
<%@page contentType="text/html" pageEncoding="UTF-8" language="java" import="java.sql.*, java.util.*, java.text.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset='utf-8'>
        <meta http-equiv='X-UA-Compatible' content='IE=edge'>
        <title>Clientes</title>
        <link rel="icon" href= "images/icon.png">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Mukta+Vaani:wght@300&display=swap" rel="stylesheet">
        <meta name='viewport' content='width=device-width, initial-scale=1'>
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script src="scripts/script.js"></script>
        <link rel = "stylesheet" type = 'text/css' href = 'Styles/Estilos.css'>
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Bangers&display=swap" rel="stylesheet">
        <script src="https://kit.fontawesome.com/9fb0a1aa63.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <header>
            <div class = "container logo-nav-container">
    
                <span class="menu-icon"> <i class="fas fa-chevron-down"></i></span>
                <nav class = "navigation">
                    <ul>
                        <li><a href = "MenuAdmin.jsp">MENU</a></li>
                        <li onclick = "javascript:Carrito()"><i></i>CARRITO</li>
                        <li><a href = "Clientes.jsp">CLIENTES</a></li>
                        <li><a href = "AddHelado.jsp">AGREGAR HELADO</a></li>
                        <li onclick="javascript:Inicio()"><i></i>CERRAR SESION</a></li>
                    </ul>
                </nav>
            </div>
        </header>
        <section>
            <main>
                <div>
                                                <center>
                          <table border="1" bordercolor="red">

                            <tr>


                                
                                <th colspan="7">CLIENTES</th>


                            </tr>

                            <tr>

                                <th>ID</th>

                                <th>Nombre</th>

                                <th>ApPaterno</th>
                                
                                <th>ApMaterno</th>
                                
                                <th>FechaNacimiento</th>
                               
                                <th>Usuario</th>
                                
                                <th>Contraseña</th>
                                

                            </tr>                            
                            
                            <tr>
                                <td>1</td>
                                <td>Juan Carlos</td>
                                <td>Robledo</td>
                                <td>Rangel</td>
                                <td>2004-04-17</td>
                                <td>Rubikom</td>
                                <td>123456789</td>

                            </tr>
                            
                            <tr>
                                <td>2</td>
                                <td>Juan</td>
                                <td>Robledo</td>
                                <td>Rangel</td>
                                <td>2004-04-17</td>
                                <td>qwertyop</td>
                                <td>2sadasd</td>
 
                               
                            </tr>
                            
                            <tr>
                                <td>3</td>
                                <td>sdass</td>
                                <td>klgkams</td>
                                <td>asfasf</td>
                                <td>9123-13-15</td>
                                <td>asdasdasd</td>
                                <td>asdfgh</td>
                            </tr>
                            
                            <tr>
                                <td>4</td>
                                <td>Maria del R</td>
                                <td>sas</td>
                                <td>apsofkaspogf</td>
                                <td>2251-07-11</td>
                                <td>asd</td>
                                <td>juanito123</td>
                                
                            </tr>
                            
                            <tr>
                                <td>5</td>
                                <td>asd</td>
                                <td>qweqwe</td>
                                <td>qweqwe</td>
                                <td>1997-04-21</td>
                                <td>dassasafasd</td>
                                <td>asdf1234</td>

                            </tr>
                            
                            <tr>
                                <td>6</td>
                                <td>Mario</td>
                                <td>Palacios</td>
                                <td>Galindo</td>
                                <td>1969-10-13</td>
                                <td>Caldodepollo</td>
                                <td>asdf1234</td>

                            </tr>
                            
                           

                          </table>
                                                   </center>
                </div>
            </main>
        </section>
        <footer>
            <h4>Integrantes:</h4>
            <p>Gervasio Flores Isaac Antonio</p>
            <p>Robledo Rangel Juan Carlos</p>
            <p>Alba Olarra Luis Ángel</p>
        </footer>
    </body>
</html>