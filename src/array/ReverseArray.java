package array;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

    /**
    //simple method
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};

        // Swap elements from start to end
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i]  = temp;
        }

        System.out.println("" + Arrays.toString(a));
    }

     **/

    /**
     * Other ways to reverse an Array
     */
    /**
    static void reverse(int a[], int n) {
        int b[] = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j-1] = a[i];
            j = j-1;
        }

        // printing the reversed array

        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }

    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        reverse(arr, arr.length);
    }

     **/
    static void reverse(Integer a[]) {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }

    public static void main(String[] args) {
        Integer [] arr = {1, 2, 3, 4, 5};
        reverse(arr);
    }
}
