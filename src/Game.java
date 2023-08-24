
public class Game {

	public static void main(String[] args) {
		Player p = new Player();
		GuessingGame g = new NumberGuessingGame(p);
		g.startGame();
		while (!g.isGameOver()) {
			int guess =p.guess();
			g.makeGuess(guess);
		}
		
	}

}
