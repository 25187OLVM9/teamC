package teamC.bopdrachten;

public class Tabel {

	public void arraymethode() 
	{
		int e = 1;
		int[] arrayInt = new int[10000];
		
		for(int i = 0; i < arrayInt.length; i ++)
		{
			arrayInt[i] = e;
			System.out.print(arrayInt[i] + " | ");
			 e ++;
			 
			 if( e == 1001 || e == 2001 || e == 3001 || e ==4001 || e ==5001 || e == 6001 || e == 7001 || e == 8001 || e == 9001)
			 {
				System.out.println("") ;
			 }
			 
			 
		}
	}

	public static void main(String[] args) {
		Tabel ar = new Tabel();

		ar.arraymethode();

	}

}













