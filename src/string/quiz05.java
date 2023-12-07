package string;

import java.util.Scanner;

public class quiz05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		//포문1
		String reverse = "";
		for(int i = str.length()-1 ; i >= 0; i--) {  //포문 1
			reverse = reverse + str.charAt(i);
			
		}
		//포문2
		String reverse2 = "";
		for(int i = 0; i < str.length(); i++) { //포문 2
			reverse2 = reverse2 + str.charAt((str.length()-1 - i));
		}
		//while 문으로 풀기
		int i = str.length()-1; 
		while(i>=0) {
			System.out.print(str.charAt(i));
			i--;
		}
		System.out.println();
		System.out.println();
		
		//StringBuilder 클래스 사용
		StringBuilder builder = new StringBuilder(str);
		builder.reverse(); //문자열을 거꾸로 변경하기
		System.out.println(builder);
		System.out.println();
		
		System.out.println(reverse);
		System.out.println();
		
		System.out.println(reverse2);
	}

}
