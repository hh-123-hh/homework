package section02;

public class EX29 {
	public static void main(String[] args) {
		 // 2-29
	   // float형 -> int형 강제형변환
	   float f1 = 12345.67f; // float 변수 선언
	   int i1 = (int) f1; // int로 강제 형변환
	   System.out.println("[float -> int] f1의 값 :" + f1 + ", i1의 값 :" +i1);
	   // double형 -> int형 강제형변환
	   double d1 = 12345.678; // double 변수 선언
	   int i2 = (int) d1; // int로 강제 형변환
	   System.out.println("[double -> int] d1의 값 :" + d1 + ", i2의 값 :" +i2);
	   
//	   ▼ 결과 값 ▼
//	   [float -> int] f1의 값 :12345.67, i1의 값 :12345		 [실수 타입 -> 정수타입 형변환]  
//	   [double -> int] d1의 값 :12345.678, i2의 값 :12345		 [실수 타입 -> 정수타입 형변환]
		
	}
}
