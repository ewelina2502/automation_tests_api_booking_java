import java.util.Random;

public class DraftTests extends Data {

    public static String printNeeds() {
        String[] needs = {"Breakfast", "Lunch", "Dinner"};
        return needs[new Random().nextInt(needs.length)];
    }

    public static void main(String[] args) {

        String[] needs = {"Breakfast", "Lunch", "Dinner", "Supper", "Delicious", "Fish", "Sandwich"};
        int l = needs[new Random().nextInt(needs.length)].length();
//        System.out.println(printNeeds());


        for (int i = 0; i < 1; i++) {
            if (l == 5 ) {
                System.out.println("5 chars it must be Lunch");
            } else if (l == 4) {
                System.out.println("4 chars it must be Fish");
            } else if (l >= 9) {
                System.out.println(printNeeds() + " has more than 5 chars");
            } else {
                System.out.println("It isn't 5 chars");
            }
        }
    }
}


