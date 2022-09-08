package notes01_basic_objects;

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
	
		
		
		Student s4 = new Student();
		System.out.println("\n" + s4.getName());
		System.out.println(s4.getIDNum());
		System.out.println(s4.getGPA());
		
		
		Student s5 = new Student(1513656413, "Joseph");
		System.out.println("\n" + s5.getName());
		System.out.println(s5.getIDNum());
		System.out.println(s5.getGPA());
		
		
		
		System.out.println();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
	}
	
}
