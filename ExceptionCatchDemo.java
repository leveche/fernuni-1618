public class ExceptionCatchDemo {
    public static void main(String[] args){
        String str = "007L"; // can't be cast to int
        int m;
        try {
            m = Integer.parseInt(str);
        } catch(NumberFormatException e) {
            System.out.println(str + " kein int");
            m = 0;
        }
        System.out.println(m);
    }
}