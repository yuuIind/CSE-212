

import java.lang.reflect.Method;

public class Checked_withException
{

  public Checked_withException()
  {
    Class c;
    try
    {
      c = Class.forName("java.lang.String");
      
      try
      {
        Class[] paramTypes = new Class[5];        
        Method m = c.getDeclaredMethod("fooMethod", paramTypes);
        
      }      
      catch (NoSuchMethodException e)
      {
        e.printStackTrace();
      }
    }
    catch (ClassNotFoundException e)
    {
      // deal with the exception here ...
      e.printStackTrace();
    }
  }

  public static void main(String[] args)
  {
    new Checked_withException();
  }

}