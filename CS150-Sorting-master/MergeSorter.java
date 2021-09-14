import java.util.Arrays;

/**
 * Sorts objects based on the merge sort algorithm.
 *
 * @author Claire Liu, Renee Soika, Yuqi Wang
 * @version October 7, 2020
 */
public class MergeSorter implements Sorter
{

    /**
     * Sorts an array based on the merge sort algorithm.
     * 
     * @param arr   array to sort
     */
    public <T extends Comparable<? super T>> void sort (T[] arr){
        mergeSort(arr, 0, arr.length - 1);
    }

    /**
     * Runs the merge sort algorithm until the array is sorted.
     * @param  arr      an array of Objects
     * @param  start    the first index of the current (sub)array
     * @param  end      the last index of the current (sub)array
     */
    private <T extends Comparable<? super T>> void mergeSort (T[] arr, int start, int end){

        // There are no more subsets to sort
        if(start >= end) { 
            return;
        }

        int half = (start + end) / 2;
        mergeSort(arr, start, half);
        mergeSort(arr, half + 1, end);
        merge(arr, start, half, end);
    }

    /**
     * Merges two halves of an array in sorted order.
     * @param arr   an array of Objects
     * @param start the first index of the current (sub)array
     * @param half  the middle index of the current (sub)array
     * @param end   the last index of the current (sub)array
     */
    private <T extends Comparable<? super T>> void merge (T[] arr, int start, int half, int end) {
        T[] firstHalfCopy = Arrays.copyOfRange(arr, start, half + 1);
        int copyIndex = 0;
        int originalIndex = half + 1;
        int insertIndex = start;
        
        // Keep copying elements until we reach the end of the original or the copy
        while (copyIndex < firstHalfCopy.length && originalIndex <= end) {
            
            // Insert next element from the original or the copy, whichever is smaller
            if (firstHalfCopy[copyIndex].compareTo(arr[originalIndex]) <= 0) {
                arr[insertIndex++] = firstHalfCopy[copyIndex++];
            } else {
                arr[insertIndex++] = arr[originalIndex++];
            }
            
        }
        
        // Fill original array with elements remaining in the copy
        while (copyIndex < firstHalfCopy.length) {
            arr[insertIndex++] = firstHalfCopy[copyIndex++];
        }
        
    }
    
}
