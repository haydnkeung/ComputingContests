
//J3 2014
import java.util.*;

public class Main {

	static Scanner userInput = new Scanner(System.in);

	static int numOfRounds = userInput.nextInt();

	static public void main(String[] args) {
		executeCode();
	}

	public static void executeCode() {
		int playerRollA = 100;
		int playerRollB = 100;

		int playerRollA1 = 0;
		int playerRollB1 = 0;

		for (int i = 0; i < numOfRounds; i++) {
			playerRollA1 = userInput.nextInt();
			playerRollB1 = userInput.nextInt();

			if (playerRollA1 == playerRollB1) {
				// TIE

			} else if (playerRollA1 < playerRollB1) {
				// PLAYER A LOSE!
				playerRollA = playerRollA - playerRollB1;
			} else {
				// Player B LOSE!
				playerRollB = playerRollB - playerRollA1;
			}

		}

		System.out.println(playerRollA);
		System.out.println(playerRollB);

	}
}
