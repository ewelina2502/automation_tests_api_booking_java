import java.util.Random;

public class DraftTests extends Data {


    public static void main(String[] args) {

        String[] meals = {"Breakfast", "Lunch", "Dinner", "Supper", "Delicious", "Fish", "Sandwich"};
        String meal = meals[new Random().nextInt(meals.length)];
//        System.out.println(meal.length() + " chars in " + meal);
        int l = meal.length();

        for (int i = 0; i < 1; i++) {
            if (l == 5 ) {
                System.out.println(meal +" has 5 chars it must be Lunch");
            } else if (l == 4) {
                System.out.println(meal + " has 4 chars it must be Fish");
            } else if (l == 6) {
                System.out.println(meal + " has 6 chars in is expected: Dinner or Supper");
            } else if (l >= 9) {
                System.out.println(meal + " it is equal or more than 9 chars is expected: Breakfast or Delicious");
            } else {
                System.out.println(meal + " hasn't 5 chars it has: " + meal.length() + " chars and is expected: Sandwich");
            }
        }
    }
}


