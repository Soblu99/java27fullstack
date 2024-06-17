import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        System.out.println("Tính tuổi ");
        Scanner x = new Scanner(System.in);
        System.out.println(" Ngày Tháng Năm ");
        String line = x.nextLine();
        LocalDate now = LocalDate.now();
        int yearnow = now.getYear();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime orn = LocalDateTime.parse(line, formatter);
        int yearborn = orn.getYear();
        int tuoi = yearnow - yearborn;
        System.out.println("số tuổi của bạn là: " );



    }
}
