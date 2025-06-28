package aaa;


import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Integer> products = new HashMap<>();
		
		Scanner sc =new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the product id:");
			int pid = sc.nextInt();
			
			if (pid== -99)
			{
				break;
				
			}
		   System.out.println("Enter product quantity:");
		   int qty = sc.nextInt();
		
		   
		   products.put(pid, qty);
		}
  
		// partv 2
		System.out.println("Enter the product id to remove:");
		int rpid = sc.nextInt();
		
	boolean	 result = products.containsKey(rpid);
		
	if (result) {
		
		products.remove(rpid);
		System.out.println("Product Successfully removed");
		
	} else {
		System.out.println("Product was not found");
	}
		
	//part 3
	
	int noofproducts =products.size();
	System.out.println("Total number of products in HashMap : " + noofproducts);
	
	//part 4
	for(Integer i : products.keySet()) {
		System.out.println("Product id:"+i+",Quantity : " + products.get(i));
		}
	
	}
	
}
