package main.java.tarok;
import java.util.Scanner;  // Import the Scanner class

public class Demo {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter a name for player one:");
        String playerOneName = userInput.nextLine();

        System.out.println("Please enter a name for player two:");
        String playerTwoName = userInput.nextLine();

        System.out.println("Please enter a name for player three:");
        String playerThreeName = userInput.nextLine();

        Cup cup1 = new Cup(playerOneName, 0);
        Cup cup2 = new Cup(playerTwoName, 0);
        Cup cup3 = new Cup(playerThreeName, 0);

        System.out.println("Give announcement (points) to a player:");
//        System.out.print("Which cup?:");
//        String cupInput = userInput.nextLine();
        System.out.print("Announcement:");
        String announcement = userInput.nextLine();
        System.out.print("Extra tarots amount?:");
        String extraTarotsAmount = userInput.nextLine();
        System.out.print("Extra matadors amount?:");
        String extraMatadorsAmount = userInput.nextLine();

        registerCupPoints(cup1, announcement, Integer.parseInt(extraTarotsAmount), Integer.parseInt(extraMatadorsAmount));
        System.out.println("All players: " + cup1.getPlayerName() + " " + cup2.getPlayerName() + " " + cup3.getPlayerName());
//        cup1.updateCupPoints("half kings", 2, 0);
    }

    public static void registerCupPoints(Cup cup, String announcement, int extraTarotsAmount, int extraMatadorsAmount) {
        cup.updateCupPoints(announcement, extraTarotsAmount, extraMatadorsAmount);
    }

    public static void displayPlayer(String playerName, Cup cup){
        System.out.println("Points for " + playerName + ": "  + cup.getPoints());
    }





}
