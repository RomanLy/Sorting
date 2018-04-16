package sort;

public class MergeSort implements Sort {
    private int[] array;
    private int[] temp;

    private int size;
    @Override
    public int[] sort(int[] array) {

        this.array = array;
        size = array.length;
        this.temp = new int[size];
        mergesort(0, size - 1);
        return array;
    }

    private void mergesort(int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;

            mergesort(low, middle);
            mergesort(middle + 1, high);
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {

        for (int i = low; i <= high; i++) {
            temp[i] = array[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;

        while (i <= middle && j <= high) {
            if (temp[i] <= temp[j]) {
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = temp[i];
            k++;
            i++;
        }
    }
}
