package controllers;

import models.Garden;
import views.GardenView;

public class GardenController {

	Garden garden;
	GardenView gardenView;
	GroveAppState appState;

	public GardenController() {
		garden = new Garden();
		appState = GroveAppState.MAIN_MENU;
	}

	// Main Game Loop
	public void runGame() {
		long timeOfLastUpdate = System.nanoTime();
		while (true) {
			long elapsedTime = System.nanoTime() - timeOfLastUpdate;

			if (appState.equals(GroveAppState.MAIN_MENU)) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else if (appState.equals(GroveAppState.IN_GAME)) {
				updateGardenController(elapsedTime);
			}
			
			timeOfLastUpdate += elapsedTime;
		}
	}

	public void startGame() {
		appState = GroveAppState.IN_GAME;
		gardenView.openGameScreen();
	}

	public void updateGardenController(long elapsedTime) {
		garden.updateGarden(elapsedTime);
		gardenView.setPlantHeightLabel(garden.getPlantHeight());
	}

	public void createAndShowView() {
		gardenView = new GardenView(this);
	}
}
