package teamC._14_abstracte_klassen.qz04jwr;

public class MijnKlasseA extends MijnKlasseB
{
  MijnKlasseA()
  {
    System.out.print("b");
  }
  MijnKlasseA(int i)
  {
    System.out.print("d" + i);
  }
  public int bereken(int x, int y)
  {
    return x * y;
  }
}
