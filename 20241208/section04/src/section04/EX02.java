package section04;

import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // import 하기
		System.out.println("나이를 입력하세요."); // 나이를 입력하라는 문구 출력

		int age = sc.nextInt(); // 입력 메소드
		if (age > 19) {
			System.out.println("성인입니다.");
			System.out.println("프로그램을 종료합니다.");
			// ▼▼ 결과값 ▼▼
//			나이를 입력하세요. 
//			999 // 19보다 큰 값을 입력 하면 조건값이 참이므로
//			성인입니다. // 성인입니다. 문구 출력, 조건식이 참이 됨
//			프로그램을 종료합니다.

		}
	}
}
