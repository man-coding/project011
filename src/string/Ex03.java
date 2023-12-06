package string;

public class Ex03 {

	public static void main(String[] args) {
		
		String str = "java";
		System.out.println("str 문자열주소: " + System.identityHashCode(str));
		
		str = str + " and";
		str = str + " android";
		
		System.out.println(str);
		System.out.println("str 문자열주소: " + System.identityHashCode(str));  //내용을 추가하면 주소가 달라진다.(객체를 새로 생성)
		
		
		System.out.println();
		StringBuilder buffer = new StringBuilder("java"); //내용을 변경해도 객체를 새로 생성하지 않는다.
		
		System.out.println("buffer 문자열주소: " + System.identityHashCode(buffer)); //아래와 주소가 같음.
		
		buffer.append(" and");
		buffer.append(" android");
		System.out.println(buffer.toString());
		System.out.println("buffer 문자열주소: " + System.identityHashCode(buffer)); //주소가 같음.
		
	}

}
