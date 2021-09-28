import java.util.Scanner;

public class DrawingBoxes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(" Normal: ");
		for(int i=0;i<3;i++) {
			System.out.println("* ");
		}
		scanner.close();
	}
}
