public enum IteamType {
    DT("Điện Tử"),
    DL("Điện Lạnh"),
    MT("Máy Tính"),
    TBVP("Thiết Bị văn phòng");

    public String value;

    public String getValue() {
        return value;
    }

    IteamType(String value) {
        this.value = value;
    }
}
