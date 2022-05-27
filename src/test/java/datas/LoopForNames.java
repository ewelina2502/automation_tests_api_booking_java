package datas;

import datas.Faker;
import org.testng.annotations.Test;

import java.util.Random;

public class LoopForNames extends Faker {

    @Test
    public void namesOfAnimalsInLoop() {

        String[] values = new String[10];

        values[0] = printAnimalUpper();
        values[1] = printAnimalUpper();
        values[2] = printAnimalUpper();
        values[3] = printAnimalUpper();
        values[4] = printAnimalUpper();
        values[5] = printAnimalUpper();
        values[6] = printAnimalUpper();
        values[7] = printAnimalUpper();
        values[8] = printAnimalUpper();
        values[9] = printAnimalUpper();

        for (String value : values) {
            System.out.println(value);
        }

    }

    @Test
    public void loopOfNamesChars() {

        String[] meals = {"Breakfast", "Lunch", "Dinner", "Supper", "Delicious", "Fish", "Sandwich"};
        String meal = meals[new Random().nextInt(meals.length)];
//        System.out.println(meal.length() + " chars in " + meal);
        int l = meal.length();

        for (int i = 0; i < 1; i++) {
            if (l == 5) {
                System.out.println(meal + " has 5 chars it must be Lunch");
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
