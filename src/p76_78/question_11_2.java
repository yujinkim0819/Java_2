package p76_78;

class mytruck{
	String carname;
	int ton;
	String color;
}
public class question_11_2 {
	public static void main(String[] args) {
		mytruck truck = new mytruck();
		truck.carname = "프론티어";
		truck.color = "검정색";
		truck.ton = 3;
		System.out.println("나의 트럭은 " + truck.color +"이다.");
		System.out.println(truck.carname + "는 " + truck.ton +"톤을 실을 수 있다");
	}
}
