public class bai4 {
    public static void main(String[] args) {
        int a = 45;
        double can = Math.sqrt(a);
        long temp = (long)(can * 1000);

        System.out.println("a = " + a);
        System.out.println("can bac 2 cua a = " + (double)temp/1000);
    }
}
