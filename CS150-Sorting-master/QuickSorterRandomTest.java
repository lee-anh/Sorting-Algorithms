import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class QuickSorterRandomTest.
 *
 * @author  Claire Liu, Renee Soika, Yuqi Wang
 * @version October 6, 2020
 */
public class QuickSorterRandomTest
{
    /**
     * Default constructor for test class QuickSorterRandomTest
     */
    public QuickSorterRandomTest()
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
        QuickSorterRandom quickSor1 = new QuickSorterRandom();
        Integer[] arr = new Integer[0];
        
        quickSor1.sort(arr);
        
        assertArrayEquals(new Integer[0], arr);
    }
    
    @Test
    public void testSortPopulatedUnique()
    {
        QuickSorterRandom quickSor1 = new QuickSorterRandom();
        Integer[] arr = {4, 8, 2, 3, 10, 1, 9, 7, 6, 5};
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        quickSor1.sort(arr);
        
        assertArrayEquals(expected, arr);
    }
    
    @Test
    public void testSortPopulatedDuplicates()
    {
        QuickSorterRandom quickSor1 = new QuickSorterRandom();
        Integer[] arr = {4, 9, 1, 3, 10, 1, 9, 7, 6, 4};
        Integer[] expected = {1, 1, 3, 4, 4, 6, 7, 9, 9, 10};
        
        quickSor1.sort(arr);
        
        assertArrayEquals(expected, arr);
    }
    
    @Test
    public void testSortBestCase()
    {
        QuickSorterRandom quickSor1 = new QuickSorterRandom();
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        quickSor1.sort(arr);
        
        assertArrayEquals(expected, arr);
    }
    
    @Test
    public void testSortWorstCase()
    {
        QuickSorterRandom quickSor1 = new QuickSorterRandom();
        Integer[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        quickSor1.sort(arr);
        
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testGetPivot()
    {
        QuickSorterRandom quickSor1 = new QuickSorterRandom(6202002);
        Integer[] arr = {5, 4, 3, 2, 1};
        
        assertEquals(1, quickSor1.getPivot(arr, 0, arr.length - 1));
    }
}
