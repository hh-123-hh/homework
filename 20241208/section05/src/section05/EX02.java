package section05;

public class EX02 {
	public static void main(String[] args) {
		int sum = 0; // 합을 저장 할 변수
	   
	         for(int i = 1; i <= 100; i++) { // 1부터 100까지 반복
	            if(i % 2 == 0) {
	               // 짝수의 합을 더한다.
	            	
	         // int i = 1; 	반복문이 시작할 때 1로 초기화
	         // i <= 100;	(i는 100보다 크거나 같을 동안) 이 참일동안 반복문이 실행 됨
	         // 증감식으로
	         // 조건식 : i 값을 2로 나눴을 때 나머지는 0이 되어야한다.
	            	
	               sum += i;
	            }
	         }
	   System.out.println("합 : " + sum);
	   
	   // ▼▼ 결과값 ▼▼
	   // 합 : 2550

	}
}