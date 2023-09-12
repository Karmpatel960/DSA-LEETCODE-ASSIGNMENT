public class factorial {

    import java.util.ArrayList;
import java.util.List;
public class Solution {
    public static List<Long> factorialNumbers(long n) {
        ArrayList<Long> resu=new ArrayList<>();
        for(long i=1;i<=n;i++)
        {
            long fact=1;
            fact = factr(i);
            if(fact<=n) 
            {
                resu.add(fact);
            }
            else{
                break;
            }
        }
        return resu;
    }

    static long factr(long n){
     if(n == 0) return 1;
     return n * factr(n - 1);
    }
}
    
}
