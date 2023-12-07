package wrapper;

import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {
		
		ArrayList<Boolean> list = new ArrayList<Boolean>();
		
		//new boolean(true)로 변환됨.(오토박싱)
		list.add(true);
		list.add(true);
		list.add(false);
		
		//list.get(0).booleanValue()으로 변환됨.(언박싱)
		boolean a = list.get(0).booleanValue();
		boolean b = list.get(1);  //->  언박싱 됨.
		boolean c = list.get(2);  //->  언박싱 됨.
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
