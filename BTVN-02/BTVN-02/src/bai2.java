import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {


   System.out.println("Giải và biện luận phương trình bậc hai ax2 + bx + c =0");
    Scanner ptbh = new Scanner(System.in);
        System.out.println("Nhập a");
    float a1 = ptbh.nextFloat();
        System.out.println("Nhập b");
    float b1 = ptbh.nextFloat();
        System.out.println("Nhập c");
    float c1 = ptbh.nextFloat();
        if (a1 == 0) {
        System.out.println("Giải và biện luận phương trình bậc nhất bx + c = 0");
        if (b1 != 0) {
            System.out.println("Phương trình có nghiệm duy nhất " + (-c1) / b1);
        } else { //b1==0
            if (c1 != 0) {
                System.out.println("Phương trình vô nghiệm");
            } else {
                System.out.println("Phương trình có nghiệm đúng với mọi x");
            }
        }
    } else { // a1!=0
        float delta = b1 * b1 - 4 * (a1 * c1);
        if (delta>0) {
            System.out.println("Phương trình có 2 nghiệm phân biệt là x1 = " + ((-b1) + Math.sqrt(delta))/(a1*2));
            System.out.println(" x2 = " + ((-b1) - Math.sqrt(delta))/(a1*2));
        }
        if (delta == 0) {
            System.out.println("Phương trình có 1 nghiệm kép là x = " + (-b1)/(a1*2) );
        }
        if (delta < 0) {
            System.out.println("Phương trình vô nghĩa");  }}
}
}
