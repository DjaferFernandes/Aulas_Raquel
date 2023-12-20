import java.util.Scanner;
public class BEE1008 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number =  sc.nextInt();
        int work = sc.nextInt();
        Double money = sc.nextDouble();
        Double salary = work * money;
        System.out.println("NUMBER = " + number);
        System.out.println("SALARY = " + "U$ " + salary);
    }
}
