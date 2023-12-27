import java.util.Arrays;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        // Prompt the user for input
        String input = getInputFromUser();

        // Validate and process the input
        processInput(input);

        // Ask the user to run again or exit
        runAgainOrExit();
    }

    private static String getInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a comma-separated list of alphabetic and special characters: ");
        String input = scanner.nextLine();

        // Check for missing commas or numerical/floating input
        if (!isValidInput(input)) {
            System.out
                    .println("Invalid input. Please ensure the input contains commas and only alphabetic characters.");
            // Recursive call to get valid input
            return getInputFromUser();
        }

        return input;
    }

    private static boolean isValidInput(String input) {
        // Check for missing commas
        if (!input.contains(",")) {
            return false;
        }

        // Check for numerical or floating-point input
        String[] inputArray = input.split(",");
        for (String element : inputArray) {
            if (element.matches(".*\\d.*")) {
                return false;
            }
        }

        return true;
    }

    private static void processInput(String input) {
        // Remove elements with even ASCII values
        String[] inputArray = input.split(",");
        String filteredInput = Arrays.stream(inputArray)
                .filter(element -> element.length() > 0 && element.charAt(0) % 2 != 0)
                .reduce((a, b) -> a + "," + b)
                .orElse("");

        // Sort the remaining elements based on ASCII values
        String[] sortedArray = sortInput(filteredInput);

        // Display the result
        System.out.println("Output (Column E): " + String.join(",", sortedArray));
    }

    private static String[] sortInput(String input) {
        String[] inputArray = input.split(",");
        Arrays.sort(inputArray);
        return inputArray;
    }

    private static void runAgainOrExit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to run again? (yes/no): ");
        String choice = scanner.nextLine().toLowerCase();

        if ("yes".equals(choice)) {
            // Run the program again
            main(null);
        } else if ("no".equals(choice)) {
            System.out.println("Exiting the program. Goodbye!");
        } else {
            System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
            // Recursive call to get a valid choice
            runAgainOrExit();
        }
    }
}
