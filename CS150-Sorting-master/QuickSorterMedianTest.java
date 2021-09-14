import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class QuickSorterMedianTest.
 *
 * @author  Claire Liu, Renee Soika, Yuqi Wang
 * @version October 6, 2020
 */
public class QuickSorterMedianTest
{
    /**
     * Default constructor for test class QuickSorterMedianTest
     */
    public QuickSorterMedianTest()
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
        QuickSorterMedian quickSor1 = new QuickSorterMedian();
        Integer[] arr = new Integer[0];
        
        quickSor1.sort(arr);
        
        assertArrayEquals(new Integer[0], arr);
    }
    
    @Test
    public void testSortPopulatedUnique()
    {
        QuickSorterMedian quickSor1 = new QuickSorterMedian();
        Integer[] arr = {4, 8, 2, 3, 10, 1, 9, 7, 6, 5};
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        quickSor1.sort(arr);
        
        assertArrayEquals(expected, arr);
    }
    
    @Test
    public void testSortPopulatedDuplicates()
    {
        QuickSorterMedian quickSor1 = new QuickSorterMedian();
        Integer[] arr = {4, 9, 1, 3, 10, 1, 9, 7, 6, 4};
        Integer[] expected = {1, 1, 3, 4, 4, 6, 7, 9, 9, 10};
        
        quickSor1.sort(arr);
        
        assertArrayEquals(expected, arr);
    }
    
    @Test
    public void testSortBestCase()
    {
        QuickSorterMedian quickSor1 = new QuickSorterMedian();
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        quickSor1.sort(arr);
        
        assertArrayEquals(expected, arr);
    }
    
    @Test
    public void testSortWorstCase()
    {
        QuickSorterMedian quickSor1 = new QuickSorterMedian();
        Integer[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        quickSor1.sort(arr);
        
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testGetPivotMiddleDescending()
    {
        QuickSorterMedian quickSor1 = new QuickSorterMedian();
        Integer[] arr = {5, 4, 3, 2, 1};
        
        assertEquals(new Integer(3), arr[quickSor1.getPivot(arr, 0, arr.length - 1)]);
    }
    
    @Test
    public void testGetPivotMiddleAscending()
    {
        QuickSorterMedian quickSor1 = new QuickSorterMedian();
        Integer[] arr = {1, 2, 3, 4, 5};
        
        assertEquals(new Integer(3), arr[quickSor1.getPivot(arr, 0, arr.length - 1)]);
    }
    
    @Test
    public void testGetPivotFirstMixed()
    {
        QuickSorterMedian quickSor1 = new QuickSorterMedian();
        Integer[] arr = {3, 2, 1, 4, 5};
        
        assertEquals(new Integer(3), arr[quickSor1.getPivot(arr, 0, arr.length - 1)]);
    }
    
    @Test
    public void testGetPivotLastMixed()
    {
        QuickSorterMedian quickSor1 = new QuickSorterMedian();
        Integer[] arr = {5, 2, 1, 4, 3};
        
        assertEquals(new Integer(3), arr[quickSor1.getPivot(arr, 0, arr.length - 1)]);
    }
}
