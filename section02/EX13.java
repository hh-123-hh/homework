package section02;

public class EX13 {

	public static void main(String[] args) {
      double marathon = 42.195; // 실수이므로 더블을 사용
      //float halfMarathon = 21.0975;구문 오류 발생 
      float halfMarathon = 21.0975f; 
		 //float은 4바이트, double은 8바이트기 때문에 더블이 더 크기 때문에 float 뒤에 f를 붙혀 오류가 나게 하지 않는다.
      System.out.println("마라톤은 " + marathon + "km를 달립니다.");
      System.out.println("하프마라톤은 " + halfMarathon + "km를 달립니다."); // float + 정수 + f = 해주어서 오류 발생 X


	}

}
