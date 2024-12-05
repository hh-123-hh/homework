package constructorBascic1;

public class Animal {

//	1. 동물 클래스를 작성하세요
//	 필드(속성) : '이름', '나이', '종류'라는 필드
//	    - 이름 : 동물의 이름을 저장하는 곳
//	    - 나이 : 동물의 나이를 저장하는 곳
//	    - 종류 : 동물의 종류(개, 고양이, 새 등)를 저장하는 곳
//	 메서드(행동)
//	    - 밥먹기() : 동물이 밥을 먹는 행동을 하는 메서드
//	    - 놀기() : 동물이 노는 행동을 하는 메서드
//	    - 자다() : 동물이 자는 행동을 하는 메서드
//	    - 생일축하() : 동물의 생일을 축하하는 메서드
	
	// 1. 필드 생성
	// 2. 생성자 생성
	
	String name;
	public Animal(String name, int age, String type) {
		this.name = name;
		this.age = age;
		this.type = type;
		
		System.out.println(this);
	}

	int age;
	String type;
	
	// 2. 메소드 만들기
	
	void printInfo() {
		System.out.println();
	}
	
	
	
	
	
	

	
	
}








