import java.util.Scanner;

class ChangeMaker {
	
	public static void main(String[] args) {
		System.out.println("Calculates Coins needed for Change");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the total purchase: ");
		double purchase = scanner.nextDouble();
		
		System.out.print("Please enter the amount tendered: ");
		double tender = scanner.nextDouble();
		
		double change = Math.round((tender-purchase)*100.0)/100.0; //This makes sure that the value is at 2 decimal places
		System.out.println("The change will be: $"+change);
		
		double values[] = {10.00,5.00,2.00,1.00,0.25,0.05,0.01}; // Coin values
		String names[] = {" ten-dollar bill"," five dollar bill"," two dollar bill"," lonnie"," quarter"," nickel"," pennie"}; // Coin names
		
		System.out.println("\nYou need: ");
		for (int i=0; i<values.length;i++) {
			if (change >= values[i]) {
				double count = (int)(change/values[i]); // Divides to nearest whole number
				System.out.println((int)count+names[i]); // Prints out the name of the corresponding to the value
				change -= values[i]*count; // minus the value already caluclated
			}
		}
		scanner.close();
	}
}
