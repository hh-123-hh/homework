package section08;
//8-15
public class EX_15 {

	public static void main(String[] args) {
		int[] nums = {500, 200}; // 배열 생성
		// 
		Calc calc = new Calc(); // Calc 객체 생성 
		// calc 인스턴스의 sum 메서드를 호출하여 return된 결과 값을 출력
		System.out.println("숫자들의 합은 " + calc.sum(nums) + "입니다.");
		
		
		// System.out.println("숫자들의 합은 " + calc.sum(nums) + "입니다.");
		// ㄴ> 이렇게 하지 않아도
	
		// ▼▼ 결과값 ▼▼
		//숫자들의 합은 700입니다.  ==>> 해당 결과 값이 정상 출력 되고 있다.
		
	}

}