package section05;

public class EX07 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {

			if (i % 2 != 0) { // i가 홀수 인지 확인,
				continue; // 이번 차수를 종료하고 다음 반복 실행
				// 홀수면 continue 실행, 짝수면 건너뛰고 다음 코드로 진행 됨
			}
			sum += i;
		}
		System.out.println("짝수 합 : " + sum);
		// ▼▼ 결과값 ▼▼
		// 짝수 합 : 2550

	}
}