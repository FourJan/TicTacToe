import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonController implements ActionListener {
	TicTacToeButton currentButton;

	ButtonController(TicTacToeButton currentButton) {
		this.currentButton = currentButton;

	}

	public void actionPerformed(ActionEvent e) {
		currentButton.setFont(new Font("Arial", Font.PLAIN, 160));

		if (Gamelogic.rundenzähler % 2 == 0) {
			currentButton.setLabel("X");
			currentButton.setX(true);
		} else {
			currentButton.setLabel("O");
			currentButton.setO(true);
		}
		currentButton.setEnabled(false);
		Gamelogic.rundenzähler++;

		Gamelogic.checkVictory();

	}
}
