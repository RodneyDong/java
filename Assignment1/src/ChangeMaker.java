import java.util.Hashtable;
import java.util.Scanner;

class ChangeMaker {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the total purchase: ");
		double purchase = scanner.nextDouble();
		
		System.out.print("Please enter the amount tendered: ");
		double tender = scanner.nextDouble();
		
		double change = tender-purchase;
		
		double values[] = {10.00,5.00,2.00,1.00,0.25,0.05,0.1};
//		String names[] = {" ten-dollar bill"," five dollar bill"," two dollar bill"," lonnie"," quarter"," nickel"," pennie"};
		
		Hashtable<Double, String> bills = new Hashtable<>();
		bills.put(10., "ten-dollar bill");
		bills.put(5., "five dollar bill");
		bills.put(2., "two dollar bill");
		bills.put(1., "lonnie");
		bills.put(0.25, "quarter");
		bills.put(0.5, "nickel");
		bills.put(0.1, "pennie");
		
//		int index = 0;
//		for (double i: values) { // for-each
//			index += 1;
//			if (change >= i) {
//				double count = (int)(change/i);
//				System.out.println((int)count+names[index-1]);
//				change -= i*count;
//			}
//		}
//		for(int i=0; i<values.length; i++) {
//			if(change>=values[i]) {
//				double count = (int)(change/values[i]);
//				System.out.println((int)count+names[i]);
//				change -= values[i]*count;
//			}
//		}
		
		for(double x: values) {
			if(change >= x) {
				double count = (int)(change/x);
				System.out.println((int)count+"-"+bills.get(x));
				change -= x*count;
			}
		}
		scanner.close();
	}

}
