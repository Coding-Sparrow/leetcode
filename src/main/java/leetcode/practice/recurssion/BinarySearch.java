package leetcode.practice.recurssion;

public class BinarySearch {
    public static void main(String[] args) {
        boolean found = binarySearch(new int[]{1,4,6,8,12,15,45}, 0, 7,2);
        System.out.println("found : " + found);
    }

    public static boolean binarySearch(int[] arr, int left, int right, int target) {
        if(left > right) {
            return false;
        }
        int mid = (left + right) /2;

        if(arr[mid] == target) {
            return true;
        }

        if(arr[mid] < target) {
            return binarySearch(arr, mid+1, right, target);
        } else {
            return binarySearch(arr, left, mid-1, target);
        }
    }
}   
