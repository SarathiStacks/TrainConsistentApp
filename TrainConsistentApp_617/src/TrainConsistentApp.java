import java.util.ArrayList;
import java.util.List;

public class TrainConsistentApp {

    public static void main(String[] args) {

        // Step 1: Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Step 3: Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Step 4: Display bogies after addition
        System.out.println("\nPassenger bogies after addition:");
        System.out.println(passengerBogies);

        // Step 5: Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Step 6: Display bogies after removal
        System.out.println("\nPassenger bogies after removal:");
        System.out.println(passengerBogies);

        // Step 7: Check existence of a bogie
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie does not exist.");
        }

        // Step 8: Final state
        System.out.println("\nFinal passenger bogie list:");
        System.out.println(passengerBogies);

        // Step 9: Continue program
        System.out.println("\nSystem ready for next operations...");
    }
}