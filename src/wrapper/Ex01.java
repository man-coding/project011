package wrapper;

public class Ex01 {

	public static void main(String[] args) {
		
		//Integer 클래스
		Integer iNum1 = new Integer(100);
		//new Integer(100)로 변환.(오토박싱) ->값을 객체로 감쌌다!
		Integer iNum2 = 100;
		
		int num1 = iNum1.intValue(); //int값 꺼내기.
		int num2 = iNum1;  // iNum1.intValue()로 변환.(언박싱)
		
		//참조형과 기본형간의 연산 가능.
		int num3 = iNum1 + 100;   //iNum1.intValue()+100  언박싱
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		
		//Boolean 클래스
		Boolean boolean1 = new Boolean(true);
		Boolean boolean2 = false;
		
		boolean bool1 = boolean1.booleanValue();
		boolean bool2 = boolean2; //언박싱으로 값 꺼내기
		
		System.out.println("bool1: " + bool1);
		System.out.println("bool2: " + bool2);
		
		//Character 클래스
		Character character1 = new Character('A');
		Character character2 = 'B';
		//char 값 꺼내기
		char char1 = character1.charValue();
		char char2 = character2; //언박싱
		
		System.out.println("char1: " + char1);
		System.out.println("char2: " + char2);
	}

}
