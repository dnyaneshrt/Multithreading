
public class ThreadTest5 {
	public synchronized void printOddNumbers() throws InterruptedException
	{
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0) {
			System.out.println("Hi");
//			System.out.println(i);
			}
//			try{Thread.sleep(3000);}catch(Exception e) {}
			wait();
			notify();	
		}
	}

	public synchronized void printEvenNumbers() throws InterruptedException
	{
		for(int i=1;i<=100;i++)
		{
			if(i%2==0) {
//			System.out.println(i);
				System.out.println("by");}
//			try{Thread.sleep(1000);}catch(Exception e) {}
			notify();
			wait();
			
		}
	}

	public static void main(String[] args) {
		ThreadTest5 threadTest5=new ThreadTest5();
		Thread t1=new Thread(()->{
			try {
				threadTest5.printOddNumbers();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread t2=new Thread(()->{
			try {
				threadTest5.printEvenNumbers();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		t1.start();
		t2.start();
	}

}
