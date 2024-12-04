package section08;
// 8-2
public class Jogger { // Jogger라는 이름의 새로운 클래스 생성
		String name;

	void run() {  // 리턴타입을 보이드로 선언, run 이라는 새로운 객채명 생성
		System.out.println("run run run!"); // 출력메소드 내용은 run run run!이라고 작성
	}
	
		// 8-4 
			void sayName() { // SayName이라는 새로운 객체명 생성
				// 필드를 이용해 아래 문장 출력 -> 교재설명 // 출력 메소드 내용은 "제 이름은 " + name + "입니다."
				System.out.println("제 이름은 " + name + "입니다.");
		}
	}