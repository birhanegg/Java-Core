package finaloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javaCore.stringPool;
import oop.Vehicle;

/*
1, create class student
    -int id
    - String name 
    -double mark
2, check is s1==s2 using method equal
3, add sample students as list(3 students)
4, sort by
     - name
     - id then mark
     - reverse

 */
//class NameCompare2 implements Comparator<Student> {
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		return o1.getName().compareTo(o2.getName());
//	}
//
//}

public class Student {
	private int id;
	private String name;
	private double mark;

	public Student(int id, String name, double mark) {
		this.id = id;
		this.name = name;
		this.mark = mark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		else if (!(obj instanceof Student))
			return false;
		else {
			Student student = (Student) obj;
			return (this.name == student.getName() && this.id == student.getId() && this.mark == student.getMark());
		}
	}

	
	  @Override
	    public int hashCode() {
	        int hash = 5;
	        hash = 89*hash + (this.name != null ? this.name.hashCode() : 0);
	        hash = 89*hash + (int) (this.id ^ (this.id >>> 32));
	        hash = 89*hash + (int)this.mark;
	        return hash;
	    }
	
	//	@Override
//	public int compareTo(Student o) {
//		return this.name.compareTo(o.getName());
//	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mark=" + mark + "]";
	}

	public static void main(String[] args) {

		Student s1 = new Student(11, "hani", 89.5);
		Student s2 = new Student(9, "hani", 89.5);
		Student s3 = new Student(22, "welela", 93);
		Student s4 = new Student(33, "eldu", 78);
		Student s5 = new Student(11, "mukur", 89.5);
		System.out.println(s1);
		System.out.println(s1.equals(s4));

		List<Student> list = new ArrayList<Student>();
//		list.add(s1);
//		list.add(s2);
//		list.add(s3);
//		list.add(s4);

		list.addAll(Arrays.asList(s1, s2, s3, s4,s5));
		System.out.println(list);

		//Comparator<Student> byName = new NameCompare();
		// Collections.sort(list, byName);
		Collections.sort(list, Comparator.comparing(Student::getName).thenComparing(Student:: getId).reversed()); //j8
		System.out.println(list);
	}

}
