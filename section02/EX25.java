package section02;

public class EX25 {
	public static void main(String[] args) {
	   int number1 = 14;
	   double number2 = 3.14;
	   
//	    double number4 = number1; // number1을 자동으로 double로 형변환 해줌
//	    int number1 = (double) number2; // 자동형변환을 할 수 없는 역박향! 컴파일 에러 발생!
	   
	   int number4 = (int) number2; // 작은 범위에서 큰범위로 갈때 자동 형변환 된다.
	   System.out.println(number4); 
	   
	   // 결과 값 = 3 
	   // number4가 선언됨과 동시에 형변환이 진행되어 뒤에 소수점은 생략 되었다.
	}
}
