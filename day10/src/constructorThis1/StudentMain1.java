package constructorThis1;

public class Student1 {
	 // 필드
	   String name;
	   int age;

	   // 생성자
	   public Student1(String name, int age) {
	      name = name; // 의도한대로 동작하지 않는다
	      age = age; // 지역변수의 값을 그대로 대입하기 때문에 필드는 초기화 되지 않는다
	      System.out.println(name);
	   }

	   // 메소드
	   void studentInfo() {
	      System.out.println("이름 : " + name);
	      System.out.println("나이 : " + age);
	   }
	}

public class StudentMain1 {
	public static void main(String[] args) {
		Student st = new Student("신짱구", 5);
	}

}
