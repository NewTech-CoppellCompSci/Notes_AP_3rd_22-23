package notes02_ArrayLists;

import java.util.ArrayList;

/*
 * Notes ArraList<>
 * 
 * methods
 *   
 *   - .add(<object>) - adds object to end of list
 *   - .add(<index>, <object>) - adds object at given index (if possible)
 *   - .clear() - removes all elements from array
 *   - .get(<index>) - returns object at given index
 *   - .remove(<index>) - removes object at given index 
 *   - .remove(<object>) - removes ALL instances of given object
 *   - .size() - returns how many elements in list
 * 
 */

public class Student_Runer {

	public static void main(String[] args) {
		
		Student s1 = new Student(4.0, 2228796, "John Jacob Jinglhimer Smitt");
		Student s2 = new Student(2.4, 1, "Gearold Smith");
		Student s3 = new Student(3.5, 17, "Isaiah Chen");
		
		//declare and initialize ArrayList
		ArrayList<Student> students;
		students = new ArrayList<Student>();
		
		
		//Adding Objects
		students.add(s1);
		students.add(s2);
		
		//add at specific index
		students.add(1, s3);
		
		
		//getting objects
		System.out.println(students.get(0));
		
		//print list
		System.out.println("\nAll Students:\n");
		printList(students);
		
		
		//remove an item from the list
		students.remove(0);
		System.out.println("\nAll Students:\n  Removed index 0\n");
		printList(students);
		
		students.remove(s3);
		System.out.println("\nAll Students:\n  Removed object s3\n");
		printList(students);
		
		
		//clear entire list
		students.clear();
		System.out.println("\nAll Students:\n");
		printList(students);
		System.out.println("It's Empty!!!");
		
		
	}
	
	public static void printList(ArrayList<Student> students) {
		
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i) + "\n");
		}
		
	}
	
	
	
}
