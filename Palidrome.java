public class Palidrome {
    public static void main(String args[]){
        String str = "Puja";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversed));
    }
    
}
