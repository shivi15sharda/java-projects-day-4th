package in.ac.sharda;

import java.util.Set;
import java.util.TreeSet;

public class University {
	
	private Set<Department> departments=new TreeSet<>();
	
	public void addid(Department i) {
		departments.add(i);
	}
	
	public void printdepartment() {
		departments.parallelStream()
		.forEach(i->System.out.println(i.getId()));
	}
	
	public boolean addDepartment(Department d) {
		return departments.add(d);
	}

	}
	
 