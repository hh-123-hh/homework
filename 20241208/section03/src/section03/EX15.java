package section03;

public class EX15 {
	public static void main(String[] args) {
//      // 3-15
      boolean b1 = true;
      boolean b2 = false;
      boolean b3 = true;
      boolean b4 = false;
      									// ▼▼ 결과값 ▼▼
      System.out.println("###논리곱###");
      System.out.println(b1 && b2); // 하나만 true라서 false
      System.out.println(b1 && b3); // 두합이 모두 true라서 false
      System.out.println(b2 && b4); // 두합이 모두 false라서 false
      System.out.println();

      System.out.println("###논리합###");
      System.out.println(b1 || b2); // b1이 true라서 true
      System.out.println(b1 || b3); // 두합이 모두 true라서 true
      System.out.println(b2 || b4); // 두합이 모두 false라서 false
      System.out.println();

      System.out.println("###배타적 논리합###");
      System.out.println(b1 ^ b2); // 달라서 true
      System.out.println(b1 ^ b3); // 같아서 false
      
	}
}
