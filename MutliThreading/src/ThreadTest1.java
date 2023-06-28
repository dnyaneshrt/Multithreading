
//by using first way.. by extending Thread class

/*class Hi extends Thread{
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
		System.out.println("hiiiiiiiiiiiiii");	
		try { Thread.sleep(500); } catch (InterruptedException e) {e.printStackTrace();}
		}	
	}
}

class By extends Thread{

	public void run() {
		for(int i=1;i<=10;i++)
		{
		System.out.println("byyyyyyyyyyyyy");
		System.out.println("---------------------------------");
		try { Thread.sleep(500); } catch (InterruptedException e) {e.printStackTrace();}
		}
	}

}*/

/*
class Hi implements Runnable{

	public void run()
	{
		for(int i=1;i<=10;i++)
		{
		System.out.println("hiiiiiiiiiiiiii");	
		try { Thread.sleep(500); } catch (InterruptedException e) {e.printStackTrace();}
		}	
	}
	
}

class By implements Runnable{

	public void run() {
		for(int i=1;i<=10;i++)
		{
		System.out.println("byyyyyyyyyyyyy");
		System.out.println("---------------------------------");
		try { Thread.sleep(500); } catch (InterruptedException e) {e.printStackTrace();}
		}
	}

}*/

public class ThreadTest1 {

	public static void main(String[] args) {
	
	
		/*
		 * Thread t1=new Thread(new Runnable() {
		 * 
		 * @Override public void run() { for(int i=1;i<=10;i++) {
		 * System.out.println("hiiiiiiiiiiiiii"); try { Thread.sleep(500); } catch
		 * (InterruptedException e) {e.printStackTrace();} }
		 * 
		 * } });
		 */
      Thread t1=new Thread(()-> {
				for(int i=1;i<=10;i++)
				{
				System.out.println("hiiiiiiiiiiiiii");	
				try { Thread.sleep(500); } catch (InterruptedException e) {e.printStackTrace();}
				}});
		t1.start();// start method will start thread by internally calling run()
//		t1.start(); one thread can be started only once..
		try { Thread.sleep(200); } catch (InterruptedException e) {e.printStackTrace();}
	
		
		/*
		 * Thread t2=new Thread(()-> {
		 * 
		 * for(int i=1;i<=10;i++) { System.out.println("Byyyyyyyyyyyyyy"); try {
		 * Thread.sleep(500); } catch (InterruptedException e) {e.printStackTrace();}
		 * }}); t2.start();// start method will start thread by internally calling run()
		 */
		
		 new Thread(()-> {
			for(int i=1;i<=10;i++)
			{
			System.out.println("Welcome");	
			try { Thread.sleep(500); } catch (InterruptedException e) {e.printStackTrace();}
			}}).start();// start method will start thread by internally calling run()
	}

}
