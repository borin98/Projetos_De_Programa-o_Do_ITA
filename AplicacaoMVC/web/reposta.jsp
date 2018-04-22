<%--
  Created by IntelliJ IDEA.
  User: borin
  Date: 4/22/18
  Time: 11:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="OraculoController" %>
<%@ page import="Objetos.Oraculo" %>
<%@ page import="java.util.List" %>
<html>
    <head>
        <title> Resposta dos melhores produtos </title>
    </head>
        <body>
            <h1> Os melhores produtos do tipo # ${produto} # são : </h1>
            <ul>
                <%
                    String tipoProduto = request.getParameter("produto") ;
                    Oraculo oraculo = new Oraculo ( ) ;
                    List<String> produtos = oraculo.melhoresProdutos(tipoProduto) ;
                    request.setAttribute("produtos", produtos) ;
                %>
            </ul>
        </body>
</html>
