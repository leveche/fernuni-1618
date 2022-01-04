public class ThrowDemo {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        if (n > 20) throw new IllegalArgumentException(); // n too large
    }
}