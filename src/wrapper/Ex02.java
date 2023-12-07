package wrapper;

public class Ex02 {

	public static void main(String[] args) {
		
		//문자열을 사용하여 Integer 객체 생성
		Integer iNum1 = Integer.valueOf("100");
		
		//정수를 사용하여 Integer 객체 생성
		Integer inum2 = Integer.valueOf(100);
		
		//문자열을 숫자 타입으로 변환
		int num = Integer.parseInt("100");   //parse 뜻: 분석하다
		System.out.println("정수로 변환된 값: "+ num);
		
		//숫자를 문자열타입으로 변환
		String str = iNum1.toString();   //객체를 생성하여 변수를 받아서 출력.(스태틱아님) -> 둘 다 사용 가능
		System.out.println("문자열로 변환된 값: " + str);
	}

}
