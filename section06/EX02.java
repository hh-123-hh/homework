package section06;

public class EX02 {
	public static void main(String[] args) {
		// 4개의 공간을 가진 배열을 선언
		int[]arr = new int[4];
		
		// 배열에 값을 삽입
		arr[0] = 1;		// 첫번째 인덱스의 값이 1이라고 선언
		arr[1] = 2;		// 두번째 인덱스의 값이 2이라고 선언
		arr[2] = 3;		// 세번째 인덱스의 값이 3이라고 선언
		arr[3] = 4;		// 네번째 인덱스의 값이 4이라고 선언
		
		// 배열에 값을 출력
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr[1] = " + arr[1]);
		System.out.println("arr[2] = " + arr[2]);
		System.out.println("arr[3] = " + arr[3]);
		
//		▼ 결과 값 ▼  
// 		arr[0] = 1
//		arr[1] = 2
//		arr[2] = 3
//		arr[3] = 4

		
	}
}