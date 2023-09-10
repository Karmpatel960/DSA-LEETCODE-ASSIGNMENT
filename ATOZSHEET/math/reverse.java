class Solution {
    public int reverse(int x) {
     long reverseint =0;
     while(x != 0){
         int ld = x % 10;
         reverseint +=ld;
         reverseint  = (reverseint * 10);
         x = x / 10;
     }
     reverseint = reverseint /10;
     if(reverseint > Integer.MAX_VALUE || reverseint < Integer.MIN_VALUE){
         return 0;
     }
     if(x<0){
         return (int) (-1*reverseint);
     }

     return (int) reverseint;
    }
}