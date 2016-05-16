/**
* CollectionRandom2.java
*
* @version   $Id: CollectionRandom2.java,v_1.1 10/11/2014 21:32:00
*
* @author    ap8185 (Atir Petkar)
* @author    hhk9433 (Hrishikesh Karale)
*
* Revisions:
*      Initial revision
*/

import java.util.*;

//Requirement 2: Duplicate numbers are ignored; constant time performance for the basic operation;


public class CollectionRandom2 
{
 public static void main(String args[])
 {
  LinkedHashSet<Integer> al=new LinkedHashSet<Integer>();  
  Random generator = new Random();                        //to create a random number
  for (int i = 0 ; i < 1000 ; i++)
   al.add(generator.nextInt());                           //generate a number and add it to Treeset
  System.out.println(al);
  }
}