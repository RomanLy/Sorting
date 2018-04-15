package search;

public class AverageSearch implements Search{

    @Override
    public int search(int[] array) {
        int temp = 0;
        int size = array.length;

        for (int i = 0; i <size ; i++) {
            temp += array[i];
        }
        return temp / size;
    }
}