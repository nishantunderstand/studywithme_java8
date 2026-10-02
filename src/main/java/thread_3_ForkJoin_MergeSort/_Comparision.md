Traditional One :
mergeSort(arr, left, mid);
mergeSort(arr, mid + 1, right);
merge(arr, left, mid, right);

Fork/Join :
ForkJoinMergeSort left = new ForkJoinMergeSort(arr, left, mid);
ForkJoinMergeSort right = new ForkJoinMergeSort(arr, mid + 1, right);
invokeAll(left, right);
merge(left, mid, right);


What happens internally?
Traditional:
CPU-1
Left
↓
Right
↓
Merge


Fork/Join:
CPU-1          CPU-2
Left           Right

\            /
\          /
Merge


---


Traditional Merge Sort
----------------------
mergeSort(left)
mergeSort(right)
merge()

One Thread
Sequential Execution

==============================

Fork/Join Merge Sort
--------------------
fork(left)
compute(right)
join(left)
merge()

Multiple Threads
Parallel Execution
Work-Stealing
