/**
 * Sorts objects based on the quick sort algorithm with the median of the first, middle, and last elements as the pivot.
 *
 * @author Claire Liu, Renee Soika, Yuqi Wang
 * @version October 8, 2020
 */
public class QuickSorterMedian extends QuickSorter
{
    
    /**
     * Gets the median of the first, middle, and last elements as the pivot value for this quick sort algorithm.
     * @param arr   an array to get the pivot value from
     * @param first index to get pivot at or after
     * @param last  index to get pivot at or before 
     * @return the pivot index
     */
    public <T extends Comparable<? super T>> int getPivot(T[] arr, int first, int last) {
        int middle = (first + last) / 2;
        
        // Swap first and mid if first is larger
        if (arr[middle].compareTo(arr[first]) < 0) {
            QuickSorterMedian.swap(arr, first, middle);
        }
        
        // Swap first and last if first is larger
        if (arr[last].compareTo(arr[first]) < 0) {
            QuickSorterMedian.swap(arr, first, last);
        }
        
        // Swap last and mid if mid is larger
        if (arr[last].compareTo(arr[middle]) < 0) {
            QuickSorterMedian.swap(arr, middle, last);
        }
        
        return middle;
    }
    
}
