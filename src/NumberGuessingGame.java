public class NumberGuessingGame implements GuessingGame {

    Player p;
    private int secretnumber;
    private int attempts;
    private boolean hasGuessedCorrectly;

    public NumberGuessingGame(Player p) {
        this.p = p;
    }

    @Override
    public void startGame() {
        secretnumber = (int) (Math.random() * 100) + 1;
        attempts = 0;
        hasGuessedCorrectly = false;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the secret number.");
    }

    @Override
    public void makeGuess(int number) {
        if (hasGuessedCorrectly) {
            System.out.println("You've already guessed correctly. Game over.");
            return;
        }

        attempts++;
        if (number < secretnumber) {
            System.out.println("Too low! Try a higher number.");
        } else if (number > secretnumber) {
            System.out.println("Too high! Try a lower number.");
        } else {
            System.out.println("Congratulations! You guessed the secret number: " + secretnumber);
            System.out.println("You took " + attempts + " attempts.");
            hasGuessedCorrectly = true;
        }
    }

    @Override
    public boolean isGameOver() {
        if (attempts >= 3 || hasGuessedCorrectly) {
            System.out.println("Thank you! Your game is over.The secret number is "+secretnumber);
            return true;
        }
        return false;
    }
}
