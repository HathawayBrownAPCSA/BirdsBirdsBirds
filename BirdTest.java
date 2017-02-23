import java.util.List;
import java.util.ArrayList;

public class BirdTest
{
  private List<Bird> birdList;
  private static final int BIRD_TYPES = 10;
  
  public BirdTest ()
  {
    birdList = new ArrayList<Bird>();
  }
  
  //--------------------------------------------------------------------
  // Fills the birdList with n random Birds
  public void fillBirds (int n)
  {
    for (int i = 0; i < n; i++)
    {
      int b = (int)(Math.random() * BIRD_TYPES);
      switch (b){
        case 0: birdList.add(new Bird()); break;
        case 1: birdList.add(new Canary()); break;
        case 2: birdList.add(new Chickadee()); break;
        case 3: birdList.add(new Chicken()); break;
        case 4: birdList.add(new Cuckoo()); break;
        case 5: birdList.add(new Falcon()); break;
        case 6: birdList.add(new HarpyEagle()); break;
        case 7: birdList.add(new Ostrich()); break;
        case 8: birdList.add(new Parrot()); break;
        case 9: birdList.add(new Shrike()); break;
      }
    }
  }
  
  // Prints the birdList, each Bird on its own line.
  public void printBirds()
  {
    for (Bird b : birdList)
    {
      System.out.print (b.getName() + "\t");
      b.speak();
      System.out.print ("\t");
      b.eat();
      System.out.println();
    }
  }
  
  public static void main (String[] args)
  {
    BirdTest myBirds = new BirdTest();
    myBirds.fillBirds(5);
    myBirds.printBirds();
  }
}
        
    