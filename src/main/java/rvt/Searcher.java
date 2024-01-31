package rvt;

public class Searcher {
    public static int LinearSearch(int[] arr, int searched) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searched) {
                return arr[i];
            }
        }
        
        return -1;
    }

    public static int BinarySearch(int[] arr, int searched) {
        Sorter.Sort(arr);

        int start = 0;
        int end = arr.length - 1;

        while (end >= start) {
            int middle = (end + start) / 2;

            if (arr[middle] == searched) {
                return arr[middle];
            } else if (arr[middle] < searched) {
                start = middle + 1;
            } else if (arr[middle] > searched) {
                end = middle - 1;
            }
        }

        return -1;
    }
}
