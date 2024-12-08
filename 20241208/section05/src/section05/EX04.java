package section05;

public class EX04 {
	public static void main(String[] args) {
		
		for(int i = 0; i < 7; i++) {
	      // 공백이 하나씩 줄어들게 된다.
	      for(int j = 0; j < 7 -i; j++) {
	         System.out.print(" "); // print인점 주의..
	      }					// 해당 for문에서는 여백값 출력을 위한 식이다.
	   
	   // 별모양은 홀수로 늘어난다.
	   for(int k = 0; k < (2*i) + 1; k++) {
	      System.out.print("*");	//print인점 주의..
	   }					// 해당 식은 별모양이 늘어나는식을 나타낸식이다.
	
	   
	   // 줄을 바꾼다.
	      System.out.println();
	      }
	   }
}
		//  ▼▼ 결과값 ▼▼
//		        *
//			   ***
//			  *****
//			 *******
//			*********
//		   ***********
//		  *************



