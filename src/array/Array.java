package array;

public class Array {

    public int[] array;

    public int[] create(int size){
        this.array = new int[size];
        return array;
    }

    public int[] fill(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.round(Math.random()*100));
        }
        return array;
    }

    public void print(int[] array){
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
