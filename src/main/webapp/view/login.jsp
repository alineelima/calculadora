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
        <title>Login</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="resources/css/login.css"/>
        <script src="resources/js/jquery-3.3.1.min.js"></script>
        <script src="resources/js/login.js"></script>
    </head>
    <body>
        <h1>Login</h1>

    <form action="" method="post">
        <div class="imgcontainer">
            <img src="resources/images/login-icon.png" alt="Avatar" class="avatar">
        </div>

        <div class="container">
            <label class="content" for="uname"><b>Email</b></label>
            <input type="text" placeholder="Digite seu email" name="email" id="email" required>
        </div>
        <div class="container">
            <label class="content" for="psw"><b>Senha</b></label>
            <input type="password" placeholder="Digite sua senha" name="senha" id="senha" required> 
        </div>

        <div class="container" style="background-color:#f1f1f1">
            <button type="submit" onclick="login($('#email').val(), $('#senha').val())">Entrar</button>
            <span class="psw"> 
                <a href="/calculadora/cadastrar">Cadastre-se</a>
            </span>
        </div>
    </form>

    </body>
</html>