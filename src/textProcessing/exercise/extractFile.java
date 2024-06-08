package textProcessing.exercise;

import java.util.Scanner;

public class extractFile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] filePath = scanner.nextLine().split("\\\\");
        String[] file = filePath[filePath.length - 1].split("\\.");

        System.out.printf("File name: %s%n", file[0]);
        System.out.printf("File extension: %s", file[1]);
    }
}
