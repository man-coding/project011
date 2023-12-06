package string;

public class Ex01 {

	public static void main(String[] args) {
		
		String str1 = "test";
		String str2 = "test";
		String str3 = new String("test");
		
		System.out.println(str1 == str2); //문자열을 공유하므로
		System.out.println(str1 == str3); //새로운 문자열을 생성
	}

}
