package Utilities;

import java.util.*;

public class MergeSort {

    public int a[];
    
    
    public MergeSort(int[] arr){
        a = arr;
        int num, i;
        num = 50000;
        merge_sort(1, num);
    }

    public void merge_sort(int low, int high) {
        int mid;
        if (low < high) {
            mid = (low + high) / 2;
            merge_sort(low, mid);
            merge_sort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    public void merge(int low, int mid, int high) {
        int h, i, j, k;
        int b[] = new int[50000];
        h = low;
        i = low;
        j = mid + 1;

        while ((h <= mid) && (j <= high)) {
            if (a[h] <= a[j]) {
                b[i] = a[h];
                h++;
            } else {
                b[i] = a[j];
                j++;
            }
            i++;
        }
        if (h > mid) {
            for (k = j; k <= high; k++) {
                b[i] = a[k];
                i++;
            }
        } else {
            for (k = h; k <= mid; k++) {
                b[i] = a[k];
                i++;
            }
        }
        for (k = low; k <= high; k++) {
            a[k] = b[k];
        }
    }
}
