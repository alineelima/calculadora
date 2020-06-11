function cadastrar(nome, email, senha){
    $.ajax({
        url: '/calculadora/cadastrar',
        method: 'POST',
        data:{nome:nome, email:email, senha:senha},
        success: function(response) {
            console.log("sucessss");
            window.location.href = "http://localhost:8080/calculadora/login"
          },
          error: function (response) {
            alert('Erro ao realizar cadastro. Verifique seus dados se tente novamente');
          }
    });
}