package team;

import java.util.Scanner;

public class Team02 {
	public static void main(String[] args) {
		
		// 1) 스캐너 입력 클래스 import
		// 2) 변수 num으로 저장
		// 2-1) 출력메세지"구구단을 어디까지 출력할까요?"
		// 3) nextint 입력받은수 num에 저장
		// 4) 외부 for(int i=1; i<=9; i++){} --> 구구단 9단까지 확실
		// 4-1) 내부 for(int j=1; j<=num; j++){} --> 입력받은 단까지. (변화)
		// 4-2) 내부 for문 안에서 : printf("%d * %d = %d\\t", j, i, j*i);
		// 4-3) 외부 for문 안에서 : 줄바꿈 println();
		
		Scanner sc = new Scanner(System.in);

		int num = 0; // 몇 단까지 출력할지 입력하는 변수 생성
		System.out.print("구구단을 어디까지 출력할까요? : "); // 입력 메세지 출력

		num = sc.nextInt(); // 사용자로부터 몇 단 까지 출력할지 입력 받기
		sc.nextLine(); // 버퍼지우기

		for (int i = 1; i <= 9; i++) { // 구구단은 *9까지 출력하기 때문에 최대값 9로 지정
			for (int j = 1; j <= num; j++) {
				// 사용자로부터 입력 받은 단까지 출력하기 때문에 사용자 입력 변수를 최대값으로 지정
				System.out.printf("%d * %d = %d\t", j, i, j * i); // 탭키로 단 띄우기
			}
			System.out.println(); // 줄바꿈
		}

	}
}
