package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LetterGame {

    // Properties
    private static ArrayList<Character> englishList = new ArrayList<>();
    private static ArrayList<Character> spanishList = new ArrayList<>();

    public static void main(String[] args) {

        // Variables
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String input = "";

        System.out.println("Welcome to the Letter Game");

        while(!input.equalsIgnoreCase("exit")) {
            int index = random.nextInt(26);
            System.out.printf("What is the %d letter of spanish?", index);

            input = scanner.next();

            if(input.charAt(0) == spanishList.get(index)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect");
            }
        }
    }
}
