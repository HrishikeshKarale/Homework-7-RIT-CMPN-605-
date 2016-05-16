/**
* CollectionRandom3.java
*
* @version   $Id: CollectionRandom3.java,v_1.1 10/11/2014 13:32:00
*
* @author    ap8185 (Atir Petkar)
* @author    hhk9433 (Hrishikesh Karale)
*
* Revisions:
*      Initial revision
*/

import java.util.*;
//hw 7.2
//Requirement 3: Duplicate numbers are not ignored; constant time performance for the basic operation;

public class CollectionRandom3 
{
 public static void main(String args[])
 { 
  HashMap<Integer,Integer> al=new HashMap<Integer,Integer>();  
  Random generator = new Random();
  for (int i = 0 ; i < 1000 ; i++)
   al.put(i,generator.nextInt()); 
  System.out.println(al);
 }
}