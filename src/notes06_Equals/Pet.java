package notes06_Equals;

public class Pet {

	//parameters
	private String name;
	private String type;
	private int age;
	
	//Constructor
	public Pet(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
	//Getter and setter methods not shown
	public String getName() {return name;}
	public String getType() {return type;}
	public int getAge() {return age;}
	
	
	@Override
	public boolean equals(Object object) {
		
		//is object the right type?
		if (!(object instanceof Pet)) {
			return false;
		}
		
		//type case object to correct type
		Pet other = (Pet) object;
		
		//check whatever parameters we want
		if (this.name.equals(other.getName()) && 
			this.type.equals(other.getType()) &&
			this.age == other.getAge()){
				return true;
			}
		
		return false;
	}
	
	
	@Override
	public String toString() {
		String str = name + " is a " +
					 age + " year old " + 
					 type + ".";
		return str;
	}
	
	
	
}
