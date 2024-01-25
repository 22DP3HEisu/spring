package rvt;

import java.util.Arrays;

public class Sorter {
    public static int smallest(int[] arr) {
        int SmallestInt = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < SmallestInt) {
                SmallestInt = arr[i];
            }
        }
        return SmallestInt;
    }

    public static int IndexOfSmallest(int[] arr) {
        int SmallestInt = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < SmallestInt) {
                SmallestInt = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static int IndexOfSmallestFrom(int[] arr, int From) {
        int SmallestInt = arr[From];
        int index = From;
        for (int i = From; i < arr.length; i++) {
            if (arr[i] < SmallestInt) {
                SmallestInt = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void Swap(int[] arr, int Index1, int Index2) {
        int Value1 = arr[Index1];
        int Value2 = arr[Index2];

        arr[Index1] = Value2;
        arr[Index2] = Value1;
    }

    public static void Sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = IndexOfSmallestFrom(arr, i);
            Swap(arr, i, j);
        }
    }
}
