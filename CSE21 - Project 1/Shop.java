import java.io.PrintStream;
import java.util.*;

public class Shop {

	static double qualifier = 0;
	static double rate = 0;

	// Setup Shop
	public static int Setup(Scanner input, String[] names, double[] prices) {
		System.out.println("Please enter amount of items: ");
		int items = input.nextInt();

		for(int i = 1; i <= items; i++) {
			System.out.print("Enter name " + i + ":");
			names[i] = input.next();

			System.out.print("Enter price " + i + ": ");
			prices[i] = input.nextDouble();
		}

		System.out.print("Please enter qualifying amount: ");
		qualifier = input.nextDouble();

		System.out.print("Please enter discount rate: ");
		rate = input.nextDouble();

		return items;
	}

	// Buy Items
	public static void Buy(Scanner input, String[] names, double[] prices, int[] amounts, int items) {

		for(int i = 1; i <= items; i++) {
			System.out.print("Enter the amount of " + names[i] + ": ");
			amounts[i] = input.nextInt();
		}
	}

	// List Items
	public static void List(String [] names, double[] prices, int[] amounts, int items) {
		for(int i = 1; i <= items; i++) {
			if (amounts[i] > 0) {
				System.out.print(amounts[i] + " count of " + names[i] + " @ $");
				System.out.println(prices[i] + " = $" + amounts[i] * prices[i]); 
			}
		}



	}

	// Checkout
	public static void Checkout(double[] prices, int[] amounts) {

		double total = 0;

		for(int i = 1; i < amounts.length; i++) {
			total = prices[i] * amounts[i] + total;
		}

		double disc = 0;
		disc = (total * (rate));

		if (total >= qualifier) {
			System.out.println();
			System.out.println("Thanks for coming");
			System.out.println("Sub Total: \t $" + total);
			System.out.println("-Discount: \t $" + disc);
			System.out.println("Total: \t $" + (total - disc));
		}
		else if (total < qualifier) {
			System.out.println();
			System.out.println("Thanks for coming");
			System.out.println("Sub Total: \t $" + total);
			System.out.println("-Discount: \t $" + "$0.0");
			System.out.println("Total: \t $" + total);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int MAX = 100;
		int set = 0;
		int buy = 0;
		int items = 0;

		String[] names = new String[MAX];
		double[] prices = new double[MAX];
		int[] amounts = new int[MAX];
		
		do {
			
		System.out.println("This program supports 4 functions:");
		System.out.println("1. Setup Shop");
		System.out.println("2. Buy");
		System.out.println("3. List Items");
		System.out.println("4. Checkout");
		System.out.print("Please choose the function you want: ");
		int func = input.nextInt();
		if ( 1 <= func || func >= 4) {
			
			if (func == 1) {
				
				if (set == 0) {
					items = Setup(input, names, prices);
				}

				set = 1;
			}

			if (func == 2) {
				
				if (set == 1){
					Buy(input, names, prices, amounts, items);
				}
				
				else{
					System.out.println("Shop is not setup yet!");
				}
			buy = 1;
			}
			

		}

		if (func == 3) {

			if (set == 0) {
				System.out.println("Shop is not setup yet!");
			}
			else if (set == 1 && buy == 0) {
				System.out.println("Try again: You have not bought anything");
			}
			else if (buy == 1) {
				List(names, prices, amounts, items);
			}
		}

		if (func == 4) {
			
			if (set == 0) { 
				System.out.println("Shop is not setup yet!");
			}
			else if (buy == 0) {
				System.out.println("Try again: You have not bought anything");
				continue;
			}
			else if (buy == 1) {
				Checkout(prices, amounts);
				break;
			}
			
			}
		else if (func < 0 || func > 4) {
			System.out.println("Error: Do not know " + func);
		}
		
	}
		while(true);
	}
}





