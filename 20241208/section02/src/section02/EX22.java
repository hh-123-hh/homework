package section02;

public class EX22 {
	public static void main(String[] args) {
		// 2-22
      int i1 = 10; // int 큰 정수 값 
      byte b1 = (byte)i1; // ---> 작은 정수 값이 형변환 되어 앞에 (byte)가 붙어 형변환 됨
      System.out.println(b1);
      
      int i2 = 128; // 큰 정수 값 int 
      byte b2 = (byte)i2; // byte 값이 초과 되어 음수로 전환 됨 
      System.out.println(b2); // ---> 작은 정수 값이 형변환 되어 앞에 (byte)가 붙어 형변환 됨, 출력 값이 - 128으로 확인 됨

	}
}
