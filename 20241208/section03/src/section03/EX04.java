package section03;
// 3-4
public class EX04 {

	public static void main(String[] args) {
		int num = 10; 
		System.out.println(num++); // 10이 출력 된 후 num = 10+1 = 11
		System.out.println(num);
		
		// ▼▼ 결과값 ▼▼
		// 10 	-> 10이 먼저 출력 됨
		// 11	-> 그 후 +값이 된 11이 출력 됨


	}

}