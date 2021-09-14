
/**
 * Sorts objects based on the quick sort algorithm with the first element as the pivot.
 *
 * @author Claire Liu, Renee Soika, Yuqi Wang
 * @version October 7, 2020
 */
public class QuickSorterFirst extends QuickSorter
{
    
    /**
     * Gets the first element as the pivot value for this quick sort algorithm.
     * @param arr   an array to get the pivot value from
     * @param first index to get pivot at or after
     * @param last  index to get pivot at or before 
     * @return the index of the pivot index
     */
    public <T extends Comparable<? super T>> int getPivot(T[] arr, int first, int last) {
        return first;
    }
    
}
