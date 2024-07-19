import java.util.Scanner;

public class Iteam {
    private static int AUTO_ID = 1000;
    private int id;
    private String name;
    private IteamType iteamType;
    private float price;
    private int number;

    public Iteam() {
        this.id = AUTO_ID;
        AUTO_ID++;

    }



    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IteamType getIteamType() {
        return iteamType;
    }

    public void setIteamType(IteamType iteamType) {
        this.iteamType = iteamType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Iteam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", iteamType=" + iteamType.getValue() +
                ", price=" + price +
                ", number=" + number +
                '}';
    }

    public void inputInfor(){
        System.out.println("Nhập tên mặt hàng: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập giá bán: ");
        this.setPrice(new Scanner(System.in).nextFloat());
        System.out.println("Nhập số lượng mặt hàng");
        this.setNumber(new Scanner(System.in).nextInt());
        System.out.println("Lựa chọn nhóm hàng:");
        System.out.println("1. Điện Tử");
        System.out.println("2. Điện Lạnh");
        System.out.println("3. Máy Tính");
        System.out.println("4. Thiết Bị Văn Phòng");
        int Type;
        while (true){
            Type = new Scanner(System.in).nextInt();
            if (Type>=1 || Type<=4) {
                break;
            }
            System.out.println("Vui Lòng Chọn Lại");
        }
        switch (Type){
            case 1:
                this.setIteamType(IteamType.DT);
                break;
            case 2:
                this.setIteamType(IteamType.DL);
                break;
            case 3:
                this.setIteamType(IteamType.MT);
                break;
            case 4:
                this.setIteamType(IteamType.TBVP);
                break;
        }

    }
}
