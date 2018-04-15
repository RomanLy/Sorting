import array.Array;
import search.MinSearch;
import search.Search;
import sort.BubbleSort;
import sort.MergeSort;
import sort.Sort;

public class Main {
    public static void main(String[] args) {

        Array arr = new Array();
        arr.fill(arr.create(10));
        arr.print(arr.array);

        Sort bsort = new BubbleSort();
        bsort.sort(arr.array);
        System.out.println();
        arr.print(arr.array);

        Search minSearch = new MinSearch();
        System.out.println("\nMin is: " + minSearch.search(arr.array));

//        Sort msort = new MergeSort();
//        System.out.println(msort.sort(arr.array));

    }
}
