package section04;

import java.util.Scanner;

public class EX12 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("원하는 숫자를 입력하세요. (1~5)");
	
	int num = sc.nextInt();
	
	switch(num) {
	case 5:
	   System.out.println("5를 입력하셨습니다.");
	   break;
	case 4:
	   System.out.println("4를 입력하셨습니다.");
	   break;
	case 3:
	   System.out.println("3을 입력하셨습니다.");
	   break;
	case 2:
	   System.out.println("2를 입력하셨습니다.");
	   break;
	case 1:
	   System.out.println("1을 입력하셨습니다.");
	   break;
	default:
	   System.out.println("1~5까지의 숫자를 입력하세요.");
	   
	   // ▼▼ 결과값 ▼▼
	   // 원하는 숫자를 입력하세요. (1~5)
	   // 1
	   // 1을 입력하셨습니다.		// num 변수의 값과 일치하는 case의 값을 찾아 문장을 실행하여 결과 값 출력
	      }
	   }
	}
	