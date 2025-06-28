package aaa;

public class Satelite extends Thread {

	@Override	
	public void run() {
		
		for(int i=0; i<5; i++) {
			
			System.out.println("Satalites is observing ");
			
			try {
				Thread.sleep(500);
			}
			catch (InterruptedException   e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		
	}
}
