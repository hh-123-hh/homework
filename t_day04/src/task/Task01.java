package task;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {

		// 1. 100000원이 넘는 금액을 입력받아 5만원, 1만원, 5천원, 1천원 단위로 나누어 출력하기

		// 2. 키와 몸무게를 입력받아 BMI를 계산하기
		// 공식 : 몸무게 / (키 * 키)

		// 3. 밑변과 높이를 입력받아 삼각형의 넓이 계산하기
		// 공식 : 0.5 * 밑변 * 높이

		// 4. 두 정수를 입력받아 0보다 큰지 출력하기(true or false로 출력할 것)

		// 5. 사용자에게 물건의 개수와 가격을 입력받아 총액 계산하기
		// 물건의 개수 : 3
		// 물건의 개당 가격 : 15000
		// 총액 : 금액원

		// 6. 두 자리수 정수를 한 개 입력받아 각 자리의 숫자를 더하여 출력하기(각 자리수의 합)

		// 7. 정수를 입력받아 양수이면서 짝수인지 확인하여 결과 출력하기
		// true or false

		// 8. 두 숫자를 입력받아 첫번째 입력받은 숫자가 두번째 숫자보다 크거나 같은지 여부를 출력하기
		// ture or false
		
		//1) 변수선언 3개 int 2개, boolean 1개
		//2) 입력클래스 import
		//3) 변수1 = sc.nextInt(); 변수2 = sc.nextInt();
		//4) 변수3 = 변수1 >= 변수2
		//5) 출력
		
//		int num1 = 0, num2 = 0;
//		boolean result = false;
		Scanner sc = new Scanner(System.in);
//		System.out.println("정수1 입력 : ");
//		num1 = sc.nextInt();
//		System.out.println("정수2 입력 : ");
//		num2 = sc.nextInt();
//		result = num1 >= num2;
//		System.out.println(result);
//		
//		// 9. 두 숫자를 입력받아 한 숫자만 양수인지 여부 출력하기
//		// true or false
//		
//		//1) 변수 선언 3개(int 2개, boolean 1개)
//		//2) 입력메소드 nextInt()
//		//3) 관계연산자와 논리 연산자를 이용하여 1개의 숫자만 양수인지 여부 확인
//		//	(변수1 > 0 && 변수2 <= 0) || (변수2 > 0 && 변수1 <= 0)
//		//4) 출력
		int num3 = 0, num4 = 0;
		boolean result1 = false;
		System.out.println("두 숫자를 입력하세요 (띄어쓰기로 구분) : ");
		num3 = sc.nextInt(); //3
		num4 = sc.nextInt(); //-5
//		result = (num3 > 0 && num4 <= 0) || (num4 > 0 && num3 <= 0);
//		System.out.println(result);
		
		// 음수 * 양수 == 음수, 양수 * 음수 == 음수, 양수 *  양수 == 양수, 음수 * 음수 == 양수
		result1 = num3 * num4 < 0;
		System.out.println(result1);

		// 10. 연도를 입력받아 윤년인지 아닌지 출력하기(2024년, 2025년도로 확인할 것)
		// true or false => ture이면 0000년은 윤년입니다로 출력할 것, false이면 0000년은 윤년이 아닙니다로 출력
		// 윤년 계산 : 연도가 4로 나누어떨어지고 100으로 나누어떨어지지 않거나 400으로 나누어떨어져야한다
		
		//1) 변수 선언 int 1개, boolean 1개
		//2) 출력메시지
		//3) 연도 입력받기
		//4) boolean 타입 변수 윤년 여부 계산 
		//5) 출력
		
		int year = 0;
		boolean result3 = false;
		System.out.println("연도를 입력하세요 : ");
		year = sc.nextInt();
		result3 = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		System.out.println(result3);
//		System.out.println(year + "는 윤년입니다");
//		System.out.println(year + "는 윤년이 아닙니다");
		
		System.out.println(result3 ? year + "는 윤년입니다" : year + "는 윤년이 아닙니다");
		sc.close();
	}
}








