package model;

//@Entity
//@Table(name = "historico")
public class Historico {

    //@Column(name = "nome", nullable = false)
    private String nome;

    //@Column(name = "num1", nullable = false)
    private String num1;

    //@Column(name = "num2", nullable = false)
    private String num2;

    //@Column(name = "operacao", nullable = false)
    private String operacao;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNum1(String num1){
        this.num1 = num1;
    }

    public String getNum1(){
        return this.num1;
    }

    public void setNum2(String num2){
        this.num2 = num2;
    }

    public String getNum2(){
        return this.num2;
    }

    public void setOperacao(String operacao){
        this.operacao = operacao;
    }

    public String getOperacao(){
        return this.operacao;
    }
}