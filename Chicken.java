public class Chicken extends Bird
{
 public Chicken()
 {
   super();
   setName("Chicken");
 }
 
 public void eat()
 {
  super.eat();
  System.out.print(" and corn");
 }
 
 public void speak()
 {
  System.out.print("Cock-a-doodle-doo!"); 
 }
}