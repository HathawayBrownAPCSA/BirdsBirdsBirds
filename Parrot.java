public class Parrot extends Bird
{
  public Parrot()
  {
    super();
    setName("Parrot");
  }
  
  public void eat()
  {
    super.eat();
    System.out.print(" and Crackers");
  }
  
  public void speak()
  {
    System.out.print("Polly wants a cracker!!");
  }
  
  public String getName()
  {
    return name;
  }
  
  public String setName(String s)
  {
    s = name;
    return name;
  }
}