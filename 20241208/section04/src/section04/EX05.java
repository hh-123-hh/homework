package section04;

public class EX05 {
	public static void main(String[] args) {
		int a = 4;
		int b = 10;
		int max = 0;

		if (a > b) { // a > b = false
			max = a; // max 의 값은 a다 라고 선언
		} else {
			max = b; // max 의 값은 b다 라고 선언
		}
		System.out.println(a + "와 " + b + "중에 큰 수는 " + max + "입니다.");
		// ▼▼ 결과값 ▼▼
		// 4와 10중에 큰 수는 10입니다.		=> a,b 중 큰수는 10이기 때문에 해당 결과 값이 나옴
	}
}