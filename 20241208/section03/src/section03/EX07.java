package section03;

public class EX07 {
	public static void main(String[] args) {
   // 3-7

      char alphabetX = 'X'; // 유니코드 정수 88로 저장되어 'X'와 매핑
      System.out.println(alphabetX++); // alphabetX가 출력 된 후, 88+1=89가 됨
      System.out.println(alphabetX); // 89와 매핑 된 'Y'가 출력 됨
      
      // ▼▼ 결과값 ▼▼
      // X
      // Y
	}
}