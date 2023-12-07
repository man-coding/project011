package string;

public class quiz03 {

	public static void main(String[] args) {

		String str = "자바 프로그래밍 입문";

		str = str.replace(" ", "");
		
		int strNum = str.length();
		
		System.out.println(str.length());
		
		System.out.println();
		
	//순회 방법
		String str2 = "자바 프로그래밍 입문";
		int realLength = 0;
		
		for(int i = 0; i<str.length(); i++){
			if(str.charAt(i) != ' ') {  //공백이 아닐 때만 리얼렝스를 증가시켜줌.
				realLength++;
			}
		}
		System.out.println(str2.length());
		System.out.println(realLength);
	}

}
