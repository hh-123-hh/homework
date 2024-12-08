package section04;

import java.util.Scanner;

public class EX06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");

		int age = sc.nextInt();
		if (age > 19) { 
			System.out.println("성인입니다."); // 19보다 크면 참이므로 성인입니다. 라고 출력 됨
		} else {
			System.out.println("미성년자입니다."); // 19보다 작으면 false이므로 미셩년자 입니다. 라고 출력 된다. 

			// ▼▼ 결과값 ▼▼
			// 나이를 입력하세요.
			// 1
			// 미성년자입니다.

		}
	}

}
