package Bit_Manipulation;

public class Set_ith_Bit {
    public static void main(String[] args) {
        int n = 6;
        int index = 0;
        System.out.println(solve(n , index));
    }
    public static int solve(int n , int i){
        int mask = 1<<i;
        return (n | mask);
    }
}
