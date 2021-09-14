import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Experiment Controller Class
 *
 * @author Claire Liu, Renee Soika, and Yuqi Wang
 * @version October 3, 2020
 */
public class ExperimentController {
    public static final int[] NUM_ELEMENTS = {1, 2, 3, 4, 5};
    public static final int TRIALS = 10;

    private static BubbleSorter bubbleSorter = new BubbleSorter();
    private static SelectionSorter selectionSorter = new SelectionSorter();
    private static InsertionSorter insertionSorter = new InsertionSorter();
    private static MergeSorter mergeSorter = new MergeSorter();
    private static QuickSorterFirst quickSorterFirst = new QuickSorterFirst();
    private static QuickSorterMedian quickSorterMedian = new QuickSorterMedian();
    private static QuickSorterRandom quickSorterRandom = new QuickSorterRandom();
    
    private static Sorter javaMergeSorter = new Sorter() {
        
        /**
         * Sorts an array with Java's merge sort algorithm.
         * 
         * @param arr   array of objects to sort
         */
        public <T extends Comparable<? super T>> void sort(T[] arr) {
            Arrays.sort(arr);
        }
        
    };

    private static String[] testCasesNames = {"ascending", "descending","90% sorted", "random", "duplicates"};

    /**
     * Starts the experiment.
     * 
     * @param args  command-line arguments (none)
     */
    public static void main(String[] arg) {      
        ExperimentController controller = new ExperimentController();
        controller.run(bubbleSorter);
        //controller.run();
    }

    /**
     * Runs the experiment for generic sorters and records results in a file.
     * 
     * @param currentSorter     generic sorter to time
     */
    public void run(Sorter currentSorter) {
        System.out.println("Running experiment...");

        // Output path for results
        String sorterString = currentSorter.toString();
        String sorterName = sorterString.substring(0, sorterString.indexOf('@'));
        String outPath = "time-analysis-" + sorterName + ".txt";

        // Declare I/O variables
        PrintWriter writer = null;
        Scanner scanner = null;

        // Run the experiment and write results to a file
        try {
            writer = new PrintWriter(outPath);
            writer.println("Test Case\tNumberOfElements\tTime (ms)");
            
            scanner = new Scanner(new File("arrays.txt"));
            
            // Run trials for each element count
            for (int elmCount : NUM_ELEMENTS) {
                
                // Run each test case for the sorter
                for (String test : testCasesNames) {
                    long[] averagesArray = new long[TRIALS];
                    
                    // Get a result for each trial
                    for (int trial = 0; trial < TRIALS; trial++) {
                        Integer[] arrayToSort = new Integer[elmCount];
                        
                        // Get all elements of the array
                        for (int i = 0; i < elmCount; i++) {
                            arrayToSort[i] = scanner.nextInt();
                        }

                        averagesArray[trial] = timeGenericSorter(currentSorter, arrayToSort);
                    }
                    
                    long averageRuntime = average(averagesArray);
                    
                    writer.println(test + "\t" + elmCount + "\t" + averageRuntime);
                }
            }

            System.out.println("Finished.");

        // Experiment failed
        } catch (Exception err) {
            System.out.println("FileWritingError");
            System.out.println(err);
        } finally {
            
            // Close the writer
            if (writer != null) {
                writer.close();
            }
            
            // Close the scanner
            if (scanner != null) {
                scanner.close();
            }
            
        }

    }
    
    /**
     * Runs the experiment for a primitive sorter (Java Quicksort) and records results in a file.
     */
    public void run() {
        System.out.println("Running experiment...");

        // Output path for results
        String outPath = "time-analysis-JavaQuicksort.txt";

        // Declare I/O variables
        PrintWriter writer = null;
        Scanner scanner = null;

        // Run the experiment and write results to a file
        try {
            writer = new PrintWriter(outPath);
            writer.println("Test Case\tNumberOfElements\tTime (ms)");
            
            scanner = new Scanner(new File("arrays.txt"));
            
            // Run trials for each element count
            for (int elmCount : NUM_ELEMENTS) {
                
                // Run each test case for the sorter
                for (String test : testCasesNames) {
                    int[] arrayToSort = new int[elmCount];
        
                    // Get all elements of the array
                    for (int i = 0; i < elmCount; i++) {
                        arrayToSort[i] = scanner.nextInt();
                    }

                    long[] averagesArray = new long[TRIALS];
                    
                    // Get a result for each trial
                    for (int trial = 0; trial < TRIALS; trial++) {
                        averagesArray[trial] = timePrimitiveSorter(arrayToSort);
                    }
                    
                    long averageRuntime = average(averagesArray);
                    
                    writer.println(test + "\t" + elmCount + "\t" + averageRuntime);
                }
            }

            // Close the writer/scanner
            scanner.close();
            writer.close();

            System.out.println("Finished.");

        // Experiment failed
        } catch (Exception err) {
            System.out.println("FileWritingError");
            System.out.println(err);
        } finally {
            
            // Close the writer
            if (writer != null) {
                writer.close();
            }
            
            // Close the scanner
            if (scanner != null) {
                scanner.close();
            }
            
        }

    }

    /**
     * Times how long it takes to sort an array with a given generic sorter.
     * 
     * @param sorter    sorter to sort with
     * @parma arr       array to sort
     * 
     * @return time taken to sort
     */
    public static long timeGenericSorter(Sorter sorter, Integer[] arr) {
        long startTime = System.currentTimeMillis();
        sorter.sort(arr);
        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }
    
    /**
     * Times how long it takes to sort an array of primitives with Java's default implementation.
     * 
     * @parma arr       array to sort
     * 
     * @return time taken to sort
     */
    public static long timePrimitiveSorter(int[] arr) {
        long startTime = System.currentTimeMillis();
        Arrays.sort(arr);
        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }

    /**
     * Computes the rounded average of longs.
     *
     * @param nums  longs to average
     *
     * @return rounded long average
     */
    private static long average(long[] nums) {
        long avg = 0;

        // Sum all values
        for (long num : nums) {
            avg += num;
        }

        return Math.round((double) avg / nums.length);
    }

}
