import java.util.Locale;
import java.util.Random;

public class DraftTests extends Data {

    public static void main(String[] args) {

        String[] specjalName = {"!", "@", "#", "$", "%"};
        String specjal = specjalName[new Random().nextInt(specjalName.length)];

        com.github.javafaker.Faker faker = new com.github.javafaker.Faker(new Locale("no"));
        System.out.println(faker.name().firstName() + specjal);




    }


    }




