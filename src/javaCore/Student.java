package javaCore;

/*
 * three types of variables: 1. static 2. instant 3. local
 */
public class Student {

	String name;   		//instant variable 
	int id;				//instant variable 
	char grade;			//instant variable 
	static  int count;	//Static/Class variable 

	public Student(String name, int id, char grade) {
		this.name = name;
		this.id = id;
		this.grade = grade;
		count =  count + 1;
	}


	public String print() {
		return "Student [name=" + name + ", id=" + id + ", grade=" + grade + ", count=" + count + "]";
	}

	void print(Student s) {
		System.out.println("name: " + s.name);
		System.out.println("id: " + s.id);
		System.out.println("grade: " + s.grade);
	}

	public static void main(String[] args) {
		
		int var1=0; //local vairable;
		Student s1 = new Student("hani", 1001, 'A');
		System.out.println(s1.print());
		Student s2 = new Student("welela", 1002, 'B');
		s1.print(s1);
	
		//System.out.println(s2.print());
	}

}
