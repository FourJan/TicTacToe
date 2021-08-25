import java.awt.Button; 
import java.awt.Frame;
import java.awt.GridLayout;
public class TicTacToeFrame extends Frame{
	
	
	WindowController windowController;
	TicTacToeButton[][] buttonArray;
	
	
	
	public TicTacToeFrame(){ 
		this.setVisible(true);
		this.windowController=new WindowController(this);
		this.addWindowListener(windowController);
		this.setResizable(false);
		this.setLayout(new GridLayout(3,3));
		befülleButtonArray();
		this.setSize(800, 800);
		Gamelogic.tttFrame = this; 
		
	}
	
	private void befülleButtonArray() {
		int i=0; 
		int j=0;
		buttonArray = new TicTacToeButton[3][3];
		for (i=0; i<3; i++) {
			for (j=0; j<3; j++) {
				buttonArray[i][j]=new TicTacToeButton();
				this.add(buttonArray[i][j]);
				buttonArray[i][j].addActionListener(new ButtonController(buttonArray[i][j]));
				
			}
			
		}
	}
}
