package lv.rvt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import rvt.Searcher;
import rvt.Sorter;

public class SearcherTest {
    @Test
    public void BinarySearchTest() {
        int[] arr = {2,4,1,8,-2};

        int num = Searcher.BinarySearch(arr, 2);

        assertEquals(2, num);
    }
}
