package p76_78;

class Student{
	String name;
	String hakbun;
	String phone;
	String juso;
	String major;
	boolean Chairman; //�б�ȸ������ �����ϴ� �������
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
	public void study() { System.out.println("�����ϴ�."); }
	public void eat() { System.out.println("�Ļ��ϴ�."); }
	public void test() { System.out.println("���躸��."); }
	public void extra_act() { System.out.println("���Ƹ� Ȱ���ϴ�."); }
	public void isLeader() { System.out.println("�б�ȸ���̴�."); // �б�ȸ�� ���� �޼ҵ� ����
}
class question_11_3 {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Leader hong = new Leader("ȫ�浿", "30130", ture);
		hong.isLeader();

	}

}
