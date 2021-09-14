/**
 * Sorts objects based on the bubble sort algorithm.
 *
 * @author Claire Liu, Renee Soika, Yuqi Wang
 * @version October 7, 2020
 */
public class BubbleSorter implements Sorter
{
    
    /**
     * Sorts an array according to a bubble sort algorithm. It repeartedly compare the adjancent items.
     * @param arr   an array of objects
     */
    public <T extends Comparable<? super T>> void sort (T[] arr) {
        
        /* A pass is one full trip through the array comparing,and swapping adjacent elements if necessary.  
           Several passes have to be made through the array before it is finally sorted. */
        int pass = 1;
        boolean exchanges;
        
        // Keep passing through the array while it needs sorted
        do {
            
            // Set exchanges to false awaiting a possible swap
            exchanges = false;
            
            // Keep sinking values through the unsorted portion of the array
            for (int i = 0; i < arr.length - pass; i++) {
                
                /* If the value in the latter index is greater than the value 
                   in the former index, then swap these two adjacent values */
                if (arr[i].compareTo(arr[i+1]) > 0) { 
                    T tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    
                    exchanges = true;
                }
                
            }
            
            pass++;
        
        } while (exchanges);
        
    }
    
}
