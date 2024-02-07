package AtividadeLp;

import banco.entidades.ContaSimples;

public class Banco2 {
    public static void main(String[] args) {
        ContaSimples conta1 = new ContaSimples("João", "309140605-06");
        ContaSimples conta2 = new ContaSimples("Ana", "123456789-01");


        conta1.depositar(1000);
        conta1.transferir(conta2, 400);
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());

    }
}
