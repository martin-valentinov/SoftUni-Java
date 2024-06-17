package regularExpressions.exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validPassword {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "_\\.+[A-Z][A-Za-z0-9]{4,}[A-Z]_\\.+";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 1; i <= n; i++){
            String password = scanner.nextLine();
            Matcher matcher = pattern.matcher(password);

            if (matcher.find()){
                String group = group(password);
                System.out.println("Group: " + group);
            } else {
                System.out.println("Invalid pass!");
            }
        }
    }

    private static String group(String password){
        StringBuilder group = new StringBuilder();

        for (char ch : password.toCharArray()){
            if (Character.isDigit(ch)){
                group.append(ch);
            }
        }

        if (group.isEmpty()){
            return "default";
        } else {
            return group.toString();
        }


    }
}
