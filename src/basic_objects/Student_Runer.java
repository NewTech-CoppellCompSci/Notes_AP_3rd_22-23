package basic_objects;

public class Student_Runer {

	public static void main(String[] args) {
		
		Student s1 = new Student(4.0, 2228796, "John Jacob Jinglhimer Smitt");
		Student s2 = new Student(2.4, 1, "Gearold Smith");
		Student s3 = new Student(3.5, 17, "Isaiah Chen");
		
		
		System.out.println(s1.getName());
		System.out.println(s2.getName());
		System.out.println(s3.getName());
		System.out.println(s2.getIDNum());
		
		System.out.println();
		
		s1.setName("Freddy 5-Nights");
		System.out.println(s1.getName());
		
		
		s3.addGPA(-2);
		System.out.println();
		System.out.println(s3.getGPA());
		
		
	}
	
}
