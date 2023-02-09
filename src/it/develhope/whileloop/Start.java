package it.develhope.whileloop;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;
        do {
            System.out.print("Please enter a command: ");
            command = scanner.nextLine();
            System.out.println("You entered the command: " + command);
        } while (!command.equals("stop"));
    }
}


// use a do-while so that you can always ask for the command first (because the condition is verified later)

