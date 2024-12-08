package section05;

public class EX05 {
	public static void main(String[] args) {
		 // 5-5
	   int sum = 0; // 합을 저장 할 변수
	   int i = 1;  // i를 1로 초기화
	   
	   do {
	      
	      sum += i; // i를 sum에 더함.
	      i++;
	   } while(i <= 10); // i <= 10 조건이 참이면 do로 돌아가 반복.
	   
	   System.out.println("합 : " + sum);
	   
	   // ▼▼ 결과값 ▼▼
	   // 합 : 55 			i++의 값이 i가 11이 되면 종료 됨(false가 되서)
	   }
	}