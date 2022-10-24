import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.*;

public class GuessingGame {
    public GuessingGame() {
        var scan = new Scanner(in);
        int number = (int) (100 * Math.random());
        int tries = 0;

        out.println("Howdy, what's your name?");
        String name = scan.nextLine();
        out.println("\n" + name + ", I'm thinking of a number between 1 and 100.");
        out.println("Try to guess my number.\n");


        while (true) {
            out.println("Your guess?");
            int guess;
            try {
                guess = scan.nextInt();
            } catch (InputMismatchException e) {
                String bad_input = scan.next(); // progress past the bad input
                out.println("That's not an integer, try again.\n");
                continue;
            }

            if (guess < 1 || guess > 100) {
                out.println(guess + " is not a valid number, try again.\n");
                continue;
            }

            if (guess < number) {
                out.println("Too low. Guess again.\n");
                tries++;
            } else if (guess > number) {
                out.println("Too high. Guess again.\n");
                tries++;
            } else {
                tries++;
                out.println("\n\tWell done, " + name + "! You found my number in " + tries + " tries!");
                break;
            }
        }
    }
}
