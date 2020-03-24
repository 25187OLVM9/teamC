package teamC.bopdrachten;

public class Tabel {

	public void arraymethode() 
	{
		int e = 1;
		int[] arrayInt = new int[2000];
		
		for(int i = 0; i < arrayInt.length; i ++)
		{
			arrayInt[i] = e;
			System.out.print(arrayInt[i] + " | ");
			 e ++;
			 
			 if( e == 1001)
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













