package Bit_Manipulation;

public class Decimal_to_Binary {
    public static void main(String[] args) {
        int n  = 8;
        System.out.println(solve(n));
    }
    public static String solve(int n){
        StringBuilder sb = new StringBuilder();
        while(n>0){
            int res = n%2;
            n = n/2;
            sb.append(res);
        }
        sb.reverse();
        return sb.toString();
    }
}
