package teample;
import java.util.Scanner;

public class FortuneCookie {

   public static void main(String[] args) {
      System.out.println("오늘의 날짜와 이름을 입력하면 오늘의 운세를 확인 할 수 있습니다");
      Scanner scan = new Scanner(System.in);

      String name = scan.nextLine();
      int today = scan.nextInt();

      System.out.println(tellFortune(name, today));
      ;

   }

   public static String tellFortune(String name, int today) {

      String fortune = "";                                                           
      int unicodeSum = 0;
      for (int i = 0; i < name.length(); i++) {
         unicodeSum += name.charAt(i) + today;
      }

      int result = unicodeSum % 5;

      switch (result) {
      case 0:
         return "오늘은 행운의 날입니다!";
      case 1:
         return "약간의 어려움이 있을 수 있어요.";
      case 2:
         return "평온한 하루가 예상됩니다.";
      case 3:
         return "모험심을 발휘해보세요!";
      case 4:
         return "좋은 일이 찾아올 거예요.";
      }
      return fortune;
   }
}