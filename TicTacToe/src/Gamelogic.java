import java.awt.Button;;

public class Gamelogic {
	public static int rundenzähler = 0;

	public static TicTacToeFrame tttFrame;

	static TicTacToeButton[][] buttonArray;

	public static boolean isVictory;

	public static boolean checkVictory() {
		buttonArray = tttFrame.buttonArray;
		isVictory = false;
		if (buttonArray[0][0].isX() && buttonArray[0][1].isX()) {
			if (buttonArray[0][1].isX() && buttonArray[0][2].isX()) {
				isVictory = true;
			}
		}
		if (buttonArray[1][0].isX() && buttonArray[1][1].isX()) {
			if (buttonArray[1][1].isX() && buttonArray[1][2].isX()) {
				isVictory = true;
			}
		}
		if (buttonArray[2][0].isX() && buttonArray[2][1].isX()) {
			if (buttonArray[2][1].isX() && buttonArray[2][2].isX()) {
				isVictory = true;
			}
		}
		if (buttonArray[0][0].isX() && buttonArray[1][0].isX()) {
			if (buttonArray[1][0].isX() && buttonArray[2][0].isX()) {
				isVictory = true;
			}
		}
		if (buttonArray[0][1].isX() && buttonArray[1][1].isX()) {
			if (buttonArray[1][1].isX() && buttonArray[2][1].isX()) {
				isVictory = true;
			}
		}
		if (buttonArray[0][2].isX() && buttonArray[1][2].isX()) {
			if (buttonArray[1][2].isX() && buttonArray[2][2].isX()) {
				isVictory = true;
			}
		}
		if (buttonArray[0][0].isX() && buttonArray[1][1].isX()) {
			if (buttonArray[1][1].isX() && buttonArray[2][2].isX()) {
				isVictory = true;
			}
		}
		if (buttonArray[0][2].isX() && buttonArray[1][1].isX()) {
			if (buttonArray[1][1].isX() && buttonArray[2][0].isX()) {
				isVictory = true;
			}
		}

		if (buttonArray[0][0].isO() && buttonArray[0][1].isO()) {
			if (buttonArray[0][1].isO() && buttonArray[0][2].isO()) {
				isVictory = true;
			}
		}
		if (buttonArray[1][0].isO() && buttonArray[1][1].isO()) {
			if (buttonArray[1][1].isO() && buttonArray[1][2].isO()) {
				isVictory = true;
			}
		}
		if (buttonArray[2][0].isO() && buttonArray[2][1].isO()) {
			if (buttonArray[2][1].isO() && buttonArray[2][2].isO()) {
				isVictory = true;
			}
		}
		if (buttonArray[0][0].isO() && buttonArray[1][0].isO()) {
			if (buttonArray[1][0].isO() && buttonArray[2][0].isO()) {
				isVictory = true;
			}
		}
		if (buttonArray[0][1].isO() && buttonArray[1][1].isO()) {
			if (buttonArray[1][1].isO() && buttonArray[2][1].isO()) {
				isVictory = true;
			}
		}
		if (buttonArray[0][2].isO() && buttonArray[1][2].isO()) {
			if (buttonArray[1][2].isO() && buttonArray[2][2].isO()) {
				isVictory = true;
			}
		}
		if (buttonArray[0][0].isO() && buttonArray[1][1].isO()) {
			if (buttonArray[1][1].isO() && buttonArray[2][2].isO()) {
				isVictory = true;
			}
		}
		if (buttonArray[0][2].isO() && buttonArray[1][1].isO()) {
			if (buttonArray[1][1].isO() && buttonArray[2][0].isO()) {
				isVictory = true;
			}
		}

		if (isVictory) {
			System.exit(0);

		}
		return isVictory;
	}

}
