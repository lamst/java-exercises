/**
 * This class demonstrates the use of conditional (if) statements
 * @author
 */
class Lab2Exercise3
{
	public static void main(String[] args)
	{
		// The marks that you score in SEHS2307
		int marks = 0;

		// Print out a special message for full marks
		if (marks == 100)
		{
			System.out.println("Full marks! Wow! Amazing!");
			System.out.println("You deserve a medal for scoring full marks!");
		}
			
		// Print out a message depending on what mark you get;
		// please note that the conversions below from mark to GPA are not 100% real,
		// we are just printing messages for fun, but we will assume these are the conversions
		if (marks >= 90)
			System.out.println("GPA 4.5");
		else if (marks >= 80)
			System.out.println("GPA 4.0");
		else if (marks >= 70)
			System.out.println("GPA 3.5");
		else if (marks >= 60)
			System.out.println("GPA 3.0");
		else if (marks >= 50)
			System.out.println("GPA 2.0");
		else
			System.out.println("GPA 1.0");
	}
}