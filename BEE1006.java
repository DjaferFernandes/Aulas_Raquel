import java.util.Scanner;
public class BEE1006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double A = sc.nextDouble() * 2;
        Double B = sc.nextDouble() * 3;
        Double C = sc.nextDouble() * 5;
        Double MEDIA = (A + B + C) / 10;
        System.out.println("MEDIA = " + MEDIA);

    }
}
