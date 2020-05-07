package _14_abstracte_klassen.qz01;

public class MijnKlasse extends MijnAbstract
{
  int bereken()
  {
    return x + 5;
  }
  int bereken(int x)
  {
    return super.x + x;
  }
  void printNaam(String naam)
  {
    System.out.print("Naam: " + naam);
  }
  public static void main(String[] args)
  {
    MijnKlasse mk = new MijnKlasse();
    System.out.println(mk.bereken(4));
    mk.printNaam("Emma");
  }
}
