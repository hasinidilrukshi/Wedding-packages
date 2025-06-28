package aaa;

public class Telescope extends Thread {
  
	@Override
   public void run() {
	   for(int i=0; i<5;i++) {
		   
		   System.out.println("Teliscope is observing");
		   
		   try {
			   Thread.sleep(500);
		   }catch (InterruptedException e) {
			   
			   e.printStackTrace();
		   }
	   }
   }
}
