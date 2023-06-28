
public class ThreadTest4 {
public static void main(String[] args) {
	Thread t2=new Thread(()->{
		for(int i=1;i<100;i++)
		{
			if(i%2!=0) {
			System.out.println("odd "+i+": "+Thread.currentThread().getPriority());
			try{Thread.sleep(100);}catch(Exception e) {}
			Thread.yield();
			//A hint to the scheduler that the current thread is willing to yieldits current use of a processor. The scheduler is free to ignore this hint. 
			}
		}
	});
	Thread t1=new Thread(()->{
		for(int i=1;i<100;i++)
		{
			if(i%2==0) {
			System.out.println("even "+i+": "+Thread.currentThread().getPriority());}
			try{Thread.sleep(100);}catch(Exception e) {}
		}
	});

	t2.start();
	try{Thread.sleep(10);}catch(Exception e) {}
	t1.start();
	
}
}
