public class bai5 {
    public static void main(String[] args) {
        int a = 123, b = 23;
        double x =(double) a / b;
        long temp = (int)(x * 1000);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Thương của a và b = " + (double)temp/1000);
    }
}
