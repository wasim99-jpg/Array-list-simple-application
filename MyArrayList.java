/**
 * Write a description of class MyArrayList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyArrayList
{
        // default initial capacity
        private static final int INITIAL_CAPACITY = 50; 
        private Object[] theData;   // the array to hold the list elements
        private int size = 0;     // the current size
        private int capacity = 0;   // the current capacity

        //Default constructor
        //Creates an array of size 10
        public MyArrayList()
        {
           theData = new Object[INITIAL_CAPACITY];
           capacity = INITIAL_CAPACITY;
        }
        
        
        //is empty
        public boolean isEmpty() {
            return size == 0;
        }
        
        //is full
        public boolean isFull()
        {
            return (size >= capacity);
        }
        
        public void insertAtFront(Object theValue)
        {
            if(isFull())  //the list is full
                System.err.println("Cannot insert in a full list.");
             else
             {
                for (int i = size; i > 0; i--)
                    theData[i] =  theData[i-1]; // move elements down
                //theData[2] = theData[1];
                theData[0] = theValue;  //insert the item at front
                size++; //increment the size
              }
        } //end add
        
        //insert at back?
        public void insertAtBack(Object theValue)
        {
            if(isFull() == true) // list is full
                System.out.println(" an arraylist full ");
            else
            {   
                theData [size]= theValue; //insert new item at back
                size++;
            }
        }//end add
        
        //insert at index?
        public void insertAtIndex(Object theValue, int index)
        {
            if(isFull() == true)
                System.err.println("cannot insert in a full list.");
            else
            {
                for(int i = size; i>index; i--) //i=3; i>1; i--
                    theData[i] = theData[i-1]; //move element down
                    
                    theData[index] = theValue; //insset at the front
                    size++; // increment the size
                
            }
        
        }
        
        
        public Object get(int index)
        {
            if(index < 0 || index >= size)
                throw new ArrayIndexOutOfBoundsException(index);
            else
            {
                return theData[index];
            }
        } //end get
        
        // display the elements of the list
        public void display()
        {
            for ( int i = 0; i < size; i++)
            {
                System.out.println(theData[i]);
                System.out.println();
            }
        } 
        
        // method size()
        public int size()
        {
            return size;
        }
        
        //how to remove?? remove from front
        public void RemoveFromFront()
        {
            if(isFull() == true) //indicate that list is full
            {
                System.out.println(" list is full ");
            }
            else
            {
              for (int i=0;i<size-1;i++)
                {
                    theData[i-1]=theData[i];
                    size--;
                }
              }
        }
        
        public void RemoveFromBack()
        {
            if(isFull() == true) //indicate that list is full
            {
                System.out.println(" list is full ");
            }
            else
            {
                size--;
            }
        }
        
}
