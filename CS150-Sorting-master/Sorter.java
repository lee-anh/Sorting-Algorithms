/**
 * An interface of sorting algorithms
 * 
 * @author Ge Xia
 * @version October 7, 2020
 */
public interface Sorter
{
    
    /**
     * Sort an array of comparable objects. 
     *
     * @param  arr  an array of comparable objects
     */ 
    public <T extends Comparable<? super T>> void sort (T[] arr);
    
}
