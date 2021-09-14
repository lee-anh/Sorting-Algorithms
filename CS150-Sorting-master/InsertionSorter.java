/**
 * Sorts objects based on the insertion sort algorithm.
 *
 * @author Claire Liu, Renee Soika, Yuqi Wang
 * @version October 7, 2020
 */
public class InsertionSorter implements Sorter
{

    /**
     * Iterates through the array and inserts each value at the correct index.
     * @param arr   an array of Objects
     */
    public <T extends Comparable<? super T>> void sort (T[] arr) {

        // Insert the correct value at each position
        for (int nextPos = 1; nextPos < arr.length; nextPos++) {
            insert(arr, nextPos);
        }

    }

    /**
     * Finds the right position to insert the value then copies elements down to make room in the array.
     * @param arr       an array of Objects
     * @param nextPos   the index of the value to insert
     */
    private <T extends Comparable<? super T>> void insert (T[] arr, int nextPos) {
        T nextVal = arr[nextPos];

        // Skip values that are greater than the value to insert
        while (nextPos > 0 && nextVal.compareTo(arr[nextPos - 1]) < 0) {
            arr[nextPos] = arr[nextPos - 1];
            nextPos--;
        }

        arr[nextPos] = nextVal;
    }

}
