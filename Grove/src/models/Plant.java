package models;

public class Plant {

	double height;
	double growRatePerSecond;
	
	public Plant() {
		height = 1;
		growRatePerSecond = 1;
	}

	public void updateObject(long elapsedTime) {
		height += (elapsedTime / 1000000000.0) * growRatePerSecond;
	}

	public double getHeight() {
		return height;
	}

}
