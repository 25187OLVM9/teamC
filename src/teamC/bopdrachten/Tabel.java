package teamC.bopdrachten;

public class Tabel {

	public void arraymethode() 
	{
		int e = 1;
		int a = 1;
		int[] arrayInt = new int[10000];
		
		System.out.print(a + ":" + "\n");
		a ++;

		for(int i = 0; i < arrayInt.length; i ++)
		{
			arrayInt[i] = e;
			
			if (e >= 1 && e < 10) {
				System.out.print("   ");
			}
			
			if (e >=10 && e < 100)
			{
				System.out.print("  ");
			}
			
			if (e >=100 && e <= 999)
			{
				System.out.print(" ");
			}

			if (e == 10000)
			{
				System.out.print(arrayInt[i] + "| ");
			}
			else  
			{
			System.out.print(arrayInt[i] + " | ");
			}


			e ++;


			if( e == 1001 || e == 2001 || e == 3001 || e ==4001 || e ==5001 || e == 6001 || e == 7001 || e == 8001 || e == 9001)
			{
				
				System.out.println( "\n" + a + ": ") ;
				a ++;
			}


		}
	}

	public static void main(String[] args) {
		Tabel ar = new Tabel();

		ar.arraymethode();

	}

}













