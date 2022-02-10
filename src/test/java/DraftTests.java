public class DraftTests extends Data {


    public static void main(String[] args) {
        String needs = "Lunches";
        int l = needs.length();
//        char chars;
//        System.out.println(l);

        for (int i = 0; i < 1; i++) {
//            chars = needs.charAt(i);

            if (l == 5 ) {
                System.out.println(needs + " has 5 chars");
            } else if (l > 10) {
                System.out.println(needs + " has "+ l + " chars");
            } else {
                System.out.println("It isn't 5 chars");
            }
        }
    }
}


