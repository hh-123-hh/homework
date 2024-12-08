package section03;
// 3-14

public class EX14 {
	public static void main(String[] args) {

      int a = 10;
      int b = 11;

      System.out.println(a <= b); // 코드 1
      System.out.println(a == b); // 코드 2
      System.out.println(a != --b); // 코드 3
      
      // ▼▼ 결과값 ▼▼
      
      // (a는 b보다 크거나 같음 ->) true 		
      // (a는 b와 같다 ->)false
      // (b값이 감소 된 값은 10이므로 ->) false
	}
}
