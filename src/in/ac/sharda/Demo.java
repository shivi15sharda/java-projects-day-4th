package in.ac.sharda;

public class Demo {

	public static void main(String[] args) {
		Student s=new Student(1,"One");
		System.out.println(s.getRollNumber());	//getter method
		System.out.println(s.getName());
		Student s2=new Student(2,"Another","my_email@gmail.com");
		System.out.println(s2.getRollNumber());	//getter method
		System.out.println(s2.getName());
		System.out.println(s2.getEmail());
		System.out.println(s.equals(s2));		//checking object's identity
		
	}

}
