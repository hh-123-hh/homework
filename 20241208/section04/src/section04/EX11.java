package section04;

public class EX11 {
	public static void main(String[] args) {

		int num = 7;

		switch (num) {
		case 1:
			System.out.println("num은 1입니다.");
		case 7:
			System.out.println("num은 7입니다.");
		default:
			System.out.println("num은 1도 7아닙니다.");
			
			// ▼▼ 결과값 ▼▼
			// num은 7입니다.
			// num은 1도 7아닙니다.			=> break문이 사용 되지 않아 적절한 결과문이 출력 되지 않음
			
		}
	}
}
