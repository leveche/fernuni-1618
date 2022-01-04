public class FacultaetFor {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        long result = 1;
        for (int i = 2; i<=n; i++) {
            result = result * i;
        }
    System.out.println(result);
    }
}