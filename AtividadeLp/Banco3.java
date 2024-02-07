package AtividadeLp;

import banco.entidades.ContaSimples;

import java.util.Scanner;

public class Banco3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaSimples pessoa1 = new ContaSimples("João", "30914060506");
        ContaSimples pessoa2 = new ContaSimples("Ana", "12345678901");


        System.out.println("Digite o valor a ser depositado na conta de João:");
        pessoa1.depositar(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o valor a ser transferido para conta de Ana:");
        int valor2 = Integer.parseInt(sc.nextLine());
        pessoa2.transferir(pessoa1, valor2);

    }

}
