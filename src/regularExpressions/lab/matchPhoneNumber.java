package regularExpressions.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matchPhoneNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regEx = "\\+359([- ])2\\1\\d{3}\\1\\d{4}\\b";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(input);

        List<String> matchingNumbers = new ArrayList<>();

        while (matcher.find()) {
            String match = matcher.group();
            matchingNumbers.add(match);
        }

        System.out.println(String.join(", ", matchingNumbers));
    }
}
