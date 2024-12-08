package section02;

public class EX09 {

	public static void main(String[] args) {
	int myAge = 20; // 변수 선언 1
    int yourAge = myAge; // 선언한 변수에 데이터를 저장 -> 정수를 담을 수 있는 변수 myAge에 데이터 값 20이 저장됨
    
    System.out.println(myAge); // 저장한 데이터를 직접 출력
    System.out.println(yourAge); // yourAge = myAge이므로 정상 출력 되고 있다.
    
    int tempAge = myAge;
    
    System.out.println(myAge);
    System.out.println(yourAge);

	}

}

