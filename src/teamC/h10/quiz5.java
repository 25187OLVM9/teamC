package teamC.h10;
import java.util.Arrays;
public class quiz5 {

	  public static void main(String[] args)
	  {
	    char[] arrCharA = new char[4];
	    arrCharA[0] = 'w';
	    arrCharA[1] = 'k';
	    arrCharA[2] = 'd';
	    arrCharA[3] = 'r';
	    
	    char[] arrayChar = new char[8];
	    arrayChar[0] = 'R';
	    arrayChar[1] = 'N';
	    arrayChar[2] = 'B';
	    arrayChar[3] = 'S';
	    arrayChar[4] = 'M';
	    arrayChar[5] = 'O';
	    arrayChar[6] = 'A';
	    arrayChar[7] = 'C';
	    
	    Arrays.sort(arrayChar);
	    
	    for(int i = 0; i < arrayChar.length; i ++)
		{
			
				System.out.print(arrayChar[i]);
			
		}
	    
	   // char[] arrCharB = Arrays.copyOf(arrCharA, arrCharA.length);
	    // de index van het element 'k'
	  //  int i = Arrays.binarySearch(arrCharA, 'k');
	    // controleert of de twee arrays gelijk zijn
	  //  boolean b = Arrays.equals(arrCharA, arrayChar);
	  //  System.out.print(i + " " + b);
	  }
	}

