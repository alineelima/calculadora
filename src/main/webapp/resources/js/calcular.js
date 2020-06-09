var a;
var b = 0;
var operacao = null;

//colcoar logica para calcular numero negativo, checar se a != null e setar a como null no inicio!!

function display(valor){
    document.getElementById('display').value += valor;
}

function numero(num){
    display(num);
    console.log(operacao);
    if(operacao != null){
        console.log('entrei no if');
        b += num;
        document.querySelector('[id="result"]').disabled = false
    }
};

function operacaoCalc(op){
    //verifica se o display está vazio e se o operador é - indicando que o numero é negtivo
    var check = document.getElementById('display').value;
    if(check == null || check == "" && op == "-"){
        console.log('display esta vazio');
        display(op);
        disableOp(false);
    } 
    else if(operacao == null){
        a = document.getElementById('display').value;
        operacao = op;
        display(op);
        //disableOp(true);
    } 
    else{
        numero(op);
    }    
}

function limpar(){
    document.getElementById('display').value = "";
    a = "";
    b = 0;
    operacao = null;
    disableOp(false);
}

function isFloat(ponto){
    display(ponto);
}

function disableOp(val){
    if(val == true){
        var elems = document.querySelectorAll('[id="opr"]');
        for (var i = 0; i < elems.length; i++) {
            elems[i].disabled = true;
        }
    } else{
        var elems = document.querySelectorAll('[id="opr"]');
        for (var i = 0; i < elems.length; i++) {
            elems[i].disabled = false;
        }
    }
    
}

function resultado(){
     alert(a + operacao);
     console.log(b);

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