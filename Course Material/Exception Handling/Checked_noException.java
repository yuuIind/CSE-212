

import java.lang.reflect.Method;

public class Checked_noException
{

  public Checked_noException()
  {
    Class c;
    try
    {
      c = Class.forName("java.lang.String");
      
      try
      {
        //Class[] paramTypes = new Class[5];
        Class[] paramTypes = {String.class};
        Method m = c.getDeclaredMethod("compareTo", paramTypes);
        System.out.println("Method name is "+m);
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
    new Checked_noException();
  }

}