import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class InsertionSorterTest.
 *
 * @author  Claire Liu, Renee Soika, Yuqi Wang
 * @version October 6, 2020
 */
public class InsertionSorterTest
{
    /**
     * Default constructor for test class InsertionSorterTest
     */
    public InsertionSorterTest()
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
        InsertionSorter insertion1 = new InsertionSorter();
        Integer[] arr = new Integer[0];
        
        insertion1.sort(arr);
        
        assertArrayEquals(new Integer[0], arr);
    }
    
    @Test
    public void testSortPopulatedUnique()
    {
        InsertionSorter insertion1 = new InsertionSorter();
        Integer[] arr = {4, 8, 2, 3, 10, 1, 9, 7, 6, 5};
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        insertion1.sort(arr);
        
        assertArrayEquals(expected, arr);
    }
    
    @Test
    public void testSortPopulatedDuplicates()
    {
        InsertionSorter insertion1 = new InsertionSorter();
        Integer[] arr = {4, 9, 1, 3, 10, 1, 9, 7, 6, 4};
        Integer[] expected = {1, 1, 3, 4, 4, 6, 7, 9, 9, 10};
        
        insertion1.sort(arr);
        
        assertArrayEquals(expected, arr);
    }
    
    @Test
    public void testSortBestCase()
    {
        InsertionSorter insertion1 = new InsertionSorter();
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        insertion1.sort(arr);
        
        assertArrayEquals(expected, arr);
    }
    
    @Test
    public void testSortWorstCase()
    {
        InsertionSorter insertion1 = new InsertionSorter();
        Integer[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        insertion1.sort(arr);
        
        assertArrayEquals(expected, arr);
    }
}
