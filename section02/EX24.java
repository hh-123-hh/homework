package section02;

public class EX24 {
	public static void main(String[] args) {
		
		 // 2-24
	      // 실수형
	      double pie = 3.14; // 더블 3.14의 값을 pie라는 변수에 담아 지정
	      int pieInt = (int) pie; // 실수 -> 정수형으로 강제형 변환
	      System.out.println(pieInt); // 강제 형 변환 한 pieInt를 줄바꿈 하여 출력

	      // 정수형 > 실수형 (범위내)
	      int numb = 100; // 정수형 변수 선언 
	      double numD = (double) numb; // numb를 정수형에서 실수형으로 강제형변환
	      float numF = (float) 100; // 정수 -> 실수로 강제형변환
	      System.out.println(numD); // numD의 결과값 출력 메소드 
	      System.out.println(numF); //numF의 결과값 출력 메소드 

	      // 정수형 > 실수형 (범위 밖)
	      int i = 99999999; // 정수형 변수 선언
	      float f = (float) i; // 정수형 -> 실수형 강제 형 변환
	      System.out.println(f); 
	      
	      // ▼ 결과값 ▼ 
//	      3 [실수 -> 정수로 강제 형변환되어 소수점 자리가 사라짐]
//	      100.0 
//	      100.0  -> 그래서 정수형태인 100에서 100.0으로 바뀜
//	      1.0E8 -> 강제 형변환 되어 엄청 큰숫자로 바뀜
	}
}