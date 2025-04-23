package leetcode.practice.recurssion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = new int[]{-5,20,10,3,2,0};
        mergeSort(arr, 0, arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int temp[] = new int[end-start+1];
        int i = start, j = mid + 1, k = 0;

        while(i <= mid && j <= end) {
            if(arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        
        while(i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j <= end) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for(i = start;i<=end;i++) {
            arr[i] = temp[i-start];
        }
    }
}
