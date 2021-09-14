/**
 * Sorts objects based on the quick sort algorithm.
 *
 * @author Claire Liu, Renee Soika, Yuqi Wang
 * @version October 7, 2020
 */
public abstract class QuickSorter implements Sorter
{
    
    /**
     * Sorts an array according to a quick sort algorithm.
     * @param arr  an array to sort
     */
    public <T extends Comparable<? super T>> void sort (T[] arr) {
        qSort(arr, 0, arr.length - 1);
    }
    
    /**
     * Gets the pivot value for this quick sort algorithm.
     * @param arr  an array to get the pivot value from
     * @return the pivot index
     */
    abstract <T extends Comparable<? super T>> int getPivot(T[] arr, int first, int last);
    
    /**
     * Quick sorts a portion of an array.
     * @param arr   array to sort
     * @param first index to start sorting at
     * @param last  index to stop sorting at
     */
    private <T extends Comparable<? super T>> void qSort (T[] arr, int first, int last) {
        
        // Sort until the array cannot be divided until subsets
        if (first < last) {
            int pivotIndex = partition(arr, first, last);
            qSort(arr, first, pivotIndex - 1);
            qSort(arr, pivotIndex + 1, last);
        }
        
    }
    
    /**
     * Partitions an array for quick sorting.
     * @param arr   array to sort
     * @param first index to start sorting at
     * @param last  index to stop sorting at
     * @return index to split array into partitions
     */
    <T extends Comparable<? super T>> int partition(T[] arr, int first, int last) {
        int pivotIndex = getPivot(arr, first, last);
        T pivot = arr[pivotIndex];
        QuickSorter.swap(arr, pivotIndex, first);
        
        int up = first;
        int down = last;
        
        // Partition until up and down cross over
        do {
            
            // Move up past elements smaller than pivot
            while (up < last && pivot.compareTo(arr[up]) >= 0) {
                up++;
            }
            
            // Move down past elements larger than pivot
            while (pivot.compareTo(arr[down]) < 0) {
                down--;
            }
            
            // Swap values on the wrong side of the partition
            if (up < down) {
                QuickSorter.swap(arr, up, down);
            }
            
        } while (up < down);
        
        QuickSorter.swap(arr, first, down);
                
        return down;
    }
    
    /**
     * Swaps two elements in an array.
     * @param arr   array to swap elements in
     * @param i     one index to swap
     * @param e     the other index to swap
     */
    static <T> void swap(T[] arr, int i, int e) {
        T temp = arr[i];
        arr[i] = arr[e];
        arr[e] = temp;
    }
    
}
