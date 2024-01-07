package loopMapExercise;

import java.util.Scanner;
import java.util.ArrayList;

public class NumberMap {

	public static void main(String[] args) {

		// Declare the Scanner and ArrayList
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> numberArray = new ArrayList<>();
		
		//boolean for while loop
		boolean loop = true;
		String arg;

		while (loop ) {
			
			if(numberArray.size() < 5 ) {
				// Collect the 5 nubers from the user
				for (int i = 1; i < 6;) {
					System.out.printf("%s) Please enter a number.\n", i);
					if(input.hasNextInt()) {
						numberArray.add(input.nextInt());
						System.out.println("Thank you.");
						i++;
					}
					else {// Make sure we are collecting a number
						arg = input.nextLine();
						System.out.printf("%s: is not a number.", arg);
					}
				}
			}
			else {
				System.out.println("Let's go through our number Array.\n"
						+ "Type the following commands:\n"
						+ "sum, product, largest, smallest, or quit");
			}
			arg = input.nextLine();
			
			if(arg.equals("quit")) {
				System.out.println("Program ending.");
				loop = false;
			}
			else if(arg.equals("sum")) {
				long total = 0;
				for(int i=0; i<numberArray.size(); i++ ) {
					total += numberArray.get(i);
				}
				System.out.printf("The sum of all the numbers collected is: %s\n\n", total );
			}
			else if(arg.equals("product")) {
				String result = "";
				for(int i=0; i<numberArray.size(); i++ ) {
					result += (" " + numberArray.get(i));
				}
				System.out.printf("The product of all the numbers entered is: %s\n\n", result);
			}
			else if(arg.equals("largest")) {
				int biggest = numberArray.get(0);
				for(int i=0; i<numberArray.size(); i++ ) {
					if(numberArray.get(i) > biggest) {
						biggest = numberArray.get(i);
					}
				}
				System.out.printf("The largest number in the number array is: %s\n\n", biggest);
			}
			else if(arg.equals("smallest")) {
				int smallest = numberArray.get(0);
				for(int i=0; i<numberArray.size(); i++ ) {
					if(numberArray.get(i) < smallest) {
						smallest = numberArray.get(i);
					}
				}
				System.out.printf("The smallest number in the number array is: %s\n\n", smallest);
			}
		
		}

	}

}
