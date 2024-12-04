package section08;
// 8-8

public class Calc { // 클래스 명 : Calc
	void sum(int num1, int num2) { //정수형 int가 매개 변수 num1, num2 로 선언되었다. 
		System.out.println("두수의 합은 " + (num1 + num2) + "입니다."); // num1 + num2 결과값이 출력 될 예정
	}
	// 8-12
	void sum1(int[] nums) { // 배열이름이 nums인 매개 변수 선언
		int reslut = 0;
		for(int i = 0; i < nums.length; i++) { // i를 0부터 시작해서 배열길이 만큼 반복한다. nums를 result에 합산한다.
			reslut += nums[i]; // 매개변수로 받은 배열의 요소 값을 하나씩 result 값을 더함
		}
			System.out.println("숫자들의 합은 " + reslut + "입니다.");
	}
	// 8-14
	public int sum(int[] nums ) {
		int result = 0; // 
		for(int i = 0; i < nums.length; i++) {
			result += nums[i];
		}
		
		return result; // 매개변수로 받은 값을 모두 더한 result 값을 다시 반환함
	}
}
