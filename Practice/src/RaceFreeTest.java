import java.util.concurrent.locks.*;

public class RaceFreeTest {
	static int counter =1;
	static Lock lock = new ReentrantLock();


	private static class RaceFreeThread extends Thread{
		String name;
		
		//constructor
		public RaceFreeThread(String name){
			super(name);
			this.name = name;
			
			System.out.println("Creating Thread: "+ name);
		}
		public void run(){
			System.out.println("Running "+ name);
			add();
						
		}

		public void add(){
			System.out.println(name + " is here");
			for(int i=0; i< 4; i++){
				System.out.println(name +" is in for");
				lock.lock();
				System.out.println(name +" is in lock");
				counter++;
				System.out.println(counter);
				lock.unlock();
			}
		}
		
		
		
	}
	
	
	public static void main(String [] args){
		//Queue<Integer>queue = new java.util.LinkedList<Integer>();
		RaceFreeThread t1 = new RaceFreeThread(" 1");
		RaceFreeThread t2 = new RaceFreeThread(" 2");
		t1.start();
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(counter==9 );
		
	}
}
