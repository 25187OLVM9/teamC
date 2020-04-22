package teamC._11_statische_leden.qz03;

public class MijnKlasse
{
  static int x = 6;
  static int y = 3;
  MijnKlasse()
  {
    x += 3;
    y += 2;
  }
  void mijnMethode(int i)
  {
    this.y = y - i;
    x++;
  }
  public static void main(String[] args)
  {
    MijnKlasse mk1 = new MijnKlasse();
    MijnKlasse mk2 = new MijnKlasse();
    MijnKlasse mk3 = new MijnKlasse();
    MijnKlasse mk4 = new MijnKlasse();
    MijnKlasse mk5 = new MijnKlasse();
    MijnKlasse mk6 = new MijnKlasse();    
    MijnKlasse mk7 = new MijnKlasse();
    MijnKlasse mk8 = new MijnKlasse();
    
    mk1.mijnMethode(3);
    System.out.print(mk2.x + ", " + mk1.y);
  }
}
