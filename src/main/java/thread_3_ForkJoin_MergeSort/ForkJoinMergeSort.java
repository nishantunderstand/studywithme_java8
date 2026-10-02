package thread_3_ForkJoin_MergeSort;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoinMergeSort extends RecursiveAction {

    private final int[] arr;
    private final int left;
    private final int right;

    public ForkJoinMergeSort(int[] arr, int left, int right) {
        this.arr = arr;
        this.left = left;
        this.right = right;
    }

    @Override
    protected void compute() {

        if (left >= right)
            return;

        int mid = (left + right) / 2;

        // Create subtasks
        ForkJoinMergeSort leftTask = new ForkJoinMergeSort(arr, left, mid);
        ForkJoinMergeSort rightTask = new ForkJoinMergeSort(arr, mid + 1, right);

        // Execute both in parallel
        invokeAll(leftTask, rightTask);

        // Merge the sorted halves
        merge(left, mid, right);
    }

    private void merge(int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= mid)
            temp[k++] = arr[i++];

        while (j <= right)
            temp[k++] = arr[j++];

        for (int x = 0; x < temp.length; x++)
            arr[left + x] = temp[x];
    }

    public static void main(String[] args) {

        int[] arr = {9, 5, 2, 8, 1, 6, 3, 7, 4};

        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(new ForkJoinMergeSort(arr, 0, arr.length - 1));
        System.out.println(Arrays.toString(arr));
    }
}