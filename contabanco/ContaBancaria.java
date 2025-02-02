package POO.exercicios.umdodois.contabanco;


public class ContaBancaria {

    public String titular;
    private double saldo;

    public ContaBancaria(String titular){
        this.titular=titular;
        this.saldo=0.0;

    }

    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Valor inválido! O depósito deve ser maior que zero.");
        }


    }
    public void sacar(double valor){

        if(valor>saldo){
            System.out.println("você não tem essa quantia em conta para sacar");
        }else if (valor <= 0) {
            System.out.println("O valor de saque deve ser maior que zero.");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        }
    }
    public void exibirsaldo(){
        System.out.println("o saldo atualizado é: "+saldo);
    }















}
