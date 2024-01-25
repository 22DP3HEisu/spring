package lv.rvt;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import rvt.Sorter;

public class SorterTest {

    @Test
    public void smallestTest() {
        int[] arr = {2,4,1,8,-2};

        int smallest = Sorter.smallest(arr);

        assertEquals(-2, smallest);
    }

    @Test
    public void IndexOfSmallestTest() {
        int[] arr = {2,4,1,8,-2};

        int smallest = Sorter.IndexOfSmallest(arr);

        assertEquals(4, smallest);
    }

    @Test
    public void IndexOfSmallestFromTest() {
        int[] arr = {-1, 6, 9, 8, 12};

        int smallest = Sorter.IndexOfSmallestFrom(arr, 2);

        assertEquals(3, smallest);
    }

    @Test
    public void SwapTest() {
        int[] arr = {-1, 6, 9, 8, 12};

        Sorter.Swap(arr, 2, 4);

        assertEquals("[-1, 6, 12, 8, 9]", Arrays.toString(arr));
    }

    @Test
    public void SortTest() {
        int[] arr = {5, 7, -1, 4, 10};

        Sorter.Sort(arr);

        assertEquals("[-1, 4, 5, 7, 10]", Arrays.toString(arr));
    }
}
