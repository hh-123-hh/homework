package section02;

public class EX23 {

	public static void main(String[] args) {
	   // 2-23
      double d1 = 1.0e100; // 1.0 x (10의 100승)(float의 최대 범위를 넘음)
      float f1 = (float) d1;
      System.out.println(f1);
      
      double d2 = 1.0e-100;
      float f2 = (float)d2; // 1.0 x (10의 -100승)(float의 최대 범위를 넘음)
      System.out.println(f2); // Infinity => ? 
    
	}

}
