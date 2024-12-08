package section04;

public class EX04 {
	public static void main(String[] args) {
		int a = 4;
		int b = 10;

		if (a > b) {
			System.out.println("a가 b보다 큽니다"); // ---> 거짓이기 때문에 else 실행되어
		} else {
			System.out.println("a가 b보다 작거나 같습니다"); // ---> 해당 결과 값이 나옴
			
			// ▼▼ 결과값 ▼▼
			// a가 b보다 작거나 같습니다
			
		}
	}
}