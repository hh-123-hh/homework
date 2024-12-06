package section02;

public class EX28 {
	public static void main(String[] args) {
//		double형 > float형 강제형 변환(float형 범위 내 값)
	   double d1 = 1.1234; 
	   float f1 = (float)d1; 
	   System.out.println("[double -> float] d1의 값 :" + d1 + ", f1의 값 :" + f1);
	   
	   //double형 > float형 강제형 변환(float형 최소값보다 작은 경우)
	   double d2 = 1.0e-50; // 더블(실수형 변수 선언)
	   float f2 = (float)d2; // 
	   System.out.println("[double -> float] d2의 값 :" + d2 + ", f2의 값 :" + f2);
	   
	   // d1, d2 -> 실수형 변수 선언
	   // f1, f2 -> double(실수) -> float(실수)로 강제형변환
	   
	   
	   //double형 > float형 강제형 변환(float형 최대값보다 큰경우)
	   double d3 = 1.0e100;
	   float f3 = (float)d3;
	   System.out.println("[double -> float] d3의 값 :" + d3 + ", f3의 값 :" + f3);
	   
	   //double형과 float형의 정밀도 차이
	   double d4 = 9.123456789;
	   float f4 = (float)d4;
	   System.out.println("[정밀도 차이] d4의 값 :" + d4 + ", f4의 값 :" + f4);
	   
	   // d3,d4 -> 실수형 변수 선언
	   // f3,f4 -> double(실수) -> float(실수)로 강제형변환
	   
	   
	   
	   // 결과 값 
//	   [double -> float] d1의 값 :1.1234, f1의 값 :1.1234
//	   [double -> float] d2의 값 :1.0E-50, f2의 값 :0.0
//	   										ㄴ> float 표시할 수 있는 최소값 보다 작으면 0 출력 / 반대로 최대값 보다 크면 Infinity
//	   [double -> float] d3의 값 :1.0E100, f3의 값 :Infinity
//	   										ㄴ> 반대로 최대값 보다 크면 Infinity
//	   [정밀도 차이] d4의 값 :9.123456789, f4의 값 :9.123457
//	   ㄴ> 강제형변환이 되면서 소수값자리 수가 줄/늘어났다.

	   
	}
}
