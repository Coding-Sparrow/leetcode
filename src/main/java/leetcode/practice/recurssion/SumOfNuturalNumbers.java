package leetcode.practice.recurssion;

public class SumOfNuturalNumbers {

    public static int recursiveSum(int n) {
        if(n == 0) {
            return n;
        }
        return n + recursiveSum(n-1);
    }

    public static void main(String[] args) {
        int SumOfNuturalNumbers = recursiveSum(10);
        System.out.println(SumOfNuturalNumbers);
    }
       
}