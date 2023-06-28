class Counter
{
	int count;
	//not-thrad safe
	//thread-safe
	public synchronized void increment()
	{
		count++; //count=count+1
	}
}

public class ThreadTest3 {

	public static void main(String[] args) throws InterruptedException {
		Counter counter=new Counter();
		Thread t1=new Thread(()->{
			for(int i=1;i<=1000;i++) {
				counter.increment();
			}
		});
		Thread t2=new Thread(()->{
			for(int i=1;i<=1000;i++) {
				counter.increment();
			}
		});
		/*
		 * Thread t3=new Thread(()->{ for(int i=1;i<=1000;i++) { counter.increment(); }
		 * });
		 */
		
		t1.start();
		t2.start();
//		t3.start();
		t1.join();
		t2.join();
//		t3.join();
		
	
		System.out.println(counter.count);
		
	
	}
}
