
public class ThreadTest2 {
	public static void main(String[] args) throws InterruptedException {
	
		Thread t1=new Thread(()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("Hi 11111111111 "+Thread.currentThread().getName());
				try{Thread.sleep(1000);}catch(Exception e) {}
			}
		},"Hi-Thread");
		Thread t2=new Thread(()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("By 22222222222 "+Thread.currentThread().getName());
				try{Thread.sleep(1000);}catch(Exception e) {}
			}
		},"By-Thread");
//		t1.setPriority(10);
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		//1,5,10  :   5 default,normal
		//1 min priority
		//10 is the high/Max
		
//		t1.setName("Hiiiiii");
//		t2.setName("Byyyyyy");
//		System.out.println(t1.getName());
		t1.start();
		t2.start();
		//join()
		System.out.println("thread t1 before join: "+t1.isAlive()); //true
		t1.join();
		t2.join();
		System.out.println("thread t1 after join: "+t1.isAlive()); //false
		System.out.println("Hi Java Developers");
	
	}
}
