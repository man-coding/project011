package object;

public class Ex03 {

	public static void main(String[] args) {

		Student student1 = new Student(1001, "둘리");
		Student student2 = new Student(1002, "둘리");
		
		String string = "aa";

		if (student1 == student2) {
			System.out.println("student1와 student2의 주소는 같다.");
		} else {
			System.out.println("student1와 student2의 주소는 다르다.");
		}
		System.out.println();
		if (student1.equals(string)) {
			System.out.println("student1와 student2의 주소는 같다.");
		} else {
			System.out.println("student1와 student2는 다른 학생입니다.");
		}

	}

}

class Student {

	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {

		// 학생의 학번이 같으면 참, 그렇지 않으면 거짓 반환

		// 나의 학번 == obj의 학번 비교

		// obj의 실제 타입이 Student인지 확인 ->다형성의 원리, 다운캐스팅
		if (obj instanceof Student) {

			Student student = (Student) obj;

			if (this.id == student.id) { // 학번이 같으면 같은 학생으로 판단
				return true;  //리턴은 함수를 종료하는 의미도 있음.
			}

		}
		return false;
	}

}
