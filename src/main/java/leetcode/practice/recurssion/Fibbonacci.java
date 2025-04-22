package leetcode.practice.recurssion;

public class Fibbonacci {
    public static void main(String[] args) {
        int result = fibbonacci(6);
        System.out.println(result);
    }

    public static int fibbonacci(int n) {
        if(n == 0 || n == 1) return n;
        return fibbonacci(n-1) + fibbonacci(n-2);
    }
}
