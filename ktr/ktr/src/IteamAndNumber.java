public class IteamAndNumber {
    private Iteam iteam;
    private int number;

    public Iteam getIteam() {
        return iteam;
    }

    public void setIteam(Iteam iteam) {
        this.iteam = iteam;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "IteamAndNumber{" +
                "iteam=" + iteam +
                ", number=" + number +
                '}';
    }
}
