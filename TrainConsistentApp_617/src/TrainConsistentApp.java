import java.util.LinkedList;

public class TrainConsistentApp {

    public static void main(String[] args) {

        // Step 1: Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Step 3: Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Step 4: Display initial consist
        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // Step 5: Insert Pantry Car at position 2 (index 1)
        trainConsist.add(1, "Pantry Car");

        // Step 6: Display after insertion
        System.out.println("\nAfter adding Pantry Car:");
        System.out.println(trainConsist);

        // Step 7: Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Step 8: Display final consist
        System.out.println("\nFinal Train Consist after removals:");
        System.out.println(trainConsist);

        // Step 9: Continue program
        System.out.println("\nTrain sequence maintained successfully.");
    }
}