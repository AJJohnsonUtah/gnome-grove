package views;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import controllers.GardenController;

public class GardenView {
	JFrame frame;
	JLabel plantHeightLabel;
	MainMenuPanel mainMenuPanel;
	GardenPanel gardenPanel;
	
	public GardenView(GardenController gCtrl) {
		// Setup main window
		frame = new JFrame("Grove");
		frame.setSize(500, 500);
		
		// Create game panels
		mainMenuPanel = new MainMenuPanel(gCtrl);
		gardenPanel = new GardenPanel();

		// Navigate to the main menu
		openMainMenu();
		frame.getContentPane().setLayout(new FlowLayout());;
		frame.setVisible(true);
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	public void setPlantHeightLabel(double height) {
		gardenPanel.setPlantHeightLabel(height);
	}
	
	public void openMainMenu() {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(mainMenuPanel);
		frame.repaint();
	}
	
	public void openGameScreen() {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(gardenPanel);		
		frame.repaint();
	}
}
