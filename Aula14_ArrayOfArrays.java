public class Aula14_ArrayOfArrays {
    public static void main(String[] args){
    String[][] cars = {
            {"camaro", "corvet", "Silverado"},
            {"Mustang", "Ranger", "F-1500"},
            {"Ferrari", "Lambo", "Tesla"}
    };

    for (int i=0; i < cars.length; i++) {
        System.out.println();
        for (int j=0; j < cars[i].length; j++){
            System.out.print(cars[i][j] + " ");
        }
        }
    }
}
