package teamC._14_abstracte_klassen.qz02;

public class Subklasse extends Superklasse
{
  Subklasse()
  {
	  super(10);
    System.out.print("p");
  }
  public static void main(String[] args)
  {
    new Subklasse().printLetter('s');
  }
}
