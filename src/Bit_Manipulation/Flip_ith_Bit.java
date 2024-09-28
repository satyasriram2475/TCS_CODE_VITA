package Bit_Manipulation;

public class Flip_ith_Bit {
    public static void main(String[] args) {
        int n = 13;
        int index = 2;
        System.out.println(solve(n,index));
    }
    public static int solve(int n, int i){
        int mask = 1<<i;
        return (n^(mask));
    }
}
