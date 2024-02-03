public class Aula2_Swap {
    public static void main(String[] args){
        String x = "Agua";
        String y = "Tangue";
        //x = y;
        System.out.println("x: " + x);
        System.out.println("y:" + y);

        String temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("x: " + x);
        System.out.println("y:" + y);


    }
}
