package aaa;

public class GenaricInventory {

	
	//part 1
	public <T extends Number> void calculateAverage(T[] numArr) {
		double total =0;
		double count = 0;
		for(T element: numArr) {
			total = total + element.doubleValue();
		    count++;	
		}
		double avg = total / count;
		System.out.println("Average of array:" + avg);
		
		}
	//part 2
	
	public <T extends Number> void calculateMinimum(T[]numArr) {
		double min = numArr[0].doubleValue();
		for(T element : numArr) {
			if(min > element.doubleValue()) {
				min = element.doubleValue();
						}
			}
		System.out.println("Minimum Value of the array: " +min);
	}

	
