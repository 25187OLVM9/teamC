package teamC._16_conversie.qz01;

public class MijnKlasse
{
  public static void main(String[] args)
  {
    int i1 = 127;
    int i2 = 134;
    int mijnInt = i1 + i2;
    short mijnShort = i1;
    byte b1 = (byte) i1;
    byte b2 = (byte) i2;
    System.out.print(b1 + ", ");
    System.out.print(b2);
    System.out.print(mijnInt);
    //5: foutcode komt eruit
  }
}