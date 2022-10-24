package notes04_Inheritance_Intro;

public class Bus extends PassVehicle{

	//Parameter
	private double lengthFeet;
	
	
	//Constructor
	public Bus(int numCylinders, int numPassengers,
			   int numMiles, String make,
			   String model, String color,
			   boolean hasTrunk, boolean has3rdRow,
			   int topSpeed, double lengthFeet) {
		super(numCylinders, numPassengers, numMiles, make,
				model, color, hasTrunk, has3rdRow, topSpeed);
		
		this.lengthFeet = lengthFeet;
		
	}
	
	
}
