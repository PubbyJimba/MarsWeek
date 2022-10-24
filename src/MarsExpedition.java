import java.util.Scanner;

import static java.lang.System.*;

public class MarsExpedition {
        public MarsExpedition() throws InterruptedException {
        Scanner input = new Scanner(in);

        out.println("Expedition prep program starting...");
        Thread.sleep(250);
        out.println("Booting up...");
        Thread.sleep(500);
        out.println("...");
        Thread.sleep(500);
        out.println("...");
        Thread.sleep(500);
        out.println("...");
        Thread.sleep(500);
        out.println("Ready");

        out.println("What is your name?");
        String name = input.nextLine();

        out.println("\nHi, " + name + " - Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
        String answer = input.nextLine();

        if (answer.equals("Y")) {
            out.println("\nI knew you would say that. You are a team leader for a reason.\n");
        } else if (answer.equals("N")) {
            out.println("\nToo bad you are team leader. You have to go.\n");
        }

        out.println("How many people do you want on your expedition team? (Input an int number)");
        int teamSize = input.nextInt();
        input.nextLine();

        if (teamSize > 2) {
            out.println("\nThat's way to many people. We can only send 2 more members");
            teamSize = 2;
        } else if (teamSize < 2) {
            out.println("\nThat's not enough people. We need you and 2 more members.");
            teamSize = 2;
        } else if (teamSize == 2) {
            out.println("\nThat's a perfect sized team. Good job.");
        }

        out.println("\nYou are allowed to bring one snack with you. What do you want to bring?");
        String snack = input.nextLine();

        out.println("\nNice choice, you will be bringing a " + snack + " with you.\n");

        out.println("You can bring one of the following vehicles:\n" +
                "\n A: Blake the rover" +
                "\n B: Clyde the horse" +
                "\n C: Davyn the magic carpet");
        String vehicle = input.nextLine();

        if (vehicle.equalsIgnoreCase("A")) {
            vehicle = "Blake the rover";
        } else if (vehicle.equalsIgnoreCase("B")) {
            vehicle = "Clyde the horse";
        } else if (vehicle.equalsIgnoreCase("C")) {
            vehicle = "Davyn the magic carpet";
        } else {
            vehicle = "their feet";
        }

        out.println("\nYour expedition team is now ready" +
                "\nLed by " + name + " with " + teamSize + " teammates." +
                "\nTo explore the surface of Mars using " + vehicle + ".\n" +
                "\nExploration team heads out in");
        Thread.sleep(500);
        out.println("5...");
        Thread.sleep(500);
        out.println("4...");
        Thread.sleep(500);
        out.println("3...");
        Thread.sleep(500);
        out.println("2...");
        Thread.sleep(500);
        out.println("1...");
        Thread.sleep(500);
        out.println("GO GO GO!");

    }
}
