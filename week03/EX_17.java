package section08;
//8-17
public class EX_17 {

	public static void main(String[] args) {
		int[] studentA = {97,53};
		int[] studentB = {95,66};
		
		MidTerm mid = new MidTerm(); // MidTerm 객체생성
		int sumA = mid.score(studentA); // 메서드를 호출한 결과값을 sumA에 저장
		int sumB = mid.score(studentB); // 메서드를 호출한 결과값을 sumB에 저장
		
		if(sumA > sumB) {
			System.out.println("A학생의 중간고사 총점이 더 높습니다.");
		} else if(sumA < sumB) {
			System.out.println("B학생의 중간고사 총점이 더 높습니다.");
		} else { // sumA == sumB
			System.out.println("두학생의 중간고사 총점이 더 높습니다.");
		}
		
	}

}
