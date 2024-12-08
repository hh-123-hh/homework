package section02;

public class EX16 {

	public static void main(String[] args) {
		// 2-16
	      int ga = '가'; // char형은 유니코드형으로도 출력 가능 -> 44032
	      int na = '나'; // -> 45208
	      
	      int alphabetA = 'A'; //유니코드(정수) 65 -'A'와 매핑됨
	      int alphabetB = 'B'; //유니코드(정수) 66 -'B'와 매핑됨
	      
	      System.out.println(ga);
	      System.out.println(na);
	      System.out.println(alphabetA); // '가'는 44032 유니코드값 출력
	      System.out.println(alphabetB); // '나'는 45208 유니코드값 출력
	      
	      // 결과 값
//	      44032
//	      45208
//	      65
//	      66
	}

}
