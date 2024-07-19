import java.util.Scanner;

public class Main {

    private static Iteam[] iteams = new Iteam[0];
    private static Staff[] staffs = new Staff[0];
    public static void main(String[] args) {
       menu();
    }

    private static void menu() {
        while (true) {
            printMenuOption();
            System.out.println("Xin mời chọn chức năng");
            int functionchoice;
             while (true){
                 functionchoice = new Scanner(System.in).nextInt();
                 if (functionchoice >= 1 || functionchoice <= 8){
                     break;
                 }
                 System.out.println("Lựa chọn không hợp lệ");
             }
            switch (functionchoice) {
                case 1:
                    inputNewIteam();
                    break;
                case 2:
                    printIteams();
                    break;
                case 3:
                    inputNewStaff();
                    break;
                case 4:
                    printStaff();
                    break;
                case 5:
                    createIteamAndStaff();
                    break;
                case 6:
                    System.out.println("vao chuc nang 6");
                    break;
                case 7:
                    System.out.println("vao chuc nang 7");
                    break;
                case 8:
                    return;
            }
        }
    }

    private static void printIteams() {
        for (int i = 0; i < iteams.length; i++){
            if (iteams[i] == null){
                continue;
            }
            System.out.println(iteams[i]);
        }
    }

    private static void inputNewStaff() {
        System.out.println("Nhập số lượng nhân viên muốn thêm:");
        int staffNumber = new Scanner(System.in).nextInt();
        for (int i =0; i < staffNumber; i++){
            System.out.println("Nhập thông tin nhân viên thứ " + (i+1) );
            Staff staff = new Staff();
            staff.inputInfor();
            saveStaff(staff);

        }
    }
    private static void saveStaff(Staff staff) {
        for (int j = 0; j < staffs.length; j++){
            if (staffs[j] == null) {
                staffs[j] = staff;
                break;
            }
        }

    }


    private static void printMenuOption() {
        System.out.println("====PHẦN MỀM QUẢN LÝ MẶT HÀNG VÀ NHÂN VIÊN====");
        System.out.println("1. Nhập mặt hàng mới.");
        System.out.println("2. Danh sách các mặt hàng đã có.");
        System.out.println("3. Đăng ký tài khoản cho nhân viên mới.");
        System.out.println("4. Hiển thị các nhân viên đã có.");
        System.out.println("5. Lập bảng danh sách bán hàng cho từng nhân viên.");
        System.out.println("6. Sắp xếp danh sách Bảng danh sách bán hàng.");
        System.out.println("7. Lập bảng kê doanh thu cho mỗi nhân viên.");
        System.out.println("8. THoát");
    }

    private static void inputNewIteam(){
        System.out.println("Nhập số lượng mặt hàng muốn thêm mới ");
        int iteamNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < iteamNumber; i++){
            System.out.println("Nhập thông tin cho mặt hàng" + (i + 1));
            Iteam iteam = new Iteam();
            iteam.inputInfor();
            for (int j = 0; j < iteams.length; j++){
                if (iteams[j] == null) {
                    iteams[j] = iteam;
                    break;
                }
            }
        }
    }

    private static void printStaff() {
        for (int i = 0; i < staffs.length; i++){
            if (staffs[i] == null){
                continue;
            }
            System.out.println(staffs[i]);
        }
    }

    private static void createIteamAndStaff() {
        System.out.println("Có bao nhiêu nhân viên bán hàng");
        int staffNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i <staffNumber;i++) {
            System.out.println("Nhập thông tin id của nhân viên thứ " + (i + 1));
            Staff staff = null;
            while (true) {

                int staffId = new Scanner(System.in).nextInt();
                for (int j = 0; j < staffs.length; j++) {
                    if (staffs[j] != null && staffId == staffs[j].getId()) {
                        staff = staffs[j];
                        break;
                    }
                }
                if (staff != null) {
                    break;
                }
                System.out.println("Không có nhân viên mang id này. Vui lòng nhập lại.");
            }
            

        }

    }

}
