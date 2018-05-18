/*****************************************************
* Peglegs - Daniel Gelfand, Rubin Peci, Bo Lu
* APCS2 pd2
* HW#50 Run Run Run
* 2018-05-18 F
* class RunMed
* Finds median of given heap
*****************************************************/
/*
Algo(as seen in class):
1)Check heap sizes of both ALHeapMin and ALHeapMax
2)Depending on result from Part 1, do a or b.
-2a)If heap sizes are equal, the median is the average of the roots\
-2b)If the heap sizes are different, the median is the root of the larger heap.
 */

import java.util.NoSuchElementException;
public class RunMed{

    //instance vars
    ALHeapMin lilVals;
    ALHeapMax bigVals;

    public RunMed(){
	bigVals = new ALHeapMax();
	lilVals = new ALHeapMin();

    }

    /*
      RETURNS median of heap or throws NoSuchElementException()
     */
    public double getMedian(){
	//only when both heaps have nothing
	if(lilVals.isEmpty() && bigVals.isEmpty())
	    throw new NoSuchElementException();
	//the case where both heap sizes are equal - find avg of roots
	if(lilVals.size() == bigVals.size())
	    return ( lilVals.peekMin() + bigVals.peekMax() ) / 2.0 ;

	//big vals is larger
	else if( bigVals.size() > lilVals.size())
	    return bigVals.peekMax();
	
	else{//lilVals is bigger
	    return lilVals.peekMin();
	}
    }
    /*
      returns nothing.
      Adds given arg into either heap while maintaining balance.
     */
    public void add(Integer newVal){
	//If empty or newVal is less than root of max heap - add to max heap
	if( lilVals.isEmpty() && bigVals.isEmpty() ||
	    newVal < bigVals.peekMax()  )	    
	    bigVals.add(newVal);
	//otherwise add to min Heap
	else{
	    lilVals.add(newVal);

	}

	//balancing stuff - only when size difference >=2
	while(Math.abs(lilVals.size() - bigVals.size()) >= 2){
	    //max heap > min heap
	    if(bigVals.size() - lilVals.size() >0)
		lilVals.add(bigVals.removeMax());
	    //min heap>max heap
	    else{
		bigVals.add(lilVals.removeMin());
	    }

	}
	
    }

    //bad toString() for temp testing
    public String toString(){
	System.out.println("lilVals:" + "\n" + lilVals.toString());
	System.out.println("bigVals:" + "\n" + bigVals.toString());
	return "";
    }


    public static void main(String[] args){

	RunMed yote =  new RunMed();

	//median should be 3
	yote.add(1);
	yote.toString();
	yote.add(2);
	yote.toString();
	yote.add(3);
	yote.toString();
	yote.add(4);
	yote.toString();
	yote.add(5);
	yote.toString();

	System.out.println("median: " + yote.getMedian());

	System.out.println("********************\n");


	RunMed yate =  new RunMed();

	//median should be 7.5
	yate.add(9);
	yate.toString();
	yate.add(5);
	yate.toString();
	yate.add(15);
	yate.toString();
	yate.add(8);
	yate.toString();
	yate.add(1);
	yate.toString();
	yate.add(7);
	yate.toString();

	System.out.println("median: " + yate.getMedian());
    }
    

    


}//end class
