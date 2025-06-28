package aaa;

public class InventoryManager {

	public static void main(String[] args) {
		GenaricInventory obj1 = new GenaricInventory();
		GenaricInventory obj2 = new GenaricInventory();
		
		Integer[] intArr = {1,3,4,7};
		obj1.calculateAverage(intArr);
        obj2.calculateMinimum(intArr);
        
        Double[] doubleArr = {1.1,3.25,4.45,7.67};
		obj1.calculateAverage(doubleArr);
        obj2.calculateMinimum(doubleArr);
	}

}
