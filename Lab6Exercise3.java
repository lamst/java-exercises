import javax.lang.model.util.ElementScanner14;

/*
 * @author Jennifer Lau
 */
class Lab6Exercise3
{
  public static void main (String[] args)
  {
    // Use the function below
    int result = getFactorial(-2);

    // Print result
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
      // Multiply answer by current integer
      result *= i;
    }

    if (n >= 0)
      return result;
    else
      return -1;
  }
}
