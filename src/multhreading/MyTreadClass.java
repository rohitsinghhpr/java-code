package multhreading;

//by extending Thread Class.
public class MyTreadClass extends Thread{
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+" is  running");
		}catch(Exception e) {
			System.out.println("exception is caught");
		}
	}
}
