package multhreading;

public class UsingTreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Multithreading --------------");
        
        for(int i=0;i<5;i++){
        	MyTreadClass th = new MyTreadClass();
        	th.start();
        }
	}

}
