package section02;

import java.util.Scanner;

public class EX30 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // import 받기
		String name, adress; // 이름, 주소 변수 값 선언 
		int age; // 나이 정수 변수 값 선언 
		double weight; // 몸무게 실수 값 선언

		System.out.println("이름,주소,나이,체중을 빈칸으로 구분하여 순서대로 입력하세요");
		name = scanner.next(); // 입력 메소드로 입력값을 받아서 이름 변수에 할당
		adress = scanner.next(); // 입력 메소드로 입력값을 받아서 주소 변수에 할당
		age = scanner.nextInt(); // // 입력 메소드로 입력값을 받아서 나이 변수에 할당
		weight = scanner.nextDouble(); // 입력 메소드로 입력값을 받아서 몸무게 변수에 할당

		System.out.printf("당신의 이름은 %s입니다.%n", name);
		System.out.printf("당신의 주소는 %s입니다.%n", adress);
		System.out.printf("당신의 나이는 %d세입니다.%n", age);
		System.out.printf("당신의 체중은 %.1fkg입니다.%n", weight);
	}
	// ▼▼ 결과 값 ▼▼
//	이름,주소,나이,체중을 빈칸으로 구분하여 순서대로 입력하세요
//	냥냥
//	서울
//	1
//	5
//	당신의 이름은 냥냥입니다.
//	당신의 주소는 서울입니다.
//	당신의 나이는 1세입니다.
//	당신의 체중은 5.0kg입니다.
}
