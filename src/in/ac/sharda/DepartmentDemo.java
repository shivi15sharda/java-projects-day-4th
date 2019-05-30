package in.ac.sharda;

public class DepartmentDemo {

	public static void main(String[] args) {
		
		Department d=new Department(1);
		d.addStudent(new Student(1,"abc"));
		d.addStudent(new Student(2,"def"));
		d.addStudent(new Student(3,"ghi"));
		d.addStudent(new Student(4,"jkl"));
		d.addStudent(new Student(5,"mno"));
		d.printStudents();
	}

}
