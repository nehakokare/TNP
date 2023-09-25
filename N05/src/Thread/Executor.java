package Thread;

public class Executor {

	public static void main(String[] args) {
		System.out.println("In this..."+Thread.currentThread());
		childThread t1 = new childThread();
		t1.run();
		t1.run();
		t1.run();
		

	}

}
