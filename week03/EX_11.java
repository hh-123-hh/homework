package section08;
// 8-11
public class EX_11 {

	public static void main(String[] args) { // 메인 메소드
		Person hong = new Person(); // 객체 생성
		// new라는 객체 생성 도구를 사용하여 예제 8-10에서 만들어둔 Person 객체를 생성
		hong.introduce("강후현", 31); // hong 인스턴스 introduce 메서드 호출
		// 본인 이름과 나이 대입
		hong.hello();
		
		// ▼ 결과 값 ▼
		// 제 이름은 강후현이고, 나이는 31세입니다.
		//안녕하세요.
	}
}