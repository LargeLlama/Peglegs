public interface PriorityQueue {
    //adds item to this priority queue
    public void add(String val);

    //returns true if it's empty, false otherwise
    public boolean isEmpty();

    //returns smallest item stored in queue without removing it
    public String peekMin();

    //removes and returns smallest item in priority queue
    public String removeMin();
}
