package thread_3_ForkJoin_MergeSort;

import java.util.Arrays;

public class TraditionalMergeSort {

    public static void mergeSort(int[] arr, int left, int right) {

        if (left >= right)
            return;

        int mid = (left + right) / 2;

        // Sort left half
        mergeSort(arr, left, mid);

        // Sort right half
        mergeSort(arr, mid + 1, right);

        // Merge both halves
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy back to original array
        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
    }

    public static void main(String[] args) {

        int[] arr = {9, 5, 2, 8, 1, 6, 3, 7, 4};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}