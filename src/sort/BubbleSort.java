package sort;

public class BubbleSort implements Sort {
    @Override
    public int[] sort(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if(array[i] < array[j]){
                    int temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
        return array;
    }
}
