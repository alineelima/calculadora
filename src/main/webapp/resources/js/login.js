function login(email, senha){
    $.ajax({
        url: '/calculadora/login',
        method: 'POST',
        data:{email:email, senha:senha},
        success: function(response) {
            //console.log("success message");
            window.location.href = "http://localhost:8080/calculadora/calcular"
          },
          error: function (response) {
            alert('Erro ao realizar login. Verifique email e senha e tente novamente');
          }
    });
}