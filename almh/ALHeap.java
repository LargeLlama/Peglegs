/*****************************************************
* Peglegs - Daniel Gelfand, Rubin Peci, Bo Lu
* APCS2 pd2
* HW#49 Sink || Swim
* 2018-05-16 W
* class ALHeap
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
    _heap = new ArrayList<Integer>();
  }



  /*****************************************************
  * toString()  ---  overrides inherited method
  * Returns either
  * a) a level-order traversal of the tree (simple version)
  * b) ASCII representation of the tree (more complicated, more fun)
  *****************************************************/
  public String toString()
  {
    return _heap.toString();
  }//O(1)


  /*****************************************************
  * boolean isEmpty()
  * Returns true if no meaningful elements in heap, false otherwise
  *****************************************************/
  public boolean isEmpty()
  {
    return _heap.isEmpty();
  }//O(1)


  /*****************************************************
  * Integer peekMin()
  * Returns min value in heap
  * Postcondition: Heap remains unchanged.
  *****************************************************/
  public Integer peekMin()
  {
    if(!_heap.isEmpty()){
      return _heap.get(0);
    }
    else{
      return null;
    }
  }//O(1)

  /*
  Adding to a Heap

  1) Insert a new element to the end of the array representing a binary tree.
  2) While the heap's property is broken, swap element with parent.
  3) Repeat step 2 till heap property is fulfilled.

  */


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
    _heap.add(addVal);

    int addPos = _heap.size() - 1;
    int parentPos = (addPos-1) / 2;

    while(addVal.compareTo(_heap.get(parentPos)) < 0){
      swap(addPos,parentPos);
      //update position of added val
      addPos = parentPos;
      parentPos = (addPos-1) / 2;
    }


  }//O(logn)

  /*
  Removing from a Heap

  1) Replace root of heap with last element of the array
  2) Compare the new root with children. If the children are in correct order then stop.
  3) Otherwise, swap with one of children and go back to step 2.
  - for a min heap swap with the smaller child
  - for a max heap swap with larger child
  */



  /*****************************************************
  * removeMin()  ---  means of removing an element from heap
  * Removes and returns least element in heap.
  * Postcondition: Tree maintains heap property.
  *****************************************************/
  public Integer removeMin()
  {

    if ( _heap.size() == 0 )
    return null;


    //store root value  to return
    Integer retVal = peekMin();




    //swap last (rightmost, deepest) leaf with root
    swap( 0, _heap.size() - 1 );

    //value now at root
    Integer posVal = _heap.get( _heap.size() - 1);

    _heap.remove( _heap.size() - 1);


    //walk root node to proper position
    int pos = 0;
    int minChildPos;


    while( pos < _heap.size() ) {


      //choose child with min value... if there are children
      minChildPos = minChildPos(pos);


      //if no children
      if ( minChildPos == -1 ){
        break;
      }
      //if greater than child stop to not violate heap property
      else if ( posVal.compareTo( _heap.get(minChildPos) ) <= 0 ){
        break;
      }
      //if greater than the min child then swap with that child
      else {
        swap( pos, minChildPos );
        //update pos
        pos = minChildPos;
      }
    }
    //return value removed at the beginning
    return retVal;
  }//O(logn)


  /*****************************************************
  * minChildPos(int)  ---  helper fxn for removeMin()
  * Returns index of least child, or
  * -1 if no children, or if input pos is not in ArrayList
  * Postcondition: Tree unchanged
  *****************************************************/
  private int minChildPos( int pos )
  {
    int childPosLeft = (pos * 2) + 1;
    int childPosRight = (pos * 2) + 2;

    //check if within heap bounds
    if(pos < 0 || pos >= _heap.size() || childPosLeft >= _heap.size()){
      return -1;
    }
    //no right child
    else if(childPosRight >= _heap.size()){
      return childPosLeft;
    }

    //pick smaller child
    else{
      if(_heap.get(childPosLeft).compareTo(_heap.get(childPosRight)) < 0){
        return childPosLeft;
      }
      else{
        return childPosRight;
      }
    }
  }//O(1)


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
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class ALHeap
