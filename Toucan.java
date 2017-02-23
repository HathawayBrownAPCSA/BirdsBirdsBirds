public class Toucan extends Bird
{
  public Toucan ()
  {
    super();
    setName ("Toucan");
  }
  
  public void eat ()
  {
    super.eat();
    System.out.print (" and lizards");
  }
  
  public void speak ()
  {
    System.out.print ("Croak Croak Croak");
  }
}
  
    