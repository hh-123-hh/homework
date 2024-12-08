package section02;

public class EX11 {
	public static void main(String[] args) {
		
		byte num = 20; // byte라는 정수 자료형을 숫자 20 = num1이라는 변수로 선언 
      // byte num5 - 128; 이구문은 에러가 발생합니다. 이유가 무엇일까요?
      // byte가 저장할 수 있는 숫자의 범위 -128~127의 범위를 벗어나기 때문에 저장 할 수 없습니다.
		
      short num1 = 20;//short라는 정수 자료형을 30 = num2이라는 변수로 선언
      int num2 = 30; // int 라는 정수 자료형을 30 = num2이라는 변수로 선언
      long num3 = 40; // long이라는 정수 자료형을 40 = num3라는 변수로 선언

      System.out.println(num);	 // 자료형 byte 로 20 정상 출력
      System.out.println(num1); // 자료형 short 로 20 정상 출력
      System.out.println(num2); // 자료형 int 로 30 정상 출력
      System.out.println(num3); // 자료형 long 로 40 정상 출력
		
	}

}
