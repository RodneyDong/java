import java.util.Scanner;

public class DrawingBoxes {
	
	static void printStars(int num) {
		for(int i=0;i<(num);i++) { // Prints first line 
			System.out.print("* ");
		}
	}
	// Sorry Mr. T, this program is kind of messy, because I'm not familiar with java methods
	public static void main(String[] args) {
		System.out.println("Draws two different type of boxes");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter height: ");
		int height = scanner.nextInt();
		
		System.out.print("Enter Width: ");
		int width = scanner.nextInt();
		
		System.out.print(" Normal: ");
		for (int i=0; i<(height-1);i++) { // Prints the rest of the lines
			if (i == 0) {
				printStars(width);
			}
			System.out.print("\n         "); printStars(width);
		}
		
		System.out.print("\n\nOutline: ");
		for (int lines =0; lines <(height);lines ++) { 
			if (lines == 0){ // Only prints full lines of * at the start
				printStars(width);
				continue;
			}
			if (lines == (height-1)) { // Only prints full lines of * at the end
				System.out.print("\n         "); printStars(width);
				break;
			}
			for (int x = 0; x < (width); x++) { // Prints the middle lines
				if (x==0){ // Only prints one * at the beginning
					System.out.print("\n         * ");  // spaces inserted before * to match with "outline"
					continue;
				}
				if (x==(width-1)){ // Only prints one * at the end
					System.out.print("* ");
				}
				System.out.print("  "); //Otherwise, print 2 spaces
		scanner.close();
			}
		}
	}
}
