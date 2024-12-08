package section02;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		int age = scanner.nextInt();
		System.out.printf("내 나이는 %d세 입니다.", age);
	}
	// ▼ 결과 값 ▼ 
//	나이를 입력해주세요 -> 나이 입력 하면 아래 결과 값 출력 됨
//	999
//	내 나이는 999세 입니다.
}
