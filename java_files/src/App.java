import java.util.Scanner;
import java.util.*;
public class App {
    public static int kthGrammar(int n, int k) {
        if(n==1&&k==1) return 0;
        if(k>Math.pow(2,n-2)){
          return anti(kthGrammar(n,k-(int)Math.pow(2,n-2)));
        }
        return kthGrammar(n-1,k);
      }
    
      public static int anti(int a){
        return a==1?0:1;
      }
    public static void main(String[] args) {
        System.out.println(kthGrammar(3,3));
    
    }
}
