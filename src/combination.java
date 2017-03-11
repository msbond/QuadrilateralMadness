import java.util.ArrayList;
import java.util.List;

public class combination {
    /* arr[]  ---> Input Array
  data[] ---> Temporary array to store current combination
  start & end ---> Staring and Ending indexes in arr[]
  index  ---> Current index in data[]
  r ---> Size of a combination to be printed */

    private static List<List> result = new ArrayList<List>();

    static void combinationUtil(int arr[], int data[], int start,
                                int end, int index, int r) {

        List<Integer> x = new ArrayList<Integer>();



        // Current combination is ready to be printed, print it
        if (index == r) {
            for (int j = 0; j < r; j++)
                x.add(data[j]);
            result.add(x);
            return;
        }

        // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
            data[index] = arr[i];
            combinationUtil(arr, data, i + 1, end, index + 1, r);
        }


    }


    // The main function that prints all combinations of size r
    // in arr[] of size n. This function mainly uses combinationUtil()
    static List printCombination(int arr[], int n, int r) {
        result.clear();
        // A temporary array to store all combination one by one
        int data[] = new int[r];

        // Print all combination using temprary array 'data[]'
        combinationUtil(arr, data, 0, n - 1, 0, r);
        return result;
    }

}
