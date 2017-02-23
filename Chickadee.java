public class Chickadee extends Bird
{
  public Chickadee () 
  {
    super();
    setName("Chickadee");
  }
  
  public void eat ()
  {
    super.eat();
    System.out.print (" and Suet");
  }
  
  public void speak ()
  {
    System.out.print ("Chick-a-dee-dee-dee!");
  }
}