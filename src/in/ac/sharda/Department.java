package in.ac.sharda;
import java.util.ArrayList;
import java.util.List;

public class Department implements Comparable<Department>{
	
	private final int id;
	
	private List<Student> students=new ArrayList<>();
	
	public Department(int id) {
		this.id=id;
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	public void printStudents() {
		/*students.parallelStream().forEach(s->System.out.println(s.getRollNumber()));	//parallel stream used to use all cpu core*/
		for(Student s: students) {
			System.out.println(s.getRollNumber());
		}
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Department) {
			return((Department)obj)
					.getId()==id;
		}
		return false;
	}
	
	@Override
	public int compareTo(Department o) {
		return o.getId()-id;
	}

	public void resultArrived() {
		
			
		}

	}
