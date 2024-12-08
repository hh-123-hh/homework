package section02;

public class EX27 {

	public static void main(String[] args) {
//		  2-27
	   // int형 -> byte형 강제형 변환 (값이 작을 경우)
	   int i = 10; // 정수형 변수 선언
	   byte b = (byte) i; // 정수형에서 byte형으로 강제 형변환
	   System.out.println("[int -> byte] i의 값 :" + i + "b의 값 :" + b);

	   // 결과 값 : [int -> byte] i의 값 :10b의 값 :10

	}

}
