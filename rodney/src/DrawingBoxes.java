
public class DrawingBoxes {

	public static void main(String[] args) {
		System.out.print("  Normal: ");
		System.out.println("* * * * *");
		for(int i=0; i<3; i++) {
			System.out.println("          * * * * *");
		}
		System.out.print("Outline: ");
		System.out.println(" * * * * *");
		for(int i=0; i<2; i++) {
			System.out.println("          *       *");
		}
		System.out.println("          * * * * *");
	}

}
