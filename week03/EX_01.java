package section08;
// 8-1
public class EX_01 {
	
		public static void main(String[] args) { // 메인 메소드 1 시작
			printHello(); // main메서드 안에서 pirntHello()메서드 호출 (-> 교재 해설) 
		} // 메인 메소드 1 끝
		
		
			static void printHello() { // 왜 static으로 선언 되었는지
									   // Plus 학습코너에서 확인합니다!
//											ㄴ> 교재에서는 객체를 생성할 방법이 없기 때문에 정적메서드인 static으로 선언 되어야한다고 한다.
				
				System.out.println("안녕하세요."); // 메인 메소드가 pirntHello를 호출 하여 [안녕하세요]의 출력메소드 가 잘 동작함 (줄바꿈)
				System.out.println("만나서 반갑습니다."); // 메인 메소드가 pirntHello를 호출 하여 [만나서 반갑습니다.]의 출력메소드 가 잘 동작함 (줄바꿈)
	}
}