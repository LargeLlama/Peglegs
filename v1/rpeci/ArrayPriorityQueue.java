//Woobin Peco
//APCS-2 pd02
//HW46 - post malone's new album SLAPS
//2018-05-09
//YURRRRRRR

import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue 
{
    private ArrayList<String> _list;

    public ArrayPriorityQueue() {
        _list = new ArrayList<String>();
    }
    
    //adds item to this priority queue
    public void add(String val)
    {
        _list.add(val); //just add element to the arraylist
    }

    //returns true if it's empty, false otherwise
    public boolean isEmpty()
    {
        return _list.size() == 0;   //if arraylist size is 0, queue is empty
    }

    //returns smallest item stored in queue without removing it
    public String peekMin()
    {
        String min = _list.get(0);      //loop thru the array and constantly check what the min value is 
        for (String s : _list) {
            if (min.compareTo(s) > 0)       //update it if a smaller value is found
                min = s;
        }

        return min; //return it
    }

    //removes and returns smallest item in priority queue
    public String removeMin()
    {
        //check that its not empty
        if (!this.isEmpty()) {
            String min = this.peekMin();    //just use the built-in peekMin
            _list.remove(min);  //remove the object
            return min; //return min
        }
        //otherwise return null
        return null;
    }
    
    public String toString()
    {
        return _list.toString();    //use arraylist's toString
    }

    public static void main(String[] args)
    {
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
    
}
