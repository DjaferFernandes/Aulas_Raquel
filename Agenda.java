import java.util.List;
import java.util.Scanner;
// Ta adicionando :)
public class Agenda {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);

        int inicializador = 5;
        String[] nomes = new String[inicializador];
        String[] email = new String[inicializador];
        String[] numero = new String[inicializador];
        int decisão;
        int proxPosLivre = 0;
        do {
            System.out.println("Oq deseja fazer?");
            decisão = Integer.parseInt(sc.nextLine());




            if (decisão == 1) {
                System.out.println("nome");
                nomes[proxPosLivre] = sc.nextLine();
                System.out.println("Email");
                email[proxPosLivre] = sc.nextLine();
                System.out.println("numero");
                numero[proxPosLivre] = sc.nextLine();
                decisão = 5;
                proxPosLivre++;
            }
            if(decisão == 2){

                System.out.println("Quer quem mzr?");
                String p = sc.nextLine();

                for (int i = 0; i < nomes.length; i++){

                    if (String.valueOf(p).equals(String.valueOf(nomes[i]))) {
                        System.out.println(nomes[i]);
                        System.out.println(email[i]);
                        System.out.println(numero[i]);
                    }

                }
                decisão = 5;
            }
        } while (decisão == 5);

    }

}
