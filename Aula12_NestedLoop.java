import java.util.Scanner;

public class Aula12_NestedLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linhas;
        int colunas;
        String symbol = "@";
        System.out.println("Escolha o numero de linhas:");
        linhas = scanner.nextInt();
        System.out.println("Escolha o numero de colunas:");
        colunas = scanner.nextInt();

        for(int i=1; i<= linhas; i++){
            System.out.println();
            for(int j=1; j<=colunas; j++){
                System.out.print(symbol);
            }


    }

    }
}
