import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;


public class Faker {

    public static String printDate() {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        return ft.format(dNow);
    }

    public static String printTomorrow() {
        LocalDate today = LocalDate.now();
        return String.valueOf(today.plusDays(1));
    }

    public static String printFirstNameFaker() {
        com.github.javafaker.Faker faker = new com.github.javafaker.Faker(new Locale("pl"));
        return faker.name().firstName();
    }

    public static String printLastNameFaker() {
        com.github.javafaker.Faker faker = new com.github.javafaker.Faker(new Locale("pl"));
        return faker.name().lastName();
    }

    public static String printFirstNameNorway() {
        com.github.javafaker.Faker faker = new com.github.javafaker.Faker(new Locale("no"));
        return faker.name().firstName();
    }

    public static String printFirstNameLength() {
        com.github.javafaker.Faker faker = new com.github.javafaker.Faker(new Locale("no"));
         return faker.name().firstName().substring(0,1).toUpperCase() + faker.name().firstName().substring(5).toLowerCase();

    }

    public static String printLastNameNorway() {
        com.github.javafaker.Faker faker = new com.github.javafaker.Faker(new Locale("no"));
        return faker.name().lastName();
    }

    public static String  printSpecjalSign() {
        String[] specjalName = {"!", "@", "#", "$", "%"};
        String specjal = specjalName[new Random().nextInt(specjalName.length)];
        com.github.javafaker.Faker faker = new com.github.javafaker.Faker(new Locale("no"));
        return faker.name().lastName() + specjal;
    }

    public static String printAnimal() {
        com.github.javafaker.Faker faker = new com.github.javafaker.Faker(new Locale("no"));
        return faker.animal().name();
    }

    public static String printDogName() {
        com.github.javafaker.Faker faker = new com.github.javafaker.Faker(new Locale("no"));
        return faker.dog().name();
    }

    public static String printAnimalUpper() {
        com.github.javafaker.Faker faker = new com.github.javafaker.Faker();
        return faker.animal().name().substring(0, 1).toUpperCase() + faker.animal().name().substring(1);
    }

    public static String printNeeds() {
        String[] needs = {"Breakfast", "Lunch", "Dinner"};
        return needs[new Random().nextInt(needs.length)];
    }

    public static int printGenerator() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(9999);
    }

    public static String printUuid() {
        return UUID.randomUUID().toString();
    }

    public static void main(String[] args) {

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
