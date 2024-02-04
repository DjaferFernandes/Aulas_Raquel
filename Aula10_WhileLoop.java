import java.util.Scanner;

public class Aula10_WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";

        do{
            System.out.println("Digite seu nome:");
        } while(name.isBlank());

        System.out.println("Bem vindo, " + name);
    }
}
