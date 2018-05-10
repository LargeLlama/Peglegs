//Bo Lu
//APCS2 pd2
//HW46:Arr, There Be Priorities Here Matey
//2018-05-10
import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue{
    private ArrayList<String> apQueue;

    public ArrayPriorityQueue(){
	apQueue = new ArrayList<String>();
    }
    
    //Adds an item to this priority queue.
    //runtime of O(1), b/c adding to end only
    public void add(String x){
	//uses ALlist method add
	apQueue.add(x);

    }
	
    //Returns true if this stack is empty, otherwise returns false.
    //O(1) runtime
    public boolean isEmpty() {
	//uses AList method size()
	return apQueue.size() == 0;

    }


    //Returns the smallest item stored in this priority queue without removing it.
    //runtime of O(n), b/c it needs to look for the right value
    public String peekMin(){
	String min = apQueue.get(0);

	for(int i = 1; i<apQueue.size()-1; i++){
	    //means current String is smaller
	    if(apQueue.get(i).compareTo(min) < 0)
		min = apQueue.get(i);

	}
	
	return min;
	
    }
    
    // Removes and returns the smallest item stored in this priority queue.
    //runtime of O(n), b/c it needs to look for the right value
    public String removeMin(){
	
	String min = apQueue.get(0);
	int index = 0;

	for(int i = 1; i<apQueue.size()-1; i++){
	    //means current String is smaller
	    if(apQueue.get(i).compareTo(min) < 0){
		min = apQueue.get(i);
		index = i;
	    }
	    
	}

	apQueue.remove(index);
	return min;
	
    }

    //used to visualize our arrayhlist
    public String toString(){
	String rtr = "{";
	for(String elem: apQueue){
	    rtr += elem+ ", ";
	}

	return rtr + "}";
    }
	   
	    
       


    public static void main(String[] args){

	ArrayPriorityQueue bob = new ArrayPriorityQueue();

	bob.add("foo");
	bob.add("moo");
	System.out.println(bob.toString());
	System.out.println("removed " + bob.removeMin());
	System.out.println(bob.toString());
	
	bob.add("goo");
	bob.add("hoo");
	bob.add("doo");
	System.out.println(bob.toString());
	System.out.println("removed " + bob.removeMin());
	System.out.println(bob.toString());

    }


}
