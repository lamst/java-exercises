/**
 * This class demonstrates the use of conditional (if) statements
 * @author Jennifer Lau
 */
class Lab2Exercise5
{
	public static void main(String[] args)
	{
    int value = 30;
    int remainderFromDividingBy2 = value % 2;
    int remainderFromDividingBy3 = value % 3;

    if (remainderFromDividingBy2 == 0 && remainderFromDividingBy3 == 0)
      System.out.println("Value is divisible by 2 and 3");
    else if (remainderFromDividingBy2 == 0 && remainderFromDividingBy3 != 0)
      System.out.println("Value is only divisible by 2");
    else if (remainderFromDividingBy2 != 0 && remainderFromDividingBy3 == 0)
      System.out.println("Value is only divisible by 3");
    else
      System.out.println("Value is not divisible by either 2 or 3");
  }
}