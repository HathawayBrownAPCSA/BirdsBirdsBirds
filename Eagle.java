public class Eagle extends Bird
{
  public Eagle ()
  {
    super();
    setName ("Eagle");
  }
  
  public void eat ()
  {
    super.eat();
    System.out.print (" and fish");
  }
  
  public void speak ()
  {
    System.out.print ("kuk-kuk-kuk");
  }
}
  
    