import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
    private int enteredValue;
    private Scanner sc = new Scanner(System.in); // Create a single scanner instance

    public int guess() {
        System.out.println("Hey player, guess the number: ");
        try {
            enteredValue = sc.nextInt();
            if (enteredValue <= 0) {
                throw new NumberFormatException("Value must be a positive integer.");
            }
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
        } catch (InputMismatchException ime) {
            System.out.println("Invalid input. Please enter a valid number.");
            sc.nextLine(); // Clear the invalid input
        }
        return enteredValue;
    }

    // No need for a closeScanner() method
}
