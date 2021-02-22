package dsaLab.recursion;

public class RecursionEx {
    public static void main(String[] args) {
        int n = 100;
        recursion(n);
    }
    public static void recursion(int n){
        if(n == 0) {
            return;
        }
        recursion(n-1);
        System.out.println(n);
    }
}
