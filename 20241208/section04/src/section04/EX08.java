package section04;

public class EX08 {
	public static void main(String[] args) {
		int favorite = 7;

		if (favorite > 5) { // 1번 조건문
			System.out.println("좋아하는 숫자가 5보다 큽니다."); // 1번 구문
		} else if (favorite == 5) { // 2번 조건문
			System.out.println("좋아하는 숫자는 7입니다.");
			
			// ▼▼ 결과값 ▼▼
			// 좋아하는 숫자가 5보다 큽니다.
			// 1번 조건문이 참이기 때문에 2번 조건문은 실행되지 못함
			// 이럴 경우에는 1번과 2번 위치를 바꿔야함
			
		}
	}
}