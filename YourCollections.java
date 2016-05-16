/**
* YourCollections.java
*
* @version   $Id: YourCollections.java,v_1.1 10/12/2014 23:32:00
*
* @author    hhk9433 (Hrishikesh Karale)
* @author    ap8185 (Atir Petkar)
*
* Revisions:
*      Initial revision
*/

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;

/**
 * This Program adds elements to a list and then sorts them using bubble sort
 * and shuffles them.
 */

public class YourCollections
{
	
	/**
	 * the shuffle(), shuffles the elements using randomly swapping elements 
	 * @param a
	 */
	private void shuffle(Object a[])
	{
		//object of our collection class
		YourCollections class_object = new YourCollections();
		
		//an object of random class is initialized
		Random random = new Random();
	
		/*generates a random number between the length of array and then calls
		 * swap method to swap the random method 
		 */
		for (int i = 0; i < a.length; i++)
		{
			int change = i + random.nextInt(a.length - i);
			class_object.swap(a, i, change);
		}
	}
	
	/**
	 * this is a sorting algorithm which takes an Integer array and then sorts
	 * it using bubble sort algorithm.
	 * @param arr
	 */
	private void bubbleSort(Integer arr[])
	{
		//to check if a swap has been made
		boolean swapped = true;
		
		//counter to decrease swapping limit of array
	    int j = 0;
	    
	    //temporarily stores an integer to be swapped 
	    Integer tmp;
	    
	    /*
	     *while loop checks if an element is swapped  and then the element 
	     *with highest value is swapped with next value so that it can be 
	     *pulled to the last position. 
	     */
	    while (swapped)
	    {
	    	swapped = false;
	    	j++;
	    	for (int i = 0; i < arr.length - j; i++)
	    	{                                       
	    		if (arr[i] > arr[i + 1])
	    		{                          
	    			tmp = arr[i];
	    			arr[i] = arr[i + 1];
	    			arr[i + 1] = tmp;
	    			swapped = true;
	    		}
	    	}                
	    }
	}

	/**
	 * this is a sorting algorithm which takes an String array and then sorts
	 * it using bubble sort algorithm.
	 * @param x
	 */
	private void bubbleSort(String x[])
	{
		//counter to access index position of aray
		int j;
		
		//will determine when the sort is finished
		boolean flag = true;
		
		//to store String for swapping temporarily
		String temp;
		
		while ( flag )
		{
			flag = false;
			
			for ( j = 0;  j < x.length - 1;  j++ )
			{
				/*
				 * compareTo method is used to compare two strings where ascending
				 *order is used to sort and its case sensitive
				 */
				if ( x [ j ].compareTo( x [ j+1 ] ) > 0 )
				{
					temp = x [ j ];
					x [ j ] = x [ j+1];
					x [ j+1] = temp; 
					flag = true;
				} 
			} 
		}
	}
	
	/**
	 * this method takes in an object array and two int values which are
	 * positions of the elements that are to be changed. it then swaps the elements
	 * 
	 * @param a
	 * @param i
	 * @param change
	 */
	private void swap(Object a[], int i, int change)
	{
		Object helper = a[i];
		a[i] = a[change];
		a[change]= helper;
	}

	/**
	 * this main method of class initializes the arraylist and linkedlist which 
	 * are then used to display the efficiency of our bubbleSort() and shuffle()
	 * and displays the shuffled and sorted lists.In our program the arraylist stores Integers
	 * and LinkedList stores Strings as their types.
	 * @param args
	 */
	public static void main(String[] args)
	{
		//class object is initialized
		YourCollections class_object = new YourCollections();
		
		//Arraylist is created of Integers
		List<Integer> array_list_example = new ArrayList<Integer>();
		
		//LinkedList of Strings is created
		List<String> linked_list_example = new LinkedList<String>();
		
		//Integers are added in the arraylist
		array_list_example.add(11);
		array_list_example.add(2);
		array_list_example.add(33);
		array_list_example.add(4);
		array_list_example.add(5);
		array_list_example.add(16);
		array_list_example.add(7);
		array_list_example.add(80);
		array_list_example.add(9);
		array_list_example.add(10);
		array_list_example.add(1);
		
		System.out.print("Original Array: ");
		System.out.println(array_list_example);
		Integer array [] = new Integer[array_list_example.size()];
		
		//elements of arraylist are copied in an array
		array = array_list_example.toArray(array);
		
		//method call to shuffle is made
		class_object.shuffle(array);
		
		array_list_example.clear();
		
		//elements of array are added to the arraylist using aslist()
		array_list_example.addAll(Arrays.asList(array));
	
		System.out.print("Shuffled Array: ");
		System.out.println(array_list_example);
		
		// bubblesort() is called passing array as parameter
		class_object.bubbleSort(array);
		
		array_list_example.clear();
		array_list_example.addAll(Arrays.asList(array));
		System.out.print("Sorted Array: ");
		System.out.println(array_list_example);
		
		//Strings are added in the Linkedlist
		linked_list_example.add("A");
		linked_list_example.add("a");
		linked_list_example.add("bit");
		linked_list_example.add("AcuTe");
		linked_list_example.add("acUtE");
		linked_list_example.add("acuTE");
		linked_list_example.add("Zeebra");
		linked_list_example.add("d");
		linked_list_example.add("bIt");
		linked_list_example.add("BIT");
		linked_list_example.add("CUT");
		linked_list_example.add("CUt");
		linked_list_example.add("zUt");
		linked_list_example.add("123");
		
		System.out.print("\nARRAY1: ");
		System.out.println(linked_list_example);
		String array1[] = new String[linked_list_example.size()];
		array1 = linked_list_example.toArray(array1);
		
		//method call to shuffle() is made passing new array1 as parameter
		class_object.shuffle(array1);
		
		linked_list_example.clear();
		linked_list_example.addAll(Arrays.asList(array1));
		System.out.print("Shuffled Array1: ");
		System.out.println(linked_list_example);
		
		//method call to bubbleSort() is made passing new array1 as parameter
		class_object.bubbleSort(array1);
		
		linked_list_example.clear();
		linked_list_example.addAll(Arrays.asList(array1));
		System.out.print("Sorted Array1: ");
		System.out.println(linked_list_example);
		
	}
} 