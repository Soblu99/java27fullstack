import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Staff extends Person{
    private static int AUTO_ID = 1000;
    private int id;
    private LocalDate date;

    public Staff() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }


    public int getId() {
        return id;
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", date=" + date +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void inputInfor(){
        System.out.println("Nhập họ và tên");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập địa chỉ");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.println("Nhập số điện thoại");
        this.setPhone(new Scanner(System.in).nextLine());
        System.out.println("Nhập ngày ký hợp đồng ");
        String DATE = new Scanner(System.in).nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        this.setDate(LocalDate.parse(DATE, formatter));





    }
}
