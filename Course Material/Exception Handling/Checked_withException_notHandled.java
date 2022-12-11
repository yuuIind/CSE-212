

import java.lang.reflect.Method;

public class Checked_withException_notHandled
{

  public Checked_withException_notHandled()  {
    Class c;
    try
    {
      c = Class.forName("java.lang.String");
      
      
        Class[] paramTypes = new Class[5];        
        Method m = c.getDeclaredMethod("fooMethod", paramTypes);
        
           
     
    }
    catch (ClassNotFoundException e)
    {
      // deal with the exception here ...
      e.printStackTrace();
    }
  }

  public static void main(String[] args)
  {
    new Checked_withException_notHandled();
  }

}