import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class QuickSorterFirstTest.
 *
 * @author  Claire Liu, Renee Soika, Yuqi Wang
 * @version October 10, 2020
 */
public class QuickSorterFirstTest
{
    /**
     * Default constructor for test class QuickSorterFirstTest
     */
    public QuickSorterFirstTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testSortEmpty()
    {
        QuickSorterFirst quickSor1 = new QuickSorterFirst();
        Integer[] arr = new Integer[0];
        
        quickSor1.sort(arr);
        
        assertArrayEquals(new Integer[0], arr);
    }
    
    @Test
    public void testSortPopulatedUnique()
    {
        QuickSorterFirst quickSor1 = new QuickSorterFirst();
        Integer[] arr = {4, 8, 2, 3, 10, 1, 9, 7, 6, 5};
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        quickSor1.sort(arr);
        
        assertArrayEquals(expected, arr);
    }
    
    @Test
    public void testSortPopulatedDuplicates()
    {
        QuickSorterFirst quickSor1 = new QuickSorterFirst();
        Integer[] arr = {4, 9, 1, 3, 10, 1, 9, 7, 6, 4};
        Integer[] expected = {1, 1, 3, 4, 4, 6, 7, 9, 9, 10};
        
        quickSor1.sort(arr);
        
        assertArrayEquals(expected, arr);
    }
    
    @Test
    public void testSortBestCase()
    {
        QuickSorterFirst quickSor1 = new QuickSorterFirst();
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        quickSor1.sort(arr);
        
        assertArrayEquals(expected, arr);
    }
    
    @Test
    public void testSortWorstCase()
    {
        QuickSorterFirst quickSor1 = new QuickSorterFirst();
        Integer[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        quickSor1.sort(arr);
        
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testGetPivot()
    {
        QuickSorterFirst quickSor1 = new QuickSorterFirst();
        Integer[] arr = {5, 4, 3, 2, 1};
        
        assertEquals(0, quickSor1.getPivot(arr, 0, arr.length - 1));
    }
    
    @Test
    public void testPartitionSmallest() {
        QuickSorterFirst quickSor1 = new QuickSorterFirst();
        Integer[] arr = {1, 4, 3, 5, 2};
        Integer[] expected = {1, 4, 3, 5, 2};

        int pivotIndex = quickSor1.partition(arr, 0, 4);
        
        assertArrayEquals(expected, arr);
        assertEquals(0, pivotIndex);
    }
    
    @Test
    public void testPartitionLargest() {
        QuickSorterFirst quickSor1 = new QuickSorterFirst();
        Integer[] arr = {5, 4, 1, 3, 2};
        Integer[] expected = {2, 4, 1, 3, 5};

        int pivotIndex = quickSor1.partition(arr, 0, 4);
        
        assertArrayEquals(expected, arr);
        assertEquals(4, pivotIndex);
    }
    
    @Test
    public void testPartitionMedian() {
        QuickSorterFirst quickSor1 = new QuickSorterFirst();
        Integer[] arr = {3, 4, 1, 5, 2};
        Integer[] expected = {1, 2, 3, 5, 4};

        int pivotIndex = quickSor1.partition(arr, 0, 4);
        
        assertArrayEquals(expected, arr);
        assertEquals(2, pivotIndex);
        
    }
    
    @Test
    public void testSwap() {
        Integer[] arr = {1, 2, 3};
        Integer[] expected = {3, 2, 1};
        
        QuickSorter.swap(arr, 0, 2);
        
        assertArrayEquals(expected, arr);
    }
    
}
