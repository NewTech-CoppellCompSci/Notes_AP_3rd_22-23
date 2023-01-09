package Notes08_Recursion;

/*
 * 
 * 
 * recursive method() {
 * 
 * 		Base Case { (AKA Simplest Case)
 * 
 * 			//ends the entire method
 * 		}
 * 
 * 		All Other Cases {
 * 			do whatever that case nbeeds
 * 			calls the method again with 1 case closer to the base
 * 		}
 * 
 * 
 * }
 * 
 * 
 * 
 */

public class Notes_Recursion {

	public static void main(String[] args) {
		
		System.out.println(sumInts(5));
		System.out.println(sumInts(10));
		System.out.println();
		System.out.println(factorial(4));
		System.out.println(factorial(5));
		System.out.println();
		System.out.println(numVowels("HellO"));
		System.out.println(numVowels("mississippi"));
		System.out.println(numVowels("aaaaaaalkjhbsdkfbuhwek;rfgljakdfhv;lkaehjrgkjhjh;;;;"));
	}
	
	
	
	
	/*
	 * Add all integers <= the parameter 
	 */
	public static int sumInts(int num) {
		
		if (num == 1) {
			return num;
		}
		else {
			return num + sumInts(num - 1);
		}
		
		
	}
	
	
	/*
	 * Factorial
	 */
	public static int factorial(int num) {
		//base case
		if (num == 1) {
			return 1;
		}
		else {
			//example: 5 * factorial(4)
			return num * factorial(num - 1);
		}
		
		
		
		
	}
	
	
	/*
	 * count vowels in a string
	 * 
	 * 
	 */
	public static int numVowels(String str) {
		
		if (str.length() == 0) {
			return 0;
		}
		else {
			
			char letter = str.toLowerCase().charAt(0);
			
			switch (letter) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				if (str.length() == 1) {
					return 1;
				}
				return 1 + numVowels(str.substring(1));
			default:
				if (str.length() == 1) {
					return 0;
				}
				return numVowels(str.substring(1));
			}
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
