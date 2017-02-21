public class Falcon extends Bird
{
  public Falcon ()
  {
    super(); 
    setName("Falcon"); 
  }
  
  public void eat ()
  {
    super.eat(); 
    System.out.print("? Never. More like rodents, repitiles, and other birds"); 
  }
  
  public void speak ()
  {
    System.out.print("Caw! Screech!"); 
  }
}