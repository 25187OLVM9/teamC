package teamC._18_excepties.qz02;
 
public class MijnKlasse
{
  public void methode()
  {
    try
    {
      int[] intArray = new int[5];
      int z = intArray[6];
      System.out.print("w");
    }
    catch (ArithmeticException e)
    {
      System.out.print("x");
    }
    catch (ArrayIndexOutOfBoundsException e)
    {
      System.out.print("y");
    }
    
  }
  public static void main(String[] args)
  {
    MijnKlasse mk = new MijnKlasse();
    mk.methode();
  }
}