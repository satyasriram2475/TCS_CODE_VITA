package Bit_Manipulation;

public class Binary_to_Decimal {
    public static void main(String[] args) {
        // when the binary is given as the integer
//        int n = 11;
//        int count =0;
//        int dec =0;
//        while(n>0){
//            int res = n%10;
//            n =n/10;
//            if(res == 0){
//                count++;
//            }
//            else {
//                dec += Math.pow(2,count);
//                count++;
//            }
//        }
//        System.out.println(dec);
        String binary = "1111";        // when the binary is given as the string
        int dec = 0;
        int n = binary.length();
        for(int i = 0; i<n; i++){
            char ch = binary.charAt(n-i-1);
            if(ch == '1'){
                dec+= (int)(Math.pow(2,i));
            }
        }
        System.out.println(dec);

    }
}
