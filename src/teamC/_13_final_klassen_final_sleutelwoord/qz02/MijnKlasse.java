package teamC._13_final_klassen_final_sleutelwoord.qz02;

public class MijnKlasse extends Superklasse
{
	int z = 5;	
	
	void mijnMethode(int x)
	{
		System.out.print("x");
	}
	public static void main(String[] args)
	{
		MijnKlasse mk = new MijnKlasse();
	}
}
//We kunnen geen nieuwe methode methodeB toevoegen, ivm de final in de superklasse