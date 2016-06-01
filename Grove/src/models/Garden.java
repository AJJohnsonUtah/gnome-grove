package models;

public class Garden {
	
	Plant plant;
	
	/**
	 * Garden Constructor
	 * 
	 * Creates a Garden object, and initializes the Garden's variables.
	 */
	public Garden() {
		plant = new Plant();
	}
	
	/**
	 * Updates the objects in the garden based on the elapsed time.
	 * @param elapsedTime
	 */
	public void updateGarden(long elapsedTime) {
		plant.updateObject(elapsedTime);
	}
	
	public double getPlantHeight() {
		return plant.getHeight();
	}
}
