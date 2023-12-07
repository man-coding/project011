package wrapper;

import java.util.ArrayList;

public class quiz04 {

	public static void main(String[] args) {

		ArrayList<Character> list = new ArrayList<Character>();

		list.add('a'); //list.add(new Character('a'))으로 변환됨. 오토박싱
		list.add('b');
		list.add('c');
		list.add('d');

		//바로 출력
		char ch1 = list.get(0); // Character 타입의 값이 char로 언박싱됨
		char ch2 = list.get(1); // 언박싱됨
		char ch3 = list.get(2); // 언박싱됨
		char ch4 = list.get(3); // 언박싱됨
		System.out.println(ch1 + " " + ch2 + " " + ch3 + " " + ch4);
		
		//포문으로 출력
		for (int i = 0; i < list.size(); i++) {
			char ch = list.get(i); //list.get(i).charValue()으로 변환됨.(언박싱)
			System.out.print(ch);
		}
		System.out.println();
		
		//람다식 포문으로 출력
		for (Character ch : list) { //변수에 list 값 하나씩 넣고 출력까지 한번에 함
			System.out.print(ch);
		}

	}
}
