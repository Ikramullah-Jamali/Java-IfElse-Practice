
class CheckThreeValuesNestedIfElse
{
    public static void main(String [] args)
    {
      int a=30,b=10,c=20;
      if (a > b)
      {
        if (a > c)
        {
          System.out.println("a is greater");
        }
        else
        {
          System.out.println("c is greater");
        }
      }
      else
      {
        if (b > c)
        {
          System.out.println("b is greater");
        }
        else
        {
          System.out.println("c is greater");
        }
      }
        
    }
}