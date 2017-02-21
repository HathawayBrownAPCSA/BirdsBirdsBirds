public class Canary extends Bird
{
  public Canary ()
  {
    super();
    setName("Canary");
  }
  
  public void eat ()
  {
    super.eat();
    System.out.print (", Fruits, and Vegetable.");
  }
  
  public void speak()
  {
    System.out.print("Chirpity Chirp Chirp Chirp");
  }
  
  public String getName()
  {
    return name;
  }
  
  public String setName (String s)
  {
    name = s;
    return name;
  }
}
                      