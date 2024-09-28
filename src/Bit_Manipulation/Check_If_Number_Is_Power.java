package Bit_Manipulation;

public class Check_If_Number_Is_Power {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(solve(n));
    }
    public static boolean solve(int n){
        return (n > 0) && ((n & (n-1)) == 0);

    }

}
