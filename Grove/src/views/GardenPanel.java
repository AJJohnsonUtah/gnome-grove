package views;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GardenPanel extends JPanel {

	private JLabel plantHeightLabel;
	
	public GardenPanel() {
		plantHeightLabel = new JLabel("0");		
		add(plantHeightLabel, BorderLayout.CENTER);		
	}

	public void setPlantHeightLabel(double height) {
		plantHeightLabel.setText(String.format("%.2f",height));
	}
}
