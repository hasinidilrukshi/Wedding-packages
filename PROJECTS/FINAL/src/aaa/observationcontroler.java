package aaa;

public class observationcontroler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		Telescope telescope = new Telescope();
		Satelite   satalite = new Satelite();
		
		telescope.start();
		
		try {
			telescope.join();		
		
	}
	   catch (InterruptedException e) {
		     e.printStackTrace();
	   }
		
		
		satalite.start();
		
		try {
			satalite.join();
			}
	  catch(InterruptedException e) {
		  e.printStackTrace();
	  }
		
		System.out.println("Both observstion begin simaltinious");
		
		Telescope telescope2 =new Telescope();
		Satelite  satelite2 = new Satelite();
		
		telescope2.start();
		satelite2.start();
		
	}

}
