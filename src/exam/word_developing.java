package exam;

import java.util.Scanner;

public class word_developing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder s = new StringBuilder();

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            switch (command.split(" ")[0]) {
                case ("Add"):
                    String newWord = command.split(" ")[1];
                    s.append(newWord);
                    break;
                case ("Upgrade"):
                    char oldChar = command.split(" ")[1].charAt(0);
                    char newChar = (char) (oldChar + 1);
                    String tempString = s.toString();
                    String newTempString = tempString.replace(oldChar, newChar);
                    s.replace(0, s.length(), newTempString);
                    break;
                case ("Print"):
                    System.out.println(s);
                    break;
                case ("Index"):
                    char ch = command.split(" ")[1].charAt(0);
                    String str = s.toString();
                    printCharIndex(str, ch);
                    break;
                case ("Remove"):
                    String substring = command.split(" ")[1];
                    String newString = s.toString();
                    String changedString = replaceSubstring(newString, substring);
                    s.replace(0, s.length(), changedString);
                    break;
            }

            System.out.println();

            command = scanner.nextLine();
        }
    }

    public static void printCharIndex (String s, char ch) {
        int check = 0;
        for (int i = 0; i < s.length(); i++) {
            if (ch == s.charAt(i)) {
                System.out.print(i + " ");
                check++;
            }
        }

        if (check == 0) {
            System.out.println("None");
        }
    }

    public static String replaceSubstring (String str, String subStr) {
        String string = str;

        int index = str.indexOf(subStr);
        while (index != - 1) {
            string = string.replace(subStr, "");
            index = string.indexOf(subStr);
        }
        return string;
    }
}
