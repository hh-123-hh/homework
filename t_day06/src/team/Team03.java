package team;

import java.util.Scanner;

public class Team03 {
	public static void main(String[] args) {
//		(1-2)
//      1. for 문 구성 : 줄을 기준으로 생각한다
//      1-1. 첫번째 줄과 마지막 줄 = 모두 문자 출력
//      1-2. 나머지 줄은 문자 출력 후 띄어쓰기 7번 반복 후 문자 출력
//      1-3. 문자 줄바꿈
		Scanner sc = new Scanner(System.in);
		String word1;
		System.out.print("단어를 입력해주세요: ");
		word1 = sc.nextLine();
		char result1 = word1.charAt(2);
		for (int i = 0; i < 5; i++) {
			if (i == 0 || i == 4) {
				for (int j = 0; j < 5; j++) {
					System.out.print(result1 + " ");
				}

			} else if (i == 1 || i == 2 || i == 3) {
				System.out.print(result1);
				for (int k = 0; k < 7; k++) {
					System.out.print(" ");
				}
				System.out.print(result1);
			}
			System.out.println();

		}
	}
}
