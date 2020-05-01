package teamC._18_excepties.qz06;

 

public class MijnKlasse
{
  static String str = "";
  static void bereken(int x, int y)
  {
    str += "A";
    if (y == 0)
    {
      throw new ArrayIndexOutOfBoundsException();
    }
    int z = x / y;
    str += "B";
  }
  public static void main(String[] args)
  {
    try
    {
      str += "C";
      bereken(10, 0);
      str += "D";
    }
    catch (ArithmeticException e)
    {
      str += "E";
    }
    catch (ArrayIndexOutOfBoundsException ae)
    {
      str += "F";
    }
    System.out.println(str);
  }
}
 