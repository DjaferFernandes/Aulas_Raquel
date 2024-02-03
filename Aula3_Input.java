import java.util.Scanner;
public class Aula3_Input {
    public static void main(String[] args) {
        //Importar o java.util.Scanner;

        //cria um novo scanner
        Scanner novoScanner = new Scanner(System.in);
        //printa a proxima linha escaneada
        System.out.println(novoScanner.nextLine());

        //Depois de um nextInt(), usar um nextLine para "Limpar" o scanner.
    }
}
