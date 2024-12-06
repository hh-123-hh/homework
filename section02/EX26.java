package section02;

public class EX26 {

	public static void main(String[] args) {
	   int i = 100; // 정수형 변수 선언
	   char c = 'a'; // 문자형 변수 선언
	   int j = c; // char형에서 int형으로 자동 변환.
	   double d = i; // 실수형에서 정수형으로 자동 형 변환
	   
	   System.out.println("int형 변수 j의 값 : " + j);
	   System.out.println("double형 변수 d의 값 : " + d);
	   
//	   ▼ 결과 값 ▼ 
//	   int형 변수 j의 값 : 97
//	   double형 변수 d의 값 : 100.0
	   
	}
}