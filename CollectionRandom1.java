/**
* CollectionRandom1.java
*
* @version   $Id: CollectionRandom1.java,v_1.1 10/11/2014 23:32:00
*
* @author    ap8185 (Atir Petkar)
* @author    hhk9433 (Hrishikesh Karale)
*
* Revisions:
*      Initial revision
*/
import java.util.*;

//Requirement 1: Duplicate numbers are ignored; the elements are ordered using
//their natural ordering, the first is < than the second, etc;

public class CollectionRandom1 
{	
 public static void main(String args[])
 {
  TreeSet<Integer> al=new TreeSet<Integer>();  
  Random generator = new Random();           //to create a random number
  for (int i = 0 ; i < 1000 ; i++)
   al.add(generator.nextInt());              //generate a number and add it to Treeset
  System.out.println(al);                    //print it
  }
}
