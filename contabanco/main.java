package POO.exercicios.umdodois.contabanco;

import java.util.Scanner;

public class main {

    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int escolha=0;
        System.out.println("digite o nome do titular da conta");
        String pessoa= scanner.nextLine();
        ContaBancaria conta=new ContaBancaria(pessoa);

        do{
            System.out.print("digite 1 para depositar\n2 para sacar\n3 para exibir o saldo\n0 para sair\n");
            escolha= scanner.nextInt();
            if(escolha!=1 && escolha!=2 && escolha!=3 && escolha!=0){
                System.out.println("esta opção não existe, por favor digite um opção correta");
            }
            System.out.println("---------------------------------------------------------------");

            switch (escolha){
                case 1:
                    System.out.println("digite o valor que deseja depositar:");
                    double a=scanner.nextDouble();
                    conta.depositar(a);
                    conta.exibirsaldo();
                    System.out.println("--------------------------------------------------------");
                break;

                case 2:
                    System.out.println("digite o valor que deseja sacar");
                    double b=scanner.nextDouble();
                    conta.sacar(b);
                    conta.exibirsaldo();
                    System.out.println("--------------------------------------------------------");
                break;

                case 3: conta.exibirsaldo();
                break;
            }

        }while(escolha!=0);

        scanner.close();





    }

}
