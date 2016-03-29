/**
 *   File Name: jogger.java<br>
 *
 *   Siebenthal, Madina<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 28, 2016
 *
 */

package jogger;

import java.util.*;

/**
 * jogger //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Siebenthal, Madina
 * @version 1.0.0
 * @since 1.0
 *
 */
public class jogger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = null;
		int count = 0;
		// declaring and initiolazing starting result from 0
		int result = 0;
		int daysNumber = 0;
		int hoursRan = 0;
		String name = null;

		String nameJogger = null;
		// can use true , contine and break, but cleaner to use bolean
		boolean toContinue = true;
		while (toContinue) {
			System.out.println("Whats you name?");
			input = scanner.nextLine();
			name = input;
			// String nameJogger=Integer.parseInt(input);
			System.out.println(input + " how many days you jogged in a week? max 7 times a week");
			input = scanner.nextLine();
			daysNumber = Integer.parseInt(input);
			// System.out.println(daysNumber);
			System.out.println("enter amount of hours you ran each day");
			if (daysNumber <= 0 && daysNumber >= 8) {
				System.out.println("it's not a valid entry");
			}
			for (int i = 0; i < daysNumber; i++) {
				System.out.println("enter hours you ran for day number " + (i + 1));
				input = scanner.nextLine();
				hoursRan += Integer.parseInt(input);
				System.out.println("total amount of hours for the week is " + hoursRan);
				// hoursRan += hoursRan;

				toContinue = false;

			}
			// counting average
			float avg = hoursRan / daysNumber;
			System.out.println("your averagae time run is " + avg);
			if (hoursRan < 15) {
				System.out.println("your level is Amateur");
			} else if (hoursRan >= 15 && hoursRan <= 40) {
				System.out.println("your level is Efficient");
			} else if (hoursRan > 40) {
				System.out.println("your level is Exteme");
			}

		}
		System.out.println(name + ", thanks you for using the SQA Greeting Application!");

	}

}
