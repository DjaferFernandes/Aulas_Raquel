import java.util.Scanner;
// Não ta adicionando mais de um contato :(
public class Agenda {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);

        //Arrays
        int inicializador = 10;
        String[] nomes = new String[inicializador];
        String[] email = new String[inicializador];
        String[] numero = new String[inicializador];
        int proxPosLivre = 0;
        //adionar contato
        int decisão = 0;
        while (decisão == 0){
            System.out.println("Oq deseja fazer?");
            decisão = sc.nextInt();
        }
        while (decisão == 1) {
            System.out.println("nome");
            sc.next();
            nomes[proxPosLivre] = sc.nextLine();
            System.out.println("Email");
            email[proxPosLivre] = sc.nextLine();
            System.out.println("numero");
            numero[proxPosLivre] = sc.nextLine();
            proxPosLivre++;
            decisão = 0;
        }
        // buscar contato
        while (decisão == 2){
            for (int i = 0; i < nomes.length; i++){
                if (nomes[i] != null){
                    System.out.println(nomes[i]);
                }
            }
            decisão = 0;
        }
        System.out.println("Deu ruim");
        sc.close();
    }
}
