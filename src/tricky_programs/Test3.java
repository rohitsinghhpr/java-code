package tricky_programs;

public class Test3 {

	public static void main(String[] args) {
		
        new MyAction().click();
        new MyAction().dobleClick();
        new MyAction().dragAndDrop();
        
        System.out.println("-----------------------------");
        
        MyAction a1 = new MyAction(), a2 = new MyAction(), a3 = new MyAction();
        a1.click();
        a2.dobleClick();
        a3.dragAndDrop();
        
	}

}

class MyAction{
	void click() {
		System.out.println("click");
	}
	void dobleClick() {
		System.out.println("double click");
	}
	void dragAndDrop() {
		System.out.println("drag and drop");
	}	
}