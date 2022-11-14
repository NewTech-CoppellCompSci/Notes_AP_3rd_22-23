package notes06_Equals;

public class Runner {

	public static void main(String[] args) {
		
		Pet p1 = new Pet("Gerald", "Calico Cat", 23);
		Pet p2 = new Pet("Henry", "Hamster", 40000);
		Pet p3 = new Pet("Gerald", "Calico Cat", 23);
		
		Car c1 = new Car("Lmbo", "Veneno", 47000);
		Car c2 = new Car("Lmbo", "Veneno", 57000);
		Car c3 = new Car("Lmbo", "Veneno", 47000);
		
		
		if (p1.equals(p3)) {
			System.out.println("Same p1 = p3");
		}
		else {
			System.out.println("Not Same p1 != p3");
		}
		
		System.out.println("\n");
		
		
		if (p1.equals(p2)) {
			System.out.println("Same p1 = p2");
		}
		else {
			System.out.println("Not Same p1 != p2");
		}
		System.out.println("\n");
		
		
		//Check the car objects
		if (c1.equals(c3)) {
			System.out.println("Same c1 = c3");
		}
		else {
			System.out.println("Not Same c1 != c3");
		}
		
		System.out.println("\n");
		
		
		if (c1.equals(c2)) {
			System.out.println("Same c1 = c2");
		}
		else {
			System.out.println("Not Same c1 != c2");
		}
		System.out.println("\n");
		
		
		if (p1.equals(c1)) {
			System.out.println("Same p1 = c1");
		}
		else {
			System.out.println("Not Same p1 != c3");
		}
		
		System.out.println("\n");
		
		
		
		
		
		
		

	}

}
