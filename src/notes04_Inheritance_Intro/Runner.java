package notes04_Inheritance_Intro;

public class Runner {

	public static void main(String[] args) {
		
		GasVehicle v1 = new GasVehicle(8, 6, 2500, 
				"Toyota", "Corolla", "hot pink");
		System.out.println(v1 + "\n");
		
		PassVehicle pv1 = new PassVehicle(10, 30, 15000, 
				"Dodge", "Charger", "Electric Banana",
				true, false, 400);
		System.out.println(pv1 + "\n");
		
		
		
		//change color
		pv1.setColor("Orangish Purple");
		System.out.println(pv1 + "\n");
		
		
		pv1.overhaul(20, "Sky Blue", 1000);
		System.out.println(pv1 + "\n");
		
		
		
	}
	
}
