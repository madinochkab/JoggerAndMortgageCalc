/**
 *   File Name: mortgage.java<br>
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
 * mortgage //ADDD (description of class)
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
public class mortgage {
	static String input = null;
	static float interestRate;
	static String name;
	static int propertyID;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Whats you name?");
		input = scanner.nextLine();
		name = input;
		boolean toContinue = true;
		while (toContinue) {
			System.out.println(name + ", can you please enter property id number");
			input = scanner.nextLine();
			propertyID = Integer.parseInt(input);

			System.out.println(name + ", can you please enter property price");
			input = scanner.nextLine();
			float propertyPrice = Float.parseFloat(input);

			System.out.println(name + ", can you enter interest amount? (3.75)");
			input = scanner.nextLine();
			interestRate = Float.parseFloat(input);

			System.out.println(name + ", can you enter term amount in months? (360)");
			input = scanner.nextLine();
			int monthsTerm = Integer.parseInt(input);

			System.out.println("looks like house ID is" + propertyID + " \nand the price is " + propertyPrice
					+ "\n and interest rate =" + interestRate + "\n amount of months" + monthsTerm);

			double monthlyPayment = (propertyPrice * interestRate) / (1 - Math.pow(1 + interestRate, -monthsTerm));
			System.out.println("monthly payment is " + monthlyPayment);

			System.out.println("would you like to calculate another house?(Y/Yes or N/No):");
			input = scanner.nextLine();
			if (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("No")) {
				System.out.println("bye " + name);
				toContinue = false;

			}

		}

	}

}
