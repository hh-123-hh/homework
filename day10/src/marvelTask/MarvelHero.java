package marvelTask;

public class MarvelHero {
	 //마블에 나오는 히어로를 객체로 만들어 출력하기
//  필드
  //이름, 슈퍼파워(String superpower), 나이
  
//  생성자
  //모든 필드를 매개변수로 받는 생성자
  //추가) 생성자 내에서 this 출력
  
//  메소드
  //정보출력 메소드(printInfo())
  //모든 필드 내용 출력
  
  //히어로 액션 메소드(performAction())
  //히어로 이름과 액션 출력(아이언맨이 강력한 갑옷을 사용합니다)
	
// --------------------------------------------------------
	
	// 1. 필드 만들기 
	String name;
	String superpower;
	int age;
	
	
	// 2. 생성자 만들기 
	public MarvelHero(String name, String superpower, int age) {
		this.name = name;
		this.superpower = superpower;	
		this.age = age;
		
		System.out.println(this);
	}
	
	// 3. 메소드 만들기 
	
	void printInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
	} 
	
	void performAction() {
		System.out.println("초능력 : 머리좋음" + this.superpower);
	}
	
	
}
