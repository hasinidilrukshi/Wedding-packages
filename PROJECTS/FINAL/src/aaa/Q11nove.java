package aaa;

public class Q11nove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		import java.util.PriorityQueue;
		import java.util.Scanner;

		public class BookTitles {
		    public static void main(String[] args) {
		        PriorityQueue<String> bookQueue = new PriorityQueue<>();
		        Scanner scanner = new Scanner(System.in);
		        String bookTitle;

		        System.out.println("Enter book titles one by one. Type 'done' when you are finished:");

		        while (true) {
		            bookTitle = scanner.nextLine();
		            if (bookTitle.equalsIgnoreCase("done")) {
		                break;
		            }
		            bookQueue.add(bookTitle);
		        }

		        System.out.println("Books in the priority queue: " + bookQueue);
		        scanner.close();
		    }
		}
		import java.util.PriorityQueue;
		import java.util.Scanner;

		public class BookTitles {
		    public static void main(String[] args) {
		        PriorityQueue<String> bookQueue = new PriorityQueue<>();
		        Scanner scanner = new Scanner(System.in);
		        String bookTitle;

		        System.out.println("Enter book titles one by one. Type 'done' when you are finished:");

		        while (true) {
		            bookTitle = scanner.nextLine();
		            if (bookTitle.equalsIgnoreCase("done")) {
		                break;
		            }
		            bookQueue.add(bookTitle);
		        }

		        System.out.println("Enter the title of the book you want to remove:");
		        String bookToRemove = scanner.nextLine();

		        if (bookQueue.remove(bookToRemove)) {
		            System.out.println(bookToRemove + " was successfully removed.");
		        } else {
		            System.out.println(bookToRemove + " was not found in the priority queue.");
		        }

		        System.out.println("Remaining books in the priority queue: " + bookQueue);
		        scanner.close();
		    }
		}

	}
	import java.util.PriorityQueue;
	import java.util.Scanner;

	public class BookTitles {
	    public static void main(String[] args) {
	        PriorityQueue<String> bookQueue = new PriorityQueue<>();
	        Scanner scanner = new Scanner(System.in);
	        String bookTitle;

	        System.out.println("Enter book titles one by one. Type 'done' when you are finished:");

	        while (true) {
	            bookTitle = scanner.nextLine();
	            if (bookTitle.equalsIgnoreCase("done")) {
	                break;
	            }
	            bookQueue.add(bookTitle);
	        }

	        System.out.println("Enter the title of the book you want to remove:");
	        String bookToRemove = scanner.nextLine();

	        if (bookQueue.remove(bookToRemove)) {
	            System.out.println(bookToRemove + " was successfully removed.");
	        } else {
	            System.out.println(bookToRemove + " was not found in the priority queue.");
	        }

	        // Display the total number of books
	        System.out.println("Total number of books in the priority queue: " + bookQueue.size());

	        // Print all remaining book titles
	        System.out.println("Remaining books in the priority queue:");
	        for (String title : bookQueue) {
	            System.out.println(title);
	        }

	        scanner.close();
	    }
	}


}
