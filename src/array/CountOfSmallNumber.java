package array;

import java.util.Arrays;
import java.util.List;

public class CountOfSmallNumber {
    public static void main(String[] args) {
        int arr[] = { 15, 2, 4, 5, 8, 10 };
        int key = 11;
        int n = arr.length;
        System.out.print(countOfElements(arr, n, key));
    };

    // Simple linear traversal for counting
    static int countOfElements(int arr[], int n, int key)
    {
        // here the index is used as count

        // declared a variable to count
        int i = 0;
        //Sorting the array
        Arrays.sort(arr);

        for (i = 0; i < n; i++) {

            // break when find
            // greater element
            if (arr[i] > key)
                break;
        }

        // return the count
        return i;
    }
}
