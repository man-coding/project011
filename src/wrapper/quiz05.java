package wrapper;

import java.util.Scanner;

public class quiz05 {

	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//		
//		Integer n1 = scanner.nextInt();
//		Integer n2 = scanner.nextInt();
//		System.out.println(n1+n2);

		// 정답(언박싱x 그냥 변환)
		Scanner sc = new Scanner(System.in);
		String num1 = sc.nextLine();
		String num2 = sc.nextLine();

		int sum = Integer.parseInt(num1) + Integer.parseInt(num2); // 문자열을 숫자로 변환하고 덧셈 수행 언박싱아님.
		System.out.println(sum);

		// 언박싱하여 풀기
		Scanner sc2 = new Scanner(System.in);
		String num3 = sc2.nextLine();
		String num4 = sc2.nextLine();

		Integer integer1 = Integer.valueOf(num3); // 오토박싱
		Integer integer2 = Integer.valueOf(num4);
		int sum2 = integer1 + integer2; // 언박싱
		System.out.println(sum2);
	}

}
