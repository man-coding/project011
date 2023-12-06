package object;

public class quiz03 {

	public static void main(String[] args) {

		Dog dog = new Dog("진돗개","초코");
		
		System.out.println(dog);
	}

}

class Dog {
	String name;
	String type;

	public Dog(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() { 
		return name + " "+ type;  //출력문 재정의
} 
	

}