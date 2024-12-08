package section04;

import java.util.Scanner;

public class EX09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();

		if (age > 19) {
			System.out.println("성인입니다.");
		} else if (age > 13) {
			System.out.println("청소년입니다.");
		} else if (age > 6) {
			System.out.println("어린이입니다.");
		} else {
			System.out.println("유아입니다.");
			
			// age에 저장 된 값이 19 보다 크면 성인
			// age에 저장 된 값이 19 보다 작고, 13초과 이면 결과값은 청소년 
			// age에 저장 된 값이 19 이하, 6보다 아래이면 결과값은 유아
		}
	}
}