package array;

import java.util.HashMap;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 4, 2, 1, 5 };

        int n = arr.length;
        remove(arr, n);
    }

    static void remove(int[] a, int n) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            // print element if it is not
            // in the hash map and Insert
            // the element in the hash map
            if (map.get(a[i]) == null)
            {
                System.out.print(a[i] + " ");
                map.put(a[i], true);
            }
        }
    }
}
