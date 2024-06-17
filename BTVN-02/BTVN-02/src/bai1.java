import java.util.Scanner;

public class bai1 {
    public static void main(String[] arg){
        System.out.println("ax + b = 0, tim x ");
        System.out.println(" nhap so a: ");
        int a = new Scanner(System.in).nextInt();
        if (a == 0){
            System.out.println(" nhập b: ");
            int b = new Scanner(System.in).nextInt();
            String s = (a == b)?"nghiệm đúng với mọi x":"x vô nghiệm";
            System.out.println(s);
            return;
        }
        System.out.println(" nhap so b: ");
        double b = new Scanner(System.in).nextInt();
        double c = -b/a;
        System.out.println("x = " + c);

    }
}


