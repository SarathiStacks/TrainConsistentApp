import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistentApp {

    public static void main(String[] args) {

        // Step 1: Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Step 3: Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Step 4: Attempt to add duplicate
        trainFormation.add("Sleeper"); // duplicate (ignored)

        // Step 5: Display final formation
        System.out.println("\nFinal Train Formation (in insertion order):");
        System.out.println(trainFormation);

        // Step 6: Continue program
        System.out.println("\nDuplicates are automatically removed while preserving order.");
    }
}