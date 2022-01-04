public class Quotient {
    public static void main(String[] args) {
        try {
            int m = Integer.parseInt(args[0]);
            int n = Integer.parseInt(args[1]);
            int quot = m / n;
            System.out.println(quot);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println ("Zu wenig Argumenten");
        } catch (NumberFormatException e) {
            System.out.println ("Beide Argumenten muessen int sein");
        } catch (ArithmeticException e) {
            System.out.println ("Denominator cannot be zero");
        } finally {
            System.out.println ("Done");
        }
    }
}