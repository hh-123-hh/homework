package section02;

public class PrintPt {
public static void main(String[] args) {
  // 2-6
  System.out.printf("%.1f", 1.1234567); // 작은 정수 데이터 -0.0234567 손실 발생
  System.out.println(); // 줄바꿈 출력 메소드 사용 됨
  System.out.printf("%.2f", 1.1234567); // 작은 정수 데이터 -0.0034567 손실 발생
  System.out.println(); 
  System.out.printf("%.3f", 1.1234567); // 작은 정수 데이터 -0.0004567 손실 발생
  System.out.println();  
  System.out.printf("%.4f", 1.1234567); // 작은 정수 데이터 -0.0000433 손실 발생
  System.out.println();  
  System.out.printf("%.5f", 1.1234567); // 작은 정수 데이터 -0.0000033 손실 발생
  System.out.println();
}
}
