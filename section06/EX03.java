package section06;

public class EX03 {
	public static void main(String[] args) {
		
		// 5개의 공간을 가지는 배열 선언
		int[] intArray = new int[5];
		String[] strArray = new String[5];
		
		// 5개의 값을 가지는 배열 선언
		int[] varArray = {1,2,3,4,5};
		
		// intArray의 첫번째 값을 출력
		System.out.println("intArray[0] = intArray[0]");
		// intArray의 두번째 값을 출력
		System.out.println("intArray[0] = intArray[1]");
		
		// strArray의 첫번째 값 출력
		System.out.println("strArray[0] = " + strArray[0]);
		// strArray의 첫번째 값 출력
		System.out.println("strArray[0] = " + strArray[1]);
		
		// varArray의 첫번째 값을 출력 
		System.out.println("varArray[0] = " + varArray[0]);
		// varArray의 두번째 값을 출력 
		System.out.println("varArray[1] = " + varArray[1]);
		
		// ▼ 결과 값 ▼ 
//		intArray[0] = intArray[0]
//				intArray[0] = intArray[1]
//				strArray[0] = null
//				strArray[0] = null
//				varArray[0] = 1
//				varArray[1] = 2
		
	}
}
