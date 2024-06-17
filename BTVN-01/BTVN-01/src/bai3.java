public class bai3 {
    public static void main(String[] args) {
        int a = 9, b = 5, c =10, d = 15;
        int x = Math.max(a,b);
        int s = Math.max(x,c);

        System.out.println("a = 9" );
        System.out.println("b = 5" );
        System.out.println("c = 10" );
        System.out.println("d = 15");
        System.out.println("so lon nhat = " + Math.max(s,d));
    }
}
