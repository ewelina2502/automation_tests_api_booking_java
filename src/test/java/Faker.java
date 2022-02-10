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

}
