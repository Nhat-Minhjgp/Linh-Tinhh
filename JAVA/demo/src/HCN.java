import java.util.*;

public class HCN {
    private double chieuDai;
    private double chieuRong;

    // Constructor mặc định
    public HCN() {
        this.chieuDai = 1;
        this.chieuRong = 1;
    }

    // Constructor có tham số
    public HCN(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() { return chieuDai; }
    public void setChieuDai(double chieuDai) { this.chieuDai = chieuDai; }

    public double getChieuRong() { return chieuRong; }
    public void setChieuRong(double chieuRong) { this.chieuRong = chieuRong; }

    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
    
    // Nếu vẫn muốn nhập từ bàn phím, có thể giữ
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        chieuDai = sc.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        chieuRong = sc.nextDouble();
        // Không đóng sc ở đây nếu còn nhập ở nơi khác
    }
}
