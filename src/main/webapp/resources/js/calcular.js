var a;
var b = 0;
var operacao;

function display(valor){
    document.getElementById('display').value += valor;
}

function numero(num){
    display(num);

    if(operacao != null){
        console.log('entrei no if');
        b += num;
        document.querySelector('[id="result"]').disabled = false
    }
};

function operacaoCalc(op){
    a = document.getElementById('display').value;
    operacao = op;
    display(op);
    disableOp();
}

function limpar(){
    document.getElementById('display').value = "";

    document.querySelector('[id="result"]').disabled = true;
    var elems = document.querySelectorAll('[id="opr"]');
    for (var i = 0; i < elems.length; i++) {
        elems[i].disabled = false;
    }

    a = "";
    b = 0;
    operacao = null;
}

function isFloat(ponto){
    display(ponto);
}

function disableOp(){
    var elems = document.querySelectorAll('[id="opr"]');
    for (var i = 0; i < elems.length; i++) {
        elems[i].disabled = true;
    }
}

function resultado(){
     alert(a + operacao);
     console.log(b);

    document.querySelector('[id="result"]').disabled = true;
    var elems = document.querySelectorAll('[id="opr"]');
    for (var i = 0; i < elems.length; i++) {
        elems[i].disabled = false;
    }

    $.ajax({
        url: '/calculadora/calcular',
        method: 'POST',
        data:{a:a, b:b, operacao:operacao},
        success: function(response) {
            console.log("success message");
            //window.location.href = "http://localhost:8080/calculadora/calcular"
          },
          error: function (response) {
            alert('Erro ao realizar login. Verifique email e senha e tente novamente');
          }
    });
}