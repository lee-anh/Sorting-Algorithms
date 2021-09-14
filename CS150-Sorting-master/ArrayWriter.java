import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Prints arrays to a file
 *
 * @author Claire Liu, Renee Soika, Yuqi Wang
 * @version October 10, 2020
 */
public class ArrayWriter
{
   
    /**
     * Writes test arrays to a file.
     * 
     * @param args  command-line arguments (none)
     */
    public static void main(String[] args) {
        IntArrayGenerator intArrayGenerator = new IntArrayGenerator();
        
        // Initialize the ArrayWriter
        try {
            PrintWriter writer = new PrintWriter("arrays.txt");

            // Write arrays with the given number of elements
            for (int elmCount : ExperimentController.NUM_ELEMENTS) {
                
                // Ascending
                for (int trial = 0; trial < ExperimentController.TRIALS; trial++) {
                    Integer[] arr = intArrayGenerator.genAscending(elmCount);
                    ArrayWriter.numWrite(writer, arr);
                }
                
                // Descending                
                for (int trial = 0; trial < ExperimentController.TRIALS; trial++) {
                    Integer[] arr = intArrayGenerator.genDescending(elmCount);
                    ArrayWriter.numWrite(writer, arr);
                }
                
                // 90% sorted
                for (int trial = 0; trial < ExperimentController.TRIALS; trial++) {
                    Integer[] arr = intArrayGenerator.genPercentSorted(elmCount, 90);
                    ArrayWriter.numWrite(writer, arr);
                }
                
                
                // Random
                for (int trial = 0; trial < ExperimentController.TRIALS; trial++) {
                    Integer[] arr = intArrayGenerator.genRandom(elmCount);
                    ArrayWriter.numWrite(writer, arr);
                }
                
                // Duplicates
                for (int trial = 0; trial < ExperimentController.TRIALS; trial++) {
                    Integer[] arr = intArrayGenerator.genDuplicates(elmCount);
                    ArrayWriter.numWrite(writer, arr);
                }
                                
            }
            
            writer.close();
            
        // Catch errors writing to file
        } catch (Exception err) {
            System.out.println(err);
        }
    }
    
    /**
     * Prints an array to a file.
     * 
     * @param arr   integer array to print
     */
    private static void numWrite(PrintWriter writer, Integer[] arr) {
       
        // Add all values to the string
        for (int num : arr) {
            writer.print(num);
            writer.print(" ");
        }
       
    }
}
