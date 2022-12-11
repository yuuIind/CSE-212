// Fig. 13.6: UsingExceptions.java
// Demonstration of stack unwinding.

public class UsingExceptions
{
	
	public static void main( String args[] )
	{
		
		try // call throwException to demonstrate stack unwinding
		{
			throwException();
			
		} // end try
		catch ( Exception exception ) // exception thrown in throwException
		{
			System.err.println( "Exception handled in main" );
		}
	}
	// throwException throws exception that is not caught in this method
	public static void throwException() throws Exception
	{
		int i=10;
		try // throw an exception and catch it in main
		{
			System.out.println( "Method throwException" );
			throw new Exception(); // generate exception
		}
		catch ( Exception runtimeException )
		//catch ( RuntimeException runtimeException ) 
		{
			System.err.println("Exception handled in method throwException" );
		}finally // finally block always executes
		{
				
				i=20;
				System.out.println("i is "+i);
				
		}
		
		}
	}