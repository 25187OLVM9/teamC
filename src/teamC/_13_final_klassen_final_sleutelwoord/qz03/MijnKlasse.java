package teamC._13_final_klassen_final_sleutelwoord.qz03;

public class MijnKlasse extends Superklasse
{
	int x = 3;
	String methodeA(String s, int i)
	{
		String str = s + ", " + i;
		//super.x ++; 
		//gebeurt niks mee, want de int x in superklasse is al een final
		return str;
	}
	public static void main(String[] args)
	{
		MijnKlasse mk = new MijnKlasse();
		System.out.print(mk.methodeA(23, "Emma"));
	}
}
