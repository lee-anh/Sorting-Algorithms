import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class IntArrayGeneratorTest.
 *
 * @author  Claire Liu, Renee Soika, Yuqi Wang
 * @version October 6, 2020
 */
public class IntArrayGeneratorTest
{
    /**
     * Default constructor for test class IntArrayGeneratorTest
     */
    public IntArrayGeneratorTest()
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
    public void testGenDescending()
    {
        IntArrayGenerator genDe1 = new IntArrayGenerator();

        Integer[] expected = {10,9,8,7,6,5,4,3,2,1};

        assertArrayEquals(expected, genDe1.genDescending(10));

    }
    
    @Test
    public void testGenAscending()
    {
        IntArrayGenerator genAsc1 = new IntArrayGenerator();

        Integer[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        assertArrayEquals(expected, genAsc1.genAscending(10));

    }
    
    @Test
    public void testGenPercentSorted()
    {
        IntArrayGenerator genPer1 = new IntArrayGenerator(6202002);

        Integer[] expected = {1, 2, 3, 4, 5, 6, 86953013, 8, -866113363, 10};

        assertArrayEquals(expected, genPer1.genPercentSorted(10, 90));

    }
    
    @Test
    public void testGenRandom()
    {
        IntArrayGenerator genRan1 = new IntArrayGenerator(6202002);

        Integer[] expected = {-2051294984, -40301154, 10369570, -1542731254, 1863481069, 1815006598, 1384602658, -31257525, 340872096, 339183964};

        assertArrayEquals(expected, genRan1.genRandom(10));

    }
    
    @Test
    public void testGenDuplicates()
    {
        IntArrayGenerator genDup1 = new IntArrayGenerator(6202002);

        Integer[] expected = {19, 8, 23, 15, 12, 17, 44, 9, 15, 50, 8, 44, 8, 
            27, 26, 46, 22, 18, 29, 1, 22, 47, 7, 3, 2, 21, 26, 38, 16, 43, 
            49, 24, 14, 9, 20, 24, 28, 39, 21, 1, 46, 19, 20, 29, 31, 27, 19, 
            37, 36, 10, 47, 24, 15, 42, 46, 12, 34, 42, 49, 21, 34, 24, 32, 
            21, 19, 13, 36, 7, 42, 49, 9, 27, 17, 13, 7, 20, 32, 47, 22, 39, 
            40, 0, 18, 2, 9, 9, 12, 27, 29, 13, 37, 47, 42, 42, 46, 27, 27, 
            25, 49, 44, 43, 36, 49, 43, 10, 24, 20, 10, 23, 20, 24, 5, 41, 46, 
            2, 5, 30, 34, 17, 28, 32, 8, 0, 29, 21, 9, 28, 20, 9, 35, 4, 22, 
            42, 47, 30, 23, 18, 7, 41, 9, 43, 1, 29, 14, 28, 40, 21, 37, 16, 
            36, 49, 32, 3, 2, 44, 40, 29, 12, 25, 40, 32, 2, 46, 6, 6, 28, 4, 
            13, 23, 35, 20, 16, 36, 15, 15, 10, 37, 35, 27, 10, 18, 38, 50, 
            4, 15, 45, 50, 28, 22, 12, 33, 31, 46, 17, 39, 10, 31, 17, 5, 1};

        assertArrayEquals(expected, genDup1.genDuplicates(200));

    }
}
