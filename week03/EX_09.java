package section08;
//8-9
public class EX_09 {

	public static void main(String[] args) {
		Calc calc = new Calc(); // 객체 생성
		calc.sum(5,3); // clac 인스턴스 sum 메서드 호출
		// sum(int num1, int num2)
		// 이 8-8에서 매개 변수로 선언 되었기 때문에 아래 결과 값이 잘 나옴
		calc.sum(10,7); // clac 인스턴스 sum 메서드 호출
		// 8-8에서 매개 변수로 선언 되었기 때문에 아래 결과 값이 잘 나옴
	}
}

// 결과 값 ▼▼
//두수의 합은 8입니다.
//두수의 합은 17입니다.