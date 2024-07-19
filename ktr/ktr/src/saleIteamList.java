import java.util.Arrays;

public class saleIteamList {
    private Staff staff;
    private IteamAndNumber[] numbers;

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public IteamAndNumber[] getNumbers() {
        return numbers;
    }

    public void setNumbers(IteamAndNumber[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "saleIteamList{" +
                "staff=" + staff +
                ", numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
