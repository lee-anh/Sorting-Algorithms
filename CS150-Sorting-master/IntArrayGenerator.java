import java.util.Random;

/**
 * Generates arrays of integers.
 *
 * @author Claire Liu, Renee Soika, Yuqi Wang
 * @version October 2, 2020
 */
public class IntArrayGenerator
{
    Random random;
    
    /**
     * Constructs a new generator without a seed.
     */
    public IntArrayGenerator() {
        random = new Random();
    }
    
    /**
     * Constructs a new generator with a seed.
     * 
     * @param seed  seed to generate random numbers from
     */
    public IntArrayGenerator(long seed) {
        random = new Random(seed);
    }
    
    /**
     * Generates an array of descending integers.
     * 
     * @param numItems  number of integers to insert
     * 
     * @return an array of integers in descending order
     */
    public Integer[] genDescending(int numItems) {
        Integer[] descArray = new Integer[numItems];
        
        // Generate decreasing numbers
        for (int i = 0; i < numItems; i++) {
            descArray[i] = numItems - i;
        }
        
        return descArray;
    }

    /**
     * Generates an array of ascending integers.
     * 
     * @param numItems  number of integers to insert
     * 
     * @return an array of integers in ascending order
     */
    public Integer[] genAscending(int numItems) {
        Integer[] ascArray = new Integer[numItems];
        
        // Generate increasing numbers
        for (int i = 0; i < numItems; i++) {
            ascArray[i] = i + 1;
        }
        
        return ascArray;
    }
    
    /**
     * Creates an almost sorted array.
     * 
     * @param numItems          number of items to input to array
     * @param percentSorted     percent of items that should be in sorted order
     * 
     * @return an array of almost-sorted integers
     */
    public Integer[] genPercentSorted(int numItems, double percentSorted) {
        Integer[] arr = new Integer[numItems];
        
        // Fill the array with almost-sorted integers
        for (int i = 0; i < numItems; i++) {
            
            // Add increasing numbers in sorted order
            if (random.nextDouble() <= percentSorted / 100) {
                arr[i] = i + 1;
            
            // Add a random number
            } else {
                arr[i] = random.nextInt();
            }
            
        }
        
        return arr;
    }

    /**
     * Generates an array filled with random integers.
     * 
     * @param numItems  number of integers to insert
     * 
     * @return an array filled with the given number of random integers
     */
    public Integer[] genRandom(int numItems) {
        Integer[] randomArray = new Integer[numItems];
        
        // Fill the array with random integers
        for (int i = 0; i < numItems; i++) {
            randomArray[i] = random.nextInt();
        }
        
        return randomArray;
    }
    
    /**
     * Generates an array with many duplicates. 
     * 
     * @param numItems  number of integers to insert
     * 
     * @return an array filled with the given number of random integers
     */
    public Integer[] genDuplicates(int numItems){
        Integer[] dupsArray = new Integer[numItems];
        
        // Fill the array with random integers between 0 and 50, inclusive
        for (int i = 0; i < numItems; i++){
            dupsArray[i]= random.nextInt(51);
        }
        
        return dupsArray;
    }
    
}
