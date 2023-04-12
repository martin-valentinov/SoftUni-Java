package arrays.exercise;


import java.util.Scanner;


public class treasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] treasureChest = scanner.nextLine().split("\\|");

        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("Yohoho!")) {
            switch (command[0]) {
                case "Loot":
                    for (int i = 1; i < command.length; i++) {
                        boolean isIdentical = false;
                        for (String loot : treasureChest) {
                            if (command[i].equals(loot)) {
                                isIdentical = true;
                                break;
                            }
                        }
                        if (!isIdentical) {
                            String newTreasureChest = command[i] + " " + String.join(" ", treasureChest);
                            treasureChest = newTreasureChest.split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(command[1]);
                    if (index < treasureChest.length && index >= 0) {
                        String tempValue = treasureChest[index];
                        for (int i = index; i < treasureChest.length - 1; i++) {
                            treasureChest[i] = treasureChest[i + 1];
                        }
                        treasureChest[treasureChest.length - 1] = tempValue;
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(command[1]);
                    if (count <= treasureChest.length) {
                        for (int i = treasureChest.length - count; i < treasureChest.length - 1; i++) {
                            System.out.print(treasureChest[i] + ", ");
                        }
                        System.out.print(treasureChest[treasureChest.length - 1]);
                        System.out.println();

                        String[] newTreasureChest = new String[treasureChest.length - count];
                        for (int i = 0; i < newTreasureChest.length; i++) {
                            newTreasureChest[i] = treasureChest[i];
                        }
                        treasureChest = newTreasureChest;
                    } else {
                        for (int i = 0; i < treasureChest.length - 1; i++) {
                            System.out.print(treasureChest[i] + ", ");
                        }
                        System.out.print(treasureChest[treasureChest.length - 1]);
                        System.out.println();
                        treasureChest = new String[0];
                    }
                    break;
            }

            command = scanner.nextLine().split(" ");
        }

        if (treasureChest.length == 0) {
            System.out.println("Failed treasure hunt.");
        } else {
            double sum = 0.0;
            for (String item:
                    treasureChest) {
                sum += item.length();
            }

            double averageTreasureGain = sum / treasureChest.length;
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasureGain);
        }
    }
}
