package Bit_Manipulation;

public class Check_If_ith_bit_is_set {
    public static void main(String[] args) {
        int n = 7;
        int index = 0;
        System.out.println(Set(n,index));
    }
    public static boolean Set(int n , int index){
        int mask = 1<<index;
        return (n & mask)!= 0;
    }
}
