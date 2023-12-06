package object;

public class Ex05 {

	public static void main(String[] args) {
		String str1 = new String("test");
		
		System.out.println(str1.toString()); 
		System.out.println(str1);
		
		String str2 = new String("tt");
		
		if(str1.equals(str2)) { //내용 비교
			System.out.println("str1와 str2은 같은 문자열입니다.");
		}else {
			System.out.println("값이 다르다");
		}
	}

}


