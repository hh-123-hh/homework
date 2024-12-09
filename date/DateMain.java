package date;													

import java.util.Scanner;										//Scanner class 임포트

public class DateMain {											// DateMain Class 생성
	public static void main(String[] args) {					// 메인메소드 생성

		int foo = 0;											// 정수 타입 변수 생성
		String roo = "";										// 문자열 타입 변수 생성

		Scanner sc = new Scanner(System.in);					// Scanner class ipmort 
		System.out.println("당신의 예산과 실내 외 선호를 입력하세요.");		// 안내 메세지 출력 

		foo = sc.nextInt();										// 정수 타입 입력 메소드
		sc.nextLine();											// 버퍼 정리
		roo = sc.nextLine();									// 스트링 타입 입력 메소드

		// 객체 생성
		DatePlace dp = new DatePlace(foo, roo);					// ★★★ DatePlace 라는 부모 객체 생성 ★★★

//	
		if (foo >= 100000) {													// 10만원 이상이면 고예산으로 판단하여
			if ((roo).equals("실내")) { 											// equals 괄호안의 내용과 일치하면 true			
				Restaurant rs = new Restaurant(foo, roo);						// 자식 클래스 객체를 rs << 생성, 필드값으로 예산과 실내외 선호도를 전달
				rs.dateInfo(); 													// 1) 고예산, 실내를 선호 할때의 데이트 코스 추천
			} else if ((roo).equals("실외")) {									// equals 괄호안의 내용과 일치하면 true		
				Ski sk = new Ski(foo, roo);										// 자식 클래스 객체를 sk << 생성, 필드값으로 예산과 실내외 선호를 전달
				sk.dateInfo(); 													// 2) 고예산, 실외를 선호 할 때의 데이트 코스 추천 -> ★ 오버라이드 된 자식 클래스의 메소드.
			}

		} else if (foo < 100000) {												// 10만원 마먼아면 저예산으로 판단하여 
			if ((roo).equals("실내")) {											// equals 괄호안의 내용과 일치하면 true
				SwimmingPool sw = new SwimmingPool(foo, roo);					// 자식 클래스 객체를 생성, 필드값으로 예산과 실내의 선호도를 전달
				sw.dateInfo(); 													// 3) 저예산, 실내를 선호 할 때의 데이트 코스 추천			
			} else if ((roo).equals("실외")) {									// equals 괄호안의 내용과 일치하면 tru
				NightView ni = new NightView(foo, roo);							// 자식 클래스 객체를 ni << 생성, 필드값으로 예산과 실내 외 선호를 전달.
				ni.dateInfo(); 													// 4) 저예산, 실외를 선호 할 때의 데이트 코스 추천
			}
		}
	}
}