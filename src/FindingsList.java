import java.util.*;

import static java.lang.System.*;

public class FindingsList {
        public FindingsList() throws InterruptedException {
//    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(1000);

        out.println("\nWelcome back from your expedition!");

        Thread.sleep(1000);

        List<String> findings = new ArrayList<>();

        findings.add("rock");
        findings.add("weird rock");
        findings.add("smooth rock");
        findings.add("not rock");

        out.println("\nRock data downloaded!");

        out.println(findings);

        Thread.sleep(500);

        out.println("\nWait a second, that last one isn't a rock...\n");

        findings.remove("not rock");

        Thread.sleep(500);

        out.println(findings);

        out.println("\nPerfect.\n");


        Thread.sleep(1000);

        HashMap<String, String> fossils = new HashMap<>();

        out.println("Fossil data downloaded!\n");

        Thread.sleep(500);

        fossils.put("Bird Fossil", "The fossil has wings implying it was capable of flight.");
        fossils.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water.");
        fossils.put("Tooth Fossil", "The tooth from an unknown fossil.");

        out.println("Which of the fossils would you like to learn more about? (Bird, Fish or Tooth)");

        Scanner scan = new Scanner(in);

        String fossilChoice = scan.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird")) {
            out.println("\nYou chose: " + fossilChoice + "\nDescription: " + fossils.get(fossilChoice + " Fossil"));
        } else if (fossilChoice.equalsIgnoreCase("Fish")) {
            out.println("\nYou chose: " + fossilChoice + "\nDescription: " + fossils.get(fossilChoice + " Fossil"));
        } else if (fossilChoice.equalsIgnoreCase("Tooth")) {
            out.println("\nYou chose: " + fossilChoice + "\nDescription: " + fossils.get(fossilChoice + " Fossil"));
        } else {
            out.println("\nWe don't have any fossils like that...");
        }

        Thread.sleep(700);

        Set<String> supplies = new HashSet<>();

        supplies.add("Grappling Hook");
        supplies.add("Laser Pistol");
        supplies.add("Super Yummy Snacks");

        out.println("\nSupplies before expedition:");
        out.println(supplies);

        Thread.sleep(500);

        supplies.remove("Super Yummy Snacks");
        out.println("\nSupplies after expedition:");
        out.println(supplies);

    }
}
