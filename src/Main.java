import array.Array;
import search.AverageSearch;
import search.MaxSearch;
import search.MinSearch;
import search.Search;
import sort.BubbleSort;
import sort.MergeSort;
import sort.QuickSort;
import sort.Sort;

public class Main {
    public static void main(String[] args) {

        Array arr = new Array();
        arr.fill(arr.create(100));
        arr.print(arr.array);

        Sort bsort = new BubbleSort();
        bsort.sort(arr.array);
        System.out.println();
        arr.print(arr.array);

//        Sort msort = new MergeSort();
//        msort.sort(arr.array);
//        System.out.println();
//        arr.print(arr.array);

//        Sort qsort = new QuickSort();
//        qsort.sort(arr.array);
//        System.out.println();
//        arr.print(arr.array);


        Search minSearch = new MinSearch();
        System.out.print("\nMin is: " + minSearch.search(arr.array));
        Search maxSearch = new MaxSearch();
        System.out.print("\nMax is: " + maxSearch.search(arr.array));
        Search averageSearchSearch = new AverageSearch();
        System.out.println("\nAverage is: " + averageSearchSearch.search(arr.array));

    }
}
