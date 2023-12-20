import java.util.Scanner;
public class BEE1002 {
    public static void main(String[] args){
        double n = 3.14159;
        Scanner sc = new Scanner(System.in);
        double R = sc.nextDouble();
        double Area = n * (R * R);
        System.out.printf("A" + " = %.4f", Area);
    }
}
