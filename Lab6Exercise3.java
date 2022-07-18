import javax.lang.model.util.ElementScanner14;

/**
 * Calculates the factorial of an integer. We know that n! = n * (n-1)!. Therefore
 * we might also say (n - 1)! = n!/n. Hence, 1! = 2!/2 = 1. Similiarly, 0! = 1! / 1 = 1
 * However, (-1)! means 0! / 0 = 1 / 0 which is undefined. 
 * 
 * With this, the method getFactorial will return the factorial of an integer. It will 
 * return -1 if the parameter passed to the getFactorial method is negative. In the main
 * method, we check the return value from the getFactorial method. If the returned value
 * is positive, the result is printed on the screen. Alternatively, if the returned value
 * was negative, "undefined" is printed.
 * 
 * @author Jennifer Lau
 */
class Lab6Exercise3
{
  public static void main (String[] args)
  {
    // Use the getFactorial method to calculate the factorial of an integer
    int result = getFactorial(1);

    // Print the result
    if (result > 0)
      System.out.println(result);
    else
      System.out.println("undefined");
  }

  /**
   * Returns the factorial of an integer
   * @param n the integer to calculate the factorial
   * @return the factorial of the given integer if the integer was 0 or positive; -1 otherwise
   */
  public static int getFactorial(int n)
  {
    // This accumulate the answer as we multiply
    int result = 1;

    // Go through all integers, from 1 to n inclusive
    for (int i = 1; i<= n; i++)
    {
      // Multiply answer by the current integer
      result *= i;
    }

    // Determine whether the integer to calculate the factorial 
    // is positive, return -1 to indicate the factorial cannot
    // be calculated if the integer is negative
    if (n >= 0)
      return result;
    else
      return -1;
  }
}
