package section05;

public class EX01 {
	public static void main(String[] args) {
		 int sum = 0;
	   
	   for(int i = 1; i <= 10; i++) {
//	      --------- -------- ----
//	      => 초기화식   => 조건식 => 증감식
		   
		   // int i = 1; 	반복문이 시작할 때 1로 초기화
		   // i <= 10		(10보다 크거나 같을 동안)이 참일 동안 반복문이 실행
		   // 반복문이 한 번 실행될 때마다 i의 값이 1씩 증가
		   
	        sum += i; 	// i의 값을 sum에 저장
	        
	        
	   }   //=>실행문
	       System.out.println("합 : " + sum);
	}                                  //--> 변수 바깥에서 사용
		  // ▼▼ 결과값 ▼▼
		  // 합 : 55
}	      