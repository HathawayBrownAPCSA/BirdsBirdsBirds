public class Cuckoo extends Bird
{
  public Cuckoo ()
  {
    super();
    setName("Cuckoo");
  }
  
  public void eat ()
  {
    super.eat();
    System.out.print(" and caterpillars");
  }
  
  public void speak ()
  {
    System.out.print(" Cuckoo...cuckoo...cuckoo...");
  }
}  
  
      