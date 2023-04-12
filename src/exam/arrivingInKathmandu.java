package exam;
import java.util.Scanner;

public class arrivingInKathmandu {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final String CIPHER_REGEX = "([a-zA-Z0-9!@#$?]+)=(\\d+)<<(\\S+)";
        boolean isLastNote = false;

        while (!isLastNote) {
            String message = s.nextLine();

            if (message.equalsIgnoreCase("Last note")) {
                isLastNote = true;

            } else {
                message.replaceAll("\\s","");

                if (message.matches(CIPHER_REGEX)) {
                    String peak = message.split("=")[0].replaceAll("[!@#$?]", "");
                    int geohashcodeExpLength = Integer.parseInt(message.split("=")[1].split("<<")[0]);
                    String geohashcode = message.split("<<")[1];

                    if(geohashcodeExpLength == geohashcode.length()) {
                        System.out.println("Coordinates found! " + peak + " -> " + geohashcode);
                    } else {
                        System.out.println("Nothing found!");
                    }

                } else {
                    System.out.println("Nothing found!");
                }
            }
        }
        s.close();
    }

}
