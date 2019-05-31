package in.ac.sharda;

public class Student implements IResultArrivedListener{
	
	private final int rollNumber;	//constant state
	private final String name;		//constant
	private String email;
	
	public Student(int rn,String n) {			//constructor to get input
		this.rollNumber=rn;
		this.name=n;
	}
	
	public Student(int rn,String n,String em) {			// another constructor to get input
		this.rollNumber=rn;
		this.name=n;
		this.email=em;
	}
	

	public void attendance() {				//behavior
		System.out.println("I am present");
	}
	
	public int getRollNumber() {				//getters
		return rollNumber;
    }
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {		//setter for email
		this.email = email;
	}
	
	
	/*public void setRollNumber(int rn) {
		this.rollNumber=rn;   
	}	*/
	
	@Override
	public boolean equals(Object obj) {				//overriding equals() method
		if(obj instanceof Student) {
			return((Student)obj)
					.getRollNumber()==rollNumber;
		}
		return false;
	}

	@Override
	public void resultDeclared() {
		System.out.println("Result is out!"+name);
		
	}
	
}
