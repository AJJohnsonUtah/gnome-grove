package controllers;

import models.Garden;
import views.GardenView;

public class GardenController {

	Garden garden;
	GardenView gardenView;
	

	public static void main(String[] args) {
		GardenController gCtrl = new GardenController();
		long timeOfLastUpdate = System.nanoTime();
		while(true) {
			long elapsedTime = System.nanoTime() - timeOfLastUpdate;
			gCtrl.updateGardenController(elapsedTime);
			timeOfLastUpdate += elapsedTime;
		}
	}
	
	public GardenController() {
		garden = new Garden();
		gardenView = new GardenView();	
	}
	
	public void updateGardenController(long elapsedTime) {
		garden.updateGarden(elapsedTime);
		gardenView.setPlantHeightLabel(garden.getPlantHeight());
	}
}
