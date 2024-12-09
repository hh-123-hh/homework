package date;

public class DatePlace {

	// 필드 생성
	int money; // 예산
	String place; // 실내외

	// 생성자 생성
	public DatePlace(int money, String place) {
		this.money = money;
		this.place = place;
	}

	void dateInfo() {
		System.out.printf("현재 예산 %d, 실내외 선호 : %s", this.money, this.place); // 현재 객체의 예산과 선호도 출력 메세지 

	}
}



//데이트 장소 추천 조건 

// 예산 실내외
//레스토랑   고   실내   
//스키장    고   실외   
//수영장    저   실내   
//야경보기   저   실외

// <부모클래스 DatePlace>
// 필드
// 예산
// 실내외

// 데이트 장소 추천 조건
//      예산   실내외
// 레스토랑 고 실내
// 스키장 고 실외
// 수영장 저 실내
// 야경보기 저 실외
//
//// 멤버 필드
// 문제에 맞게 자유롭게 설정
//
//// 생성자
// 문제에 맞게 자유롭게 생성
//
//// 멤버 메소드
// dateInfo(){
// 출력 형식
// 현재 예산 : 00000원
// 실내외 선호 : 실내 o