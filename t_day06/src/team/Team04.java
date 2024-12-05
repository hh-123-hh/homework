package team;

import java.util.Scanner;

public class Team04 {
	public static void main(String[] args) {
//		문제 2)))))))))))))))))))))))

//	      사용자로부터 문자를 입력받아 아스키코드 값을 확인하고
//	      입력받은 문자를 아스키코드 값으로 변환한다
//	      
//	      사용자가 입력한 문자와 그 아스키코드를 출력하는데 반복문을 사용하여
//	      여러번 입력받도록 한다'A'를 입력하면 종료하고 종료 메시지를 출력한다
		Scanner sc = new Scanner(System.in); // 입력 받기 위해 sc로 변수 선언

		final char finish = 'A';
		// A값은 탈출하는 문자이기 때문에 상수로 지정
		while (true) {
			// while문 제어없이 반복하기
			System.out.print("문자를 입력하세요 : "); // 출력~~~

			char input = sc.next().charAt(0);
			// 입력 받는 next는 char가 아닌 String

			sc.nextLine();
			if (input == finish) {
				// 만약 입력 받은 값이 finish변수와 같다면

				System.out.println("프로그램 종료");
				break;// 반복문 탈출하기

			}

			System.out.println(input + " " + (int) input);
			// 입력 받은 값을 아스키코드로 변환해주기

		}
		sc.close();
	}
}




