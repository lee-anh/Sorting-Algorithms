import java.util.Random;

/**
 * Sorts objects based on the quick sort algorithm with a random element as the pivot.
 *
 * @author Claire Liu, Renee Soika, Yuqi Wang
 * @version October 7, 2020
 */
public class QuickSorterRandom extends QuickSorter
{
    Random rand;
    
    /**
     * Constructs a new QuickSorterRandom.
     */
    public QuickSorterRandom() {
        rand = new Random();
    }
    
    /**
     * Constructs a new QuickSorterRandom with the seed to use to generate random pivot indexes.
     * @param seed  the seed to use
     */
    public QuickSorterRandom(long seed) {
        rand = new Random(seed);
    }
    
    /**
     * Gets a random element as the pivot value for this quick sort algorithm.
     * @param arr   an array to get the pivot value from
     * @param first index to get pivot at or after
     * @param last  index to get pivot at or before
     * @return the pivot index
     */
    public <T extends Comparable<? super T>> int getPivot(T[] arr, int first, int last) {
        return rand.nextInt(last - first + 1) + first;
    }
    
}
