
package teamC.h10;
import java.util.Arrays;
public class Quiz3 {
	
	public static void main(String[] args) 
	{
		String[] arrDier = new String[8];
		arrDier[0] = "Wolf ";
		arrDier[1] = "Leeuw ";
		arrDier[2] = "Luipaard ";
		arrDier[3] = "Olifant ";
		arrDier[4] = "Tijger ";
		arrDier[5] = "Beer ";
		arrDier[6] = "Zebra ";
		arrDier[7] = "Aap ";
		//zie de klasse "Arrays"
		Arrays.sort(arrDier);
		
		for(int i = 0; i < arrDier.length; i ++)
		{
			
				System.out.print(arrDier[i]);
			
		}
	}

}
