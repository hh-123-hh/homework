package section08;
// 8-5
public class EX_05 {
	public static void main(String[] args) { // 메인메소드 생성
		Jogger jogger = new Jogger(); // jooger 객체 생성
		jogger.name = "강후현"; // 객체.name 생성 
		jogger.sayName(); // jogger 인스턴스의 sayName()메서드 호출
		jogger.run(); // jogger 인스턴스의 run()메서드 호출
	}

}

// 결과 값 ▼
// 제 이름은 강후현입니다.
// run run run!