# Lab03
## Peglegs
### Rubin Peci, Bo Lu, Daniel Gelfand

hey wyd

### Changes
1. [x] Adding appropriate index checking for the peekMin() and removeMin() methods.
   - Just in case user makes a dumb mistake

2. [x] Fixed the removeMin() method to utilize ArrayList methods better.
   - Had to give up single line of code, but basically the same code

3. [x] Fixed peekMin() method to remove unecessary variables. Also utilizes foreach loop for cleaner look(being able to start at one index later isn't that big of a difference).

4. [x] Added some QUALITY test cases in the main method.


### Heap Todo
Form a plan for implementing each method,
....and a prioritized list indicating which to implement before others. Add this list to readme, under heading "heap todo".

**helper methods should get priority

1. [x] peekMin() - reuse implementation from previous homework(use get() method)

2. [x] minChildPos( int pos ) - use lots of compareTo()

3. [x] minOf( Integer a, Integer b ) - use compareTo()

4. [x] swap( int pos1, int pos2 ) - utilize return value of set() inside another set()

5. [x] peekMin() - reuse implementation from previous homework(use get() method) 
6. [x] add( Integer addVal )
    1) Insert a new element to the end of the array representing a binary tree.
    2) While the heap's property is broken, swap element with parent.
    3) Repeat step 2 till heap property is fulfilled.

7. [x] removeMin()
   1) Replace root of heap with last element of the array
   2) Compare the new root with children. If the children are in correct order then stop.
   3) Otherwise, swap with one of children and go back to step 2.
    - for a min heap swap with the smaller child
    - for a max heap swap with larger child

8. [x] toString() - use given toString() from ArrayList

9. [x] isEmpty() - use given isEmpty() from ArrayList
