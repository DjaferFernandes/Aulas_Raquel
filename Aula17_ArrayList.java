import java.util.ArrayList;

public class Aula17_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("gabriel");
        food.add("hot dog");
        //food.set(0, "Sushi");
        //food.remove(2);
        //food.clear();

        for(int i=0; i<food.size();i++){
            System.out.println(food.get(i));
        }
    }
}
