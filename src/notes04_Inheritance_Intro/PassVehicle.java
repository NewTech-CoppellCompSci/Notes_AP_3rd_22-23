package notes04_Inheritance_Intro;

public class PassVehicle extends GasVehicle{

	//Parameters
	private boolean hasTrunk;
	private boolean has3rdRow;
	private int topSpeed;
	
	
	//Constructor
	public PassVehicle(int numCylinders, int numPassengers,
			           int numMiles, String make,
			           String model, String color,
			           boolean hasTrunk, boolean has3rdRow,
			           int topSpeed) {
		super(numCylinders, numPassengers, numMiles, make,
				model, color);
		
		this.hasTrunk = hasTrunk;
		this.has3rdRow = has3rdRow;
		this.topSpeed = topSpeed;
		
		
	}
	
	
	
	public void overhaul(int numCylinders,
			String color, int topSpeed) {
		this.topSpeed = topSpeed;
		super.setColor(color);
		super.setNumCylinders(numCylinders);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		String str = super.toString() + "\n" +
	                 "Top Speed = " + topSpeed + "\n";
		
		if (has3rdRow) {
			str += "3rd Row = Yes\n";
		}
		else {
			str += "3rd Row = No\n";
		}
		
		if (hasTrunk) {
			str += "Trunk = Yes";
		}
		else {
			str += "Trunk = No";
		}
		
		
		return str;
	}
	
	
	
	
	
	
	
}
