package string;

import java.util.Scanner;

public class quiz06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("문장을 입력하세요");
			String str1 = scanner.nextLine();

			if (str1.equalsIgnoreCase("end")) {
				break;
			}

		}

	}

}
