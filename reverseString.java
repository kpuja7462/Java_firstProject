import java.util.*;
public class reverseString{
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    String x = sc.next();
     
        StringBuilder reversed = new StringBuilder(x).reverse();
        System.out.println(reversed);
        
    }
}