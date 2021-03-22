package p76_78;

class student{
	String name;
	int number;
	int tell;
	String address;
	String department;
}
//student 클래스를 상속받아 Leader 클래스를 생성
class Leader extends student{
	int study;
	int eat;
	int test;
	int play;
	int hello;
}
public class question_11_1 {
	public static void main(String args[]) {
		student kim = new student();
		kim.name = "김유진";
		System.out.println(kim.name);
		
	}
}
