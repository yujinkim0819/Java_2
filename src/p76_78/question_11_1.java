package p76_78;

class student{
	String name;
	int number;
	int tell;
	String address;
	String department;
}
//student Ŭ������ ��ӹ޾� Leader Ŭ������ ����
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
		kim.name = "������";
		System.out.println(kim.name);
		
	}
}
