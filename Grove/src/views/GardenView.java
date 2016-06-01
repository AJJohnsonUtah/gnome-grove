package views;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GardenView {
	JFrame frame;
	JLabel plantHeightLabel;
	
	public GardenView() {
		JFrame frame = new JFrame("Grove");
		plantHeightLabel = new JLabel("0");
		frame.getContentPane().add(plantHeightLabel, BorderLayout.CENTER);
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	public void setPlantHeightLabel(double height) {
		plantHeightLabel.setText(String.format("%.2f",height));
	}
}
