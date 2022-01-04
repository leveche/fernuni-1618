public class AhA5 {
    static int n = 10;
    public static void main(String[] args) {
        int[][] arr = new int[n][];
        for (int i=0; i < n; i++) {
            int[] tmp = new int[i+1];
            for (int j=0; j <= i; j++) {
                tmp[j] = j;
            }
            arr[i] = tmp;
        }

        for (int[] m : arr) {
            for (int n : m) {
                System.out.print(n + " ");
                // this prints an extra ' ' at the end of each line
                // but I'm not setting up an if statement just to fix that.
            }
            System.out.println("");
        }
    }
}