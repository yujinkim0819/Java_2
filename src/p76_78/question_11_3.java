package p76_78;

class Student{
	String name;
	String hakbun;
	String phone;
	String juso;
	String major;
	boolean Chairman; //학급회장인지 판정하는 멤버변수
	public Student() { }
	public Student(String name, String hakbun) {
		this.name = name;
		this.hakbun = hakbun;
	}
	public Student(String name, String hakbun, boolean Chairman) {
		this.name = name;
		this.hakbun = hakbun;
		this.Chairman = Chairman;
	}
	public void study() { System.out.println("공부하다."); }
	public void eat() { System.out.println("식사하다."); }
	public void test() { System.out.println("시험보다."); }
	public void extra_act() { System.out.println("동아리 활동하다."); }
	public void isLeader() { System.out.println("학급회장이다."); // 학급회장 판정 메소드 정의
}
class question_11_3 {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Leader hong = new Leader("홍길동", "30130", ture);
		hong.isLeader();

	}

}
