package object;

public class quiz02 {

	public static void main(String[] args) {
		
		Object obj = new Student1(123, "man");
		
		if(obj instanceof Student1) {
			Student1 student1 = (Student1) obj;
			System.out.println(student1.id + " "+ student1.name);
		}
		
		
	}

}


class Student1 {

	int id;
	String name;

	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}

