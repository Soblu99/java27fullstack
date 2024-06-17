import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
System.out.println("Chu vi và diện tích của hình chữ nhật");
        Scanner x = new Scanner(System.in);
        System.out.println("Chiều dài = ");
        double a = x.nextInt();
        Scanner y = new Scanner(System.in);
        System.out.println("Chiều rộng = ");
        double b = y.nextInt();
        double chuVi = (a + b)*2;
        double dienTich = a * b ;
        System.out.println("Chu vi hinh chu nhat = " + chuVi);
        System.out.println("Diện tích hinh chu nhat = " + dienTich);


    }
}
