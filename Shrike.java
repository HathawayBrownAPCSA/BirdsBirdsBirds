public class Shrike extends Bird
{
  public Shrike
  {
    super(); 
    setName("Shrike");
  }
  
  public void eat()
  {
    super.eat(); 
    System.out.print(" are not enough to sate this cold-blooded killer." +
                     "Prefers small mammals and birds, after impaling them on thorns and barbed wire."); 
  }
 
  public void speak()
  {
    System.out.print("Aak-aak! Beek!");
  }
}
