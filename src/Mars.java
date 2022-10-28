import java.util.Scanner;

import static java.lang.System.*;

public class Mars {

    public static void main(String[] args) throws InterruptedException {
        var scan = new Scanner(in);
        String colonyName = "Marsville";

        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        meals = meals - (shipPopulation * 0.75);
        meals = meals - (shipPopulation * 0.75);
        out.println(meals);
        meals *= 1.5;
        shipPopulation += 5;

        String landingLocation = "The Ocean";
        if (landingLocation == "The Plain") {
            out.println("Bbzzz Landing on the Plain");
        } else {
            out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }
        landing = landingCheck(10);

        new GuessingGame();
        new MarsExpedition();
        new FindingsList();
    }

    public static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for (int minute = 0; minute <= minutesLeft; minute++) {
            if (minute % 2 == 0 && minute % 3 == 0) {
                out.println("Keep Center");
            } else if (minute % 3 == 0) {
                out.println("Left");
            } else if (minute % 2 == 0) {
                out.println("Right");
            } else {
                out.println("Calculating");
            }
            Thread.sleep(250);
        }

        out.println("Landed");
        return false;
    }
}
