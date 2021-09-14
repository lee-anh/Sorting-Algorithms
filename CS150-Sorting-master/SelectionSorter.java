/**
 * Sorts objects based on the selection sort algorithm.
 *
 * @author Claire Liu, Renee Soika, Yuqi Wang
 * @version October 7, 2020
 */
public class SelectionSorter implements Sorter
{

    /**
     * Sorts an array with the selection sort algorithm
     * @param arr    an array of Objects
     */
    public <T extends Comparable<? super T>> void sort (T[] arr) {
        int length = arr.length;

        // Fill each position in the array with the next smallest value
        for (int fill = 0; fill < length - 1; fill++) {
            
            // Set the temperory position of the min value in the array to be the first one
            int posMin = fill;

            // Find the next minimum value
            for (int nxt = fill + 1; nxt < length; nxt++) {
                
                // Value in the latter index < former index
                if (arr[nxt].compareTo(arr[posMin]) < 0) {
                    
                    // Set the position of value in the latter index to be the smallest value's position
                    posMin = nxt;
                    
                }
            }

            // Swap the smallest value with the first index
            T tmp = arr[fill];
            arr[fill] = arr[posMin];
            arr[posMin] = tmp;

        }

    }
    
}
