package string;

public class quiz02 {

	public static void main(String[] args) {

		String personNum = "881120-1068234";
		System.out.println(personNum.indexOf("-") + 1);
		if (personNum.charAt(7) == '1' || personNum.charAt(7) == '3') {
			System.out.println("성별은 남자입니다.");
		} else {
			System.out.println("성별은 여자입니다.");
		}

	}

}
