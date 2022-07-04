/**
 * This class demonstrates the use of conditional (if) statements
 * @author Jennifer Lau
 */
class Lab2Exercise6
{
	public static void main(String[] args)
	{
    int year = 2020;
    int month = 3;
    int days = 0;
    boolean leapYear = false;
    switch (month)
    {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        days = 31;
        System.out.print("Days in the month: " + days);
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        days = 30;
        System.out.print("Days in the month: " + days);
        break;
      case 2:
        if (year % 4 == 0) 
        {
          leapYear = true;
          if (year % 100 == 0)
          {
            leapYear = false;
            if (year % 400 == 0)
            {
              leapYear = true;
            }
          }
        }

        if (leapYear)
          days = 29;
        else
          days = 28;
        System.out.print("Days in the month: " + days);
        break;
      default:
        System.out.println("No such month");
        break;
    }
  }
}