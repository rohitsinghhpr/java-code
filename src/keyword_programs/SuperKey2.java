package keyword_programs;

public class SuperKey2 {

	public static void main(String[] args) {

		SuperDemo sm1 = new SuperDemo();
		sm1.showData();
		
	}

}

class Demo{
	int x = 90;
}
class SuperDemo extends Demo{
	int x = 100;
	public void showData() {
	  // System.out.println(x); // 100
	  // but we wanna access to paretn ver
		System.out.println(super.x); // 90
	}
}

