package interfacegrafica;
import java.util.Scanner;

public class UnikutPrincipal {

public static void main(String[] args) {

    int opcao;
    Scanner s = new Scanner(System.in);
        System.out.println("Bem vindo");
        System.out.println("Este é a rede social UNIKUT");
        
        do{
            System.out.println("Menu");
            System.out.println("1 - criar nova conta");
            System.out.println("2 - fazer login");
            
            System.out.println("Digite a opcao desejada");
            opcao = s.nextInt();
            if (opcao == 1){
                // criar conta
                
                System.out.println("Insira seu nome");
                
                int tipoConta = s.nextInt();
                var numero = 0;
                if (tipoConta == 1){
                    numero = bancoUnicap.criarConta();
                } else if (tipoConta == 2){
                    numero = bancoUnicap.criarPoupanca();
                }  else if (tipoConta == 3){
                    numero = bancoUnicap.criarContaImposto();
                }
                System.out.println("o numero da conta criada é "+numero);
            } else if (opcao == 2){
                System.out.println("Qual o numero da Conta?");
                int numero = s.nextInt();
                System.out.println("Qual a quantia a ser depositada?");
                double depos = s.nextDouble();
                bancoUnicap.depositar(numero, depos);
            } else if (opcao == 3){
                System.out.println("Qual o numero da Conta?");
                int numero = s.nextInt();
                double valor = bancoUnicap.consultaSaldo(numero);
                System.out.println("o saldo da conta é "+ valor);
            } else if (opcao == 4){
                System.out.println("Qual o numero da Conta?");
                int numero = s.nextInt();
                System.out.println("Qual a quantia a ser sacada?");
                double saque = s.nextDouble();
                bancoUnicap.sacarConta(numero, saque);
            }  else if (opcao == 6){
                System.out.println("Qual o numero da Conta origem?");
                int numeroOri = s.nextInt();
                System.out.println("Qual o numero da Conta destino?");
                int numeroDest = s.nextInt();
                System.out.println("Qual a quantia a ser transferida?");
                double valor = s.nextDouble();
                bancoUnicap.transferir(numeroOri, numeroDest, valor);
            } else if (opcao == 7){
                System.out.println("Qual o numero da Poupanca?");
                int numeroOri = s.nextInt();
                boolean b = bancoUnicap.renderPoupanca(numeroOri);
                if (b){
                    System.out.println("redimento realizado");
                } else {
                    System.out.println("não disponível para seu tipo de conta");
                }
            }
        }while(opcao != 5);
        System.out.println("Até mais!");
        s.close();
    }
}


        }

    }    