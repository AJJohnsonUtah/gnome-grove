package views;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import controllers.GardenController;

@SuppressWarnings("serial")
public class MainMenuPanel extends JPanel implements ActionListener {

	private JButton newGameButton;
	private GardenController gCtrl;
	
	public MainMenuPanel(GardenController gCtrl) {
		this.gCtrl = gCtrl;
		this.setBackground(Color.CYAN);
		newGameButton = new JButton("Start Game");
		newGameButton.setActionCommand("START_GAME");
		newGameButton.addActionListener(this);
		add(newGameButton);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if("START_GAME".equals(e.getActionCommand())) {
			gCtrl.startGame();
		}
	}

}
