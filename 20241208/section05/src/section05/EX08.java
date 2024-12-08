package section05;

import java.util.Scanner;

public class EX08 {
	public static void main(String[] args) {

		int magicNumber = (int) (Math.random() * 50) + 1;
		Scanner scan = new Scanner(System.in);
		
		boolean isMatched = false;
		for (int i = 0; i < 10; i++) {
			System.out.println("찾는 숫자를 입력 >> ");
			int guess = scan.nextInt();

			if (guess == magicNumber) {
				System.out.println((i + 1) + "번째에 맞췄습니다!");
				isMatched = true;
				break; // 정답을 맞춰서 종료
			} else if (guess > magicNumber) {
				System.out.println("맞춰야할 숫자가 더 작습니다.");
			} else if (guess < magicNumber) {
				System.out.println("맞춰야할 숫자가 더 큽니다.");
			}
		}
		if (!isMatched) {
			System.out.println("정답을 맞추지 못했습니다.");
			
			// ▼▼ 결과값 ▼▼
//			찾는 숫자를 입력 >> 
//			27
//			맞춰야할 숫자가 더 작습니다.
//			찾는 숫자를 입력 >> 
//			25
//			맞춰야할 숫자가 더 작습니다.
//			찾는 숫자를 입력 >> 
//			24
//			맞춰야할 숫자가 더 작습니다.
//			찾는 숫자를 입력 >> 
//			23
//			맞춰야할 숫자가 더 작습니다.
//			찾는 숫자를 입력 >> 
//			21
//			맞춰야할 숫자가 더 작습니다.
//			찾는 숫자를 입력 >> 
//			19
//			맞춰야할 숫자가 더 작습니다.
//			찾는 숫자를 입력 >> 
//			10
//			7번째에 맞췄습니다!

		}
	}
}