package sort;

import java.util.Arrays;

public class MergeSort implements Sort {
    @Override
    public int[] sort(int[] ar) {

        if (ar.length < 2) return ar;

        int mid = ar.length / 2;

        int[] left = Arrays.copyOfRange(ar, 0, mid);
        int[] right = Arrays.copyOfRange(ar, mid, ar.length);

        return merge(sort(left), sort(right));
    }

    public static int[] merge(int[] left, int[] right){

        int length = left.length + right.length;
        int[] m = new int[length];

        int leftIndex = 0, rightIndex = 0;

        for (int i = 0; i < m.length; i++) {
            if (leftIndex == left.length) m[i] = right[rightIndex++];
            else if (rightIndex == right.length) m[i] = left[leftIndex++];
            else if (left[leftIndex] < right[rightIndex]) m[i] = left[leftIndex++];
            else m[i] = right[rightIndex++];
        }
        return m;
    }
}
