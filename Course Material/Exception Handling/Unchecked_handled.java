import java.util.Scanner;


public class Unchecked_handled {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArrayOfIntegers;
		int i;
		Scanner myScanner=new Scanner(System.in);
		System.out.println("Enter an integer:");
		i=myScanner.nextInt();
		try
		{
		myArrayOfIntegers = new int[i];
		for(i=0;i<myArrayOfIntegers.length;i++)
		{
			myArrayOfIntegers[i]=i;
		}
		for(i=0;i<myArrayOfIntegers.length;i++)
		{
			System.out.println(myArrayOfIntegers[i]);
		}
		}
		catch(NegativeArraySizeException e)
		{
			e.printStackTrace();
		}
		

	}

}
