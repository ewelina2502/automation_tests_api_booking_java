public class LoopForNames extends Faker {

    public static void main(String[] args) {

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
}
