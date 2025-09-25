public class XeMay {
    private String nhanhieu;
    private String mausac;

    public String getnhanhieu() {
        return nhanhieu;
    }
    public void setnhanhieu(String nhanhieu){
        this.nhanhieu=nhanhieu;
    }
    public String getmausac() {
        return mausac;
    }
    public void setmausac(String mausac){
        this.mausac=mausac;
    }

    // Phương thức hiển thị thông tin
    public void xuatTT() {
        System.out.println("Xe máy: " + nhanhieu + " - Màu: " + mausac);
    }

    // Hàm main để chạy thử
    public static void main(String[] args) {
        XeMay xemay1 = new XeMay();
        xemay1.setnhanhieu("Honda");
        xemay1.setmausac("Do");
        xemay1.xuatTT();
    }
}
