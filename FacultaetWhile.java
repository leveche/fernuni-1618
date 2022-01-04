public class FacultaetWhile {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        long result = 1;
        int i = 2;
        while(i <= n) {
            result = result * i;
            i++;
        }
    System.out.println(result);
    }
}