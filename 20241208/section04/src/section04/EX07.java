package section04;

public class EX07 {
	public static void main(String[] args) {
		int favorite = 7;
	   
	   if(favorite < 5) { // 1번 조건문    7 < 5는 거짓, 실행 되지 않는다.
	      System.out.println("좋아하는 숫자가 5보다 작습니다."); // 1번 구문
	   } else if(favorite > 5) { // 2번 조건문		7 > 5는 참, 실행 O
	      System.out.println("좋아하는 숫자는 5보다 큽니다.");
	   } else { 
	      System.out.println("좋아하는 숫자가 5입니다."); // favorite이 5일 때 실행되지만, favorite 값이 7이라서 실행 되지 않는다.
	      
	      // ▼▼ 결과값 ▼▼
	      // 좋아하는 숫자는 5보다 큽니다.
	      }
	   }
}