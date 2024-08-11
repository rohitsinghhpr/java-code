package programs;

public class Table {
	
	static void printTable(int num) {
		for(int i=1;i<=10;i++) {
			System.out.println(num + "*" + i + " = "+ (num*i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Table.printTable(3);
	}

}
