package teamC.h10;
import java.util.Arrays;
public class Quiz4 {

	public static void main(String[] args) {
		char[] arrCharA = new char[4];
		arrCharA[0] = 'g';
		arrCharA[1] = 'h';
		arrCharA[2] = 'e';
		arrCharA[3] = 'f';
		
		
		int[] arrayInt = new int[5];
		arrayInt[0] = 3;
		arrayInt[1] = 4;
		arrayInt[2] = 2;
		arrayInt[3] = 7;
		arrayInt[4] = 9;
		
		for(int i = 0; i < arrayInt.length; i ++)
		{
			
				System.out.print(arrayInt[i]);
			
		}
		
		char[] arrCharB = Arrays.copyOf(arrCharA,arrCharA.length);
		Arrays.sort(arrCharA);
		
		System.out.print(arrCharA[2]);
		System.out.print(arrCharB[3]);
		
	}

}
