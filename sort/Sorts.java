
import java.util.*;

public class Sorts{
    private long steps;

    /**
     *  Description of Constructor
     *
     * @param  list  Description of Parameter
     */
    public Sorts(){
        steps = 0;
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void bubbleSort(ArrayList <Integer> list){

        {
            int n1 = list.size();
            for (int i1 = 0; i1 < n1-1; i1++)
            {
                for (int j1 = 0; j1 < n1-i1-1; j1++)
                {
                    if (list.get(j1) > list.get(j1+1))
                    {
                        // swap temp and arr[i]
                        int temp = list.get(j1);
                        list.set(j1,  list.get(j1+1)   );
                        list.set(j1+1,  temp);
                    }
                    steps++;
                }
            }
        }

    }

    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    // Driver method to test above
    public static void main(String args[])
    {
        Sorts ob = new Sorts();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ArrayList<Integer> list  = new ArrayList<Integer>();
        for( int i1=0 ; i1<arr.length ; i1++ ) 
        {
            list.add( arr[i1] ) ;     
        }

        ob.bubbleSort(list);
        System.out.println("Sorted array");

        int[] arr1 = new int[list.size()];

        for(int i1 = 0; i1 < list.size(); i1++)
        {
            if (list.get(i1) != null)
            {
                arr1[i1] = list.get(i1);
            }
        }

        System.out.println();
        System.out.println("Bubble Sort");
        System.out.println();
        ob.printArray(arr1);
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public ArrayList<Integer> selectionSort(ArrayList <Integer> list){
        //replace these lines with your code

        ArrayList<Integer> sortedList  = new ArrayList<Integer>();
        int min = list.get(0) ; int index = 0 ; 
        while( list.size() > 0 ) 
        {
            min = list.get(0); index = 0;
            for(int i1 = 1 ; i1 < list.size() ; i1++ ) 
            {
                if( list.get(i1) < min)
                {
                    min = list.get(i1);
                    index = i1;

                }
                steps++ ; 
            }
            list.remove(index);
            sortedList.add(min);
        }
        System.out.println();
        System.out.println("Selection Sort");
        System.out.println();
        return sortedList;

    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void insertionSort(ArrayList <Integer> list)
    {
        //replace these lines with your code

        int n1 = list.size();
        for (int i1=1; i1<n1; ++i1)
        {
            int key = list.get(i1);
            int j1 = i1-1;

            /* Move elements of arr[0..i-1], that are
            greater than key, to one position ahead
            of their current position */
            steps++ ; 
            int j2=0 ;
            while (j1>=0 && list.get(j1) > key)
            {
                list.set( j1+1, list.get(j1)  );
                j1 = j1-1;
                if( j2 == 0 ) 
                    j2++;
                else 
                    steps++;
            }   
            list.set(j1+1,key);
        }

        System.out.println();
        System.out.println("Insertion Sort");
        System.out.println();
    }

    /*
    public void combine( int[] arr1, int leftIndex,int middle, int rightIndex ) 
    {
        int left1 = leftIndex  ;
        int right1 = middle+1 ; 
        
        while( left1 <= middle  && right1 <= rightIndex ) 
          {
              if( arr1[left] )
              {
                }
          }
    }
    public void merge( int[] arr1, int leftIndex, int rightIndex ) 
    {
       if( leftIndex == rightIndex ) 
         return ;
        if( leftIndex == rightIndex + 1 ) 
        {
            if( arr1[leftIndex] > arr1[rightIndex] ) 
             {
                int temp = arr1[rightIndex] ; 
                arr1[rightIndex] = arr1[leftIndex] ; 
                arr1[leftIndex] = temp ; 
              }
        }
        
        int middle = (leftIndex + rightIndex) /2 ; 
        merge( arr1 , leftIndex , middle ) ;
        merge( arr1 , middle+1 , rightIndex ) ;
        combine( arr1, leftIndex, middle, rightIndex ) ;
        
    }
    public void mergeSort(ArrayList <Integer> list)
    {
        int[] arr1 = new int[list.size()];

        for(int i1 = 0; i1 < list.size(); i1++)
        {
            if (list.get(i1) != null)
            {
                arr1[i1] = list.get(i1);
            }
        }
        
        merge( arr1 ,0, arr1.length-1) ; 
    }
    
    /**
     *  Accessor method to return the current value of steps
     *
     */
    public long getStepCount(){
        return steps;
    }

    /**
     *  Modifier method to set or reset the step count. Usually called
     *  prior to invocation of a sort method.
     *
     * @param  stepCount   value assigned to steps
     */
    public void setStepCount(long stepCount){
        steps = stepCount;
    }
}
