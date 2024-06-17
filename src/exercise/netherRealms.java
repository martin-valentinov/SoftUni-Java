package regularExpressions.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class netherRealms {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<String> demonNames = Arrays.stream(scanner.nextLine().split("\\s*,\\s*")).collect(Collectors.toList());

        Pattern health = Pattern.compile("[^\\d\\+\\-\\*\\/\\.]");
        Pattern numbers = Pattern.compile("-?[\\d]+\\.?[\\d]*");
        Pattern modifier = Pattern.compile("[\\*\\/]");


        for (String name : demonNames){
            Matcher matcherHealth = health.matcher(name);
            int totalHealth = 0;

            while (matcherHealth.find()){
                char healthToAdd = matcherHealth.group().toCharArray()[0];
                totalHealth += healthToAdd;
            }

            Matcher matcherNumbers = numbers.matcher(name);
            double totalDamage = 0.0;

            while (matcherNumbers.find()){
                double damageToAdd = Double.parseDouble(matcherNumbers.group());
                totalDamage += damageToAdd;
            }

            Matcher matcherModifiers = modifier.matcher(name);

            while (matcherModifiers.find()){
                if (matcherModifiers.group().equals("*")){
                    totalDamage *= 2;
                } else if (matcherModifiers.group().equals("/")){
                    totalDamage /= 2;
                }
            }

            System.out.printf("%s - %d health, %.2f damage%n", name, totalHealth, totalDamage);

        }

    }
}
