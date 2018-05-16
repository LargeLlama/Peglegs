/*****************************************************
 * class ALHeap
 * SKELETON
 * Implements a min heap using an ArrayList as underlying container
 *****************************************************/

import java.util.ArrayList;

public class ALHeap
{

  //instance vars
  private ArrayList<Integer> _heap; 

  /*****************************************************
   * default constructor  ---  inits empty heap
   *****************************************************/
  public ALHeap() 
  { 
  }



  /*****************************************************
   * toString()  ---  overrides inherited method
   * Returns either 
   * a) a level-order traversal of the tree (simple version)
   * b) ASCII representation of the tree (more complicated, more fun)
   *****************************************************/
  public String toString() 
  { 
  }//O(?)


  /*****************************************************
   * boolean isEmpty()
   * Returns true if no meaningful elements in heap, false otherwise
   *****************************************************/
  public boolean isEmpty()
  { 
  }//O(?)


  /*****************************************************
   * Integer peekMin()
   * Returns min value in heap
   * Postcondition: Heap remains unchanged.
   *****************************************************/
  public Integer peekMin()
  { 
  }//O(?)


/*
Adding to a Heap

1) Insert a new element to the end of the array representing a binary tree.
2) While the heap's property is broken, swap element with parent.
3) Repeat step 2 till heap property is fulfilled.

Removing from a Heap

1) Replace root of heap with last element of the array
2) Compare the new root with children. If the children are in correct order then stop.
3) Otherwise, swap with one of children and go back to step 2.
  - for a min heap swap with the smaller child
  - for a max heap swap with larger child
*/
	
	
	
  /*****************************************************
   * add(Integer) 
   * Inserts an element in the heap
   * Postcondition: Tree exhibits heap property.
   *****************************************************/
  public void add( Integer addVal )
  { 
  }//O(?)


  /*****************************************************
   * removeMin()  ---  means of removing an element from heap
   * Removes and returns least element in heap.
   * Postcondition: Tree maintains heap property.
   *****************************************************/
  public Integer removeMin()
  { 
  }//O(?)


  /*****************************************************
   * minChildPos(int)  ---  helper fxn for removeMin()
   * Returns index of least child, or 
   * -1 if no children, or if input pos is not in ArrayList
   * Postcondition: Tree unchanged
   *****************************************************/
  private int minChildPos( int pos )
  { 
  }//O(?)
  

  //************ aux helper fxns ***************
  private Integer minOf( Integer a, Integer b )
  {
    if ( a.compareTo(b) < 0 )
	    return a;
    else
	    return b;
  }

  //swap for an ArrayList
  private void swap( int pos1, int pos2 )
  {
    _heap.set( pos1, _heap.set( pos2, _heap.get(pos1) ) );	
  }
  //********************************************



  //main method for testing
  public static void main( String[] args )
  {
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ALHeap pile = new ALHeap();

      pile.add(2);
      System.out.println(pile);
      pile.add(4);
      System.out.println(pile);
      pile.add(6);
      System.out.println(pile);
      pile.add(8);
      System.out.println(pile);
      pile.add(10);
      System.out.println(pile);
      pile.add(1);
      System.out.println(pile);
      pile.add(3);
      System.out.println(pile);
      pile.add(5);
      System.out.println(pile);
      pile.add(7);
      System.out.println(pile);
      pile.add(9);
      System.out.println(pile);

      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class ALHeap
