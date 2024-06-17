package regularExpressions.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class starEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("@(?<name>[A-Za-z]+)[^@!:>-]*?:(?<population>\\d+)[^@!:>-]*?!(?<attackType>[AD])![^@!:>-]*?->(?<soldierCount>\\d+)");

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (int i = 1; i <= numberOfLines; i++){
            String encryptedMessage = scanner.nextLine();
            String decryptedMessage = decryptedMessage(encryptedMessage);

            Matcher matcher = pattern.matcher(decryptedMessage);

            if (matcher.find()) {
                String planet = matcher.group("name");
                String attackType = matcher.group("attackType");

                if (attackType.equals("A")){
                    attackedPlanets.add(planet);
                } else if (attackType.equals("D")){
                    destroyedPlanets.add(planet);
                }
            }

        }

        Collections.sort(attackedPlanets);
        Collections.sort(destroyedPlanets);

        System.out.printf("Attacked planets: %d%n", attackedPlanets.size());
        attackedPlanets.forEach(planet -> System.out.println("-> " + planet));
        System.out.printf("Destroyed planets: %d%n", destroyedPlanets.size());
        destroyedPlanets.forEach(planet -> System.out.println("-> " + planet));
    }

    private static String decryptedMessage(String encryptedMessage) {
        int countBack = countBack(encryptedMessage);
        StringBuilder decryptedMessage = new StringBuilder();

        for (char symbol: encryptedMessage.toCharArray()) {
            char newChar = (char) (symbol - countBack);
            decryptedMessage.append(newChar);
        }

        return decryptedMessage.toString();
    }

    private static int countBack(String encryptedMessage){
        int count = 0;
        for (char symbol : encryptedMessage.toCharArray()) {
            switch (symbol) {
                case 's':
                case 't':
                case 'a':
                case 'r':
                case 'S':
                case 'T':
                case 'A':
                case 'R':
                    count++;
                    break;
            }
        }
        return count;
        }
    }

