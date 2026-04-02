import java.util.HashMap;
import java.util.Map;

public class TrainConsistentApp {

    public static void main(String[] args) {

        // Step 1: Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Step 3: Add bogie capacities
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 50);
        bogieCapacityMap.put("First Class", 24);

        // Step 4: Display capacity details
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }

        // Step 5: Continue program
        System.out.println("\nCapacity mapping completed successfully.");
    }
}