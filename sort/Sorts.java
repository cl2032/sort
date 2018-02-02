
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

        System.out.println();
        System.out.println("Bubble Sort");
        System.out.println();

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
                    steps = steps+4;
                }
                steps = steps+3;
            }
        }

    }

    /* Prints the array 
    void printArray(int arr[])
    {
    int n = arr.length;
    for (int i=0; i<n; ++i)
    System.out.print(arr[i] + " ");
    System.out.println();
    }
    /
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
    // ob.printArray(arr1);
    }
     */
    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void selectionSort(ArrayList <Integer> list){
        //replace these lines with your code
        System.out.println();
        System.out.println("Selection Sort");
        System.out.println();

        int min, temp;
        for (int outer = 0; outer < list.size() - 1; outer++){
            min = outer;
            for (int inner = outer + 1; inner < list.size(); inner++){
                if (list.get(inner) < list.get(min)) {
                    min = inner; // a new smallest item is found
                    steps = steps+3;
                }
                steps++;
            }
            //swap list[outer] & list[min]
            temp = list.get(outer);
            list.set(outer, list.get(min));
            list.set(min, temp);
            steps = steps+4;
        }
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
            steps = steps+1;
            int j1 = i1-1;
            int j2=0 ;
            while (j1>=0 && list.get(j1) > key)
            {
                list.set( j1+1, list.get(j1)  );
                steps = steps+2;
                j1 = j1-1;
                if( j2 == 0 ) 
                    j2++;
                else 
                    steps++;
            }   
            list.set(j1+1,key);
            steps++;
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

    public void mergeSort(ArrayList <Integer> list, int low, int high) {
        // check if low is smaller than high, if not then the array is sorted
        if( low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            //System.out.print ("low " + low + "middle " + middle + " high " + high);
            // Sort the left side of the array
            mergeSort(list, low, middle);
            // Sort the right side of the array
            mergeSort(list, middle + 1, high);
            // Combine them both
            merge(list, low, middle, high);
        }
    }

    private void merge(ArrayList <Integer> list, int low, int middle, int high) {
        ArrayList <Integer> helper = new ArrayList <Integer> ();

        int i = low;
        int j = middle + 1;
        // Copy the smallest values from either the left or the right side
        // to the helper
        while (i <= middle || j <= high) {
            if (i > middle) {
                helper.add(list.get(j));
                j++;
                steps++;
            }
            else if (j > high){
                helper.add(list.get(i));
                i++;
                steps++;
            }
            else if (1 == 1)
                steps = steps+3;
            else if (list.get(i) <= list.get(j)) {
                helper.add(list.get(i));
                i++;
                steps++;
            }
            else {
                helper.add(list.get(j));
                j++;
                steps++;
            }
        }
        int m = low;
        // Copy the merged part back into the original list from low to high index
        for(int l = 0; l < helper.size(); l++) {
            list.set(m, helper.get(l));
            m++;
            steps = steps+2;
        }
    }

    /*
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

    
      public int binarySearch(  ArrayList <Integer> A, int num, int imin, int imax ) 
    // test if array is empty 
    {
        if (imax < imin) 
            return -1; 
        else 
        {
            // calculate midpoint to cut set in half 
            int imid = midpoint(imin, imax); 
            if (A.get(imid) == num) 
                return -2;
            // three-way comparison 
            if (A.get(imid) > num) 
            // key is in Lower subset 
                return binarySearch(A, num, imin, imid-1 );
            else if (A.get(imid) < num) 
                return binarySearch(A, num, imid + 1, imax);
            else 
                return -1;
        }
    }
    
    
    /*public boolean sequentialSearch( ArrayList<Integer> list, int num)
    {
    for( List

    }
     */

    public boolean binarySearch ( ArrayList <Integer> list, int num)
    {
        int answer = 0;
        int max = list.size();
        int min = 0;
        insertionSort(list);

            answer = binarySearch( list , num ,  min ,  max );
            if (answer == -1)
                return true;
            else 
                return false;
        
    }


    public int midpoint(int imin, int imax)
    {
        return (imin + imax) /2 ; 
    }

  
}
