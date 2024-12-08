package section05;

public class EX06 {
	public static void main(String[] args) {
		 // 5-6
		int sum = 0; // 합을 저장 할 변수
		int i = 1;  // i를 1로 초기화
	   
	   //i가 10보다 작을때 까지 반복
	      while(i <= 10) {
	         sum += i; // sum에 i값을 누적
	         i++; // i가 증가
	      }
	      
	      System.out.println("합 : " + sum);
	      
	      // ▼▼ 결과값 ▼▼
	      // 합 : 55				-> (i <= 10)가 참이기 때문에 실행됨

	      }
	   }