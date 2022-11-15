package notes05_Equals;

public class Car {

	//Parameters
	private String make;
	private String model;
	private int miles;
	
	//Constructor
	public Car(String make, String model, int miles) {
		this.make = make;
		this.model = model;
		this.miles = miles;
	}
	
	//Getter and setter methods not shown
	public String getMake() {return make;}
	public String getModel() {return model;}
	public int getMiles() {return miles;}
	
	
	
	@Override
	public boolean equals(Object object) {
		
		//check if it's the correct type
		if (object instanceof Car) {
			
			//type cast
			Car other = (Car) object;
			
			//check if they're the same
			if (this.model.equals(other.getModel())  
				&& this.miles == other.getMiles()){
				return true;
			}
			
		}
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		String str = "Make = " + make +
					 "Model = " + model +
					 "Miles = " + miles;
		return str;
	}
}
