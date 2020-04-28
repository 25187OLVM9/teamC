package teamC._14_abstracte_klassen.qz04;

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
  bereken(int x, int y)
  {
    System.out.print("d" + x * y);
    
  }
}
