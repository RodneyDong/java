
import java.util.Scanner;

class Levels {
	public static int getLevel(int grade) { // Returns corresponding level
		if (grade<50) return 0;
		if (grade<60) return 1;
		if (grade<70) return 2;
		if (grade<80) return 3;
		return 4;

	}

	public static void main(String[] args) {
		System.out.println("Calculates the level of you grade");	
		Scanner scanner = new Scanner(System.in);
		
		while (true) { // while loop is to check user input, if input invalid grade, loops back and ask for input again
			System.out.print("Enter your grade: ");
			int grade = scanner.nextInt();
			if ((grade <= 100) && (grade >= 1)){
				System.out.println(grade + " is in level " + getLevel(grade) );
				break;
			}
			System.out.print("Error: Grade has to be between 1 and 100 ");
			}
		
		scanner.close();
	}	

}

