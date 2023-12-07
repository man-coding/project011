package string;

public class quiz04 {

	static int getCharCount(String s) { // 스태틱 메소드는 객체 생성이 필요없음.

		int realLength = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				realLength++;
			}
		}
		return realLength;
	}

	public static void main(String[] args) {

		System.out.println(getCharCount("자바 프로그래밍 입문"));
		System.out.println(getCharCount("equals 메소드는 두 객체가 같은지 비교한다"));

	
		
	}

}




//인스턴스 메소드(class)를 사용하면 객체를 생성하여 호출해야 한다.
//-> 학생예시 등 멤버변수를 활용할 때 보통 사용.
//인스턴스 메소드에 스태틱을 사용해서 연결도 가능하다.
