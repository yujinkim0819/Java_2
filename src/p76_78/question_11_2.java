package p76_78;

class mytruck{
	String carname;
	int ton;
	String color;
}
public class question_11_2 {
	public static void main(String[] args) {
		mytruck truck = new mytruck();
		truck.carname = "����Ƽ��";
		truck.color = "������";
		truck.ton = 3;
		System.out.println("���� Ʈ���� " + truck.color +"�̴�.");
		System.out.println(truck.carname + "�� " + truck.ton +"���� ���� �� �ִ�");
	}
}
