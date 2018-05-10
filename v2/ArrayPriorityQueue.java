//Peglegs - Rubin P., Bo Lu, Daniel Gelfand
//APC2 pd2
//Lab03
//let's get that chip

import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue{

  private ArrayList<String> _queue;

  public ArrayPriorityQueue(){
    _queue = new ArrayList<String>();
  }


  //Adds an item to this priority queue.
  //O(1) - amortized constant time
  public void add(String s){
    _queue.add(s);
  }

  //Returns true if this stack is empty, otherwise returns false.
  //O(1)
  public boolean isEmpty(){
    return _queue.isEmpty();
  }

  //Returns the smallest item stored in this priority queue without removing it.
  //O(n)
  public String peekMin(){
    if (this.isEmpty())
        return null;

    //find the smallest item in the queue
    String min = _queue.get(0);
    for (String s : _queue) {
        if (min.compareTo(s) > 0)
            min = s;
    }

    return min;
  }

  //Removes and returns the smallest item stored in this priority queue.
  //O(n)
  public String removeMin(){
    String min = peekMin();
    if (!this.isEmpty()) {
        _queue.remove( min ) ;
        return min; 
    }
    return null;
  }

  public String toString(){
    return _queue.toString();
  }

  public static void main(String[] args){

    ArrayPriorityQueue bob = new ArrayPriorityQueue();
    bob.add("foo");
    bob.add("moo");

    System.out.println("Current Priority Queue: " + bob);

    System.out.println("Min: "  + bob.peekMin());
    bob.removeMin();
    System.out.println("Priority Queue After dequeue: " + bob); //[moo]

    bob.add("goo");
    bob.add("hoo");
    bob.add("doo");

    System.out.println("Current Priority Queue: " + bob);

    System.out.println("FINDING MIN... "  + bob.peekMin());
    bob.removeMin();
    System.out.println("Priority Queue After dequeue: " + bob + "\n\n");

    System.out.println("TESTING MEME");
    ArrayPriorityQueue meme = new ArrayPriorityQueue(); //new priority queue
    //add some strings
    meme.add("yurd");
    meme.add("also yurd");
    meme.add("yet another yurd");
    meme.add("one last yurd");
    //print it
    System.out.println(meme);
    //as long as it's not empty, keep removing and printing the removed value
    while(!meme.isEmpty())
        System.out.println(meme.removeMin());

    System.out.println(meme + "\nisEmpty: " + meme.isEmpty()); //verify that meme is empty


  }

} //end class
