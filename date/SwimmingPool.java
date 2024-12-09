package date;

public class SwimmingPool extends DatePlace { // 자식 클래스 생성 상속관계 연결 
	
	public SwimmingPool(int money, String place) {
		super(money, place);
	}

	@Override // 각 추천지 마다 다른 메세지를 출력해주기 위해 오버라이드 해줬음
	void dateInfo() {
		System.out.println("저예산 및 실내를 선호하시는 분께 수영장을 추천드립니다."); // SwimmingPool이 호출 되었을 때 출력 되는 메세지
		System.out.printf("현재 예산 %d, 실내외 선호 : %s", this.money, this.place); // 현재 객체의 예산과 선호도 출력 메세지 
	}

}
