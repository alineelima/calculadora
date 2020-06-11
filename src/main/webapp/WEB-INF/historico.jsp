<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Historico</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="resources/css/historico.css"/>
        <script src="resources/js/jquery-3.3.1.min.js"></script>
        <script src="resources/js/historico.js"></script>
    </head>
    <body>

        <h1>Historico</h1>

        <div class="container">
            <table id="t01">
                <tr>
                <td>Jill realizou a operacao 2+2</td>
                </tr>
                <tr>
                <td>Eve realizou a operacao 3x4</td>
                </tr>
                <tr>
                <td>John realizou a operacao 9/3</td>
                </tr>
            </table>
        </div>
        <div>
            <button onclick="calcular()" >Voltar para calculadora</button>
        </div>
    </body>
</html>