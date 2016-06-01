package app;

import java.lang.reflect.InvocationTargetException;

import javax.swing.SwingUtilities;

import controllers.GardenController;

public class GroveApp {
	
	public static void main(String[] args) {
		GardenController gCtrl = new GardenController();
		runGUIOnNewThread(gCtrl);
		gCtrl.runGame();
	}
	
	public static void runGUIOnNewThread(GardenController gCtrl) {
		try {
			SwingUtilities.invokeAndWait(new Runnable() {
				public void run() {
					gCtrl.createAndShowView();
				}
			});
		} catch (InvocationTargetException | InterruptedException e) {
			e.printStackTrace();
		}
	}	
}
