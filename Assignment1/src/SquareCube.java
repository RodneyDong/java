import java.util.Scanner;

public class SquareCube {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Squares and Cubes\n");
		
		while (true) {
			System.out.print("Enter a positive integer less than 100: ");
			int num = scanner.nextInt();
			if ((num<100)&&(num>=1)) {
				System.out.printf("%10s%10s%10s\n","Number","Square","Cube");
				for (int i=1;i<=num;i++) {
					System.out.printf("%10s%10d%10d\n",i,i*i,i*i*i); 
				}
				break;
			}
			System.out.println("Error: Must be a positive integer less than 100"); // Loops back if invalid input
		}
		scanner.close();
		
	}
	
	static String pad(int num, int space) { // return the amount of space based on length given and how many space the user want
		String result = ""; 				// I didn't use pad in the program
		int len = space - (""+num).length();
		for (int i = 0; i < len; i++) {
			result+= " ";
		}
		result += num;
		return result;
	}
}
