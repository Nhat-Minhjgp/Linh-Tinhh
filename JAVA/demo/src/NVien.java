import java.util.Calendar;
import java.util.Scanner;

public class NVien extends Nguoi {
    private String maNV;
    private double heSoLuong;
    private int namVaoLam;
    private int soNgayNghi;
    private double luong;
    private static final double LUONG_CO_BAN = 1150;

    // === Constructor không tham số ===
    public NVien() {
        super();
        maNV = "";
        heSoLuong = 0;
        namVaoLam = 0;
        soNgayNghi = 0;
        luong = 0;
    }

    // === Constructor có đầy đủ tham số ===
    public NVien(String cmnd, String hten, String ns, String ma, int nam, double hsl, int nghi) {
        super(cmnd, hten, ns);
        this.maNV = ma;
        this.namVaoLam = nam;
        this.heSoLuong = hsl;
        this.soNgayNghi = nghi;
        tinhLuong();
    }

    // === Tính phụ cấp thâm niên ===
    private double tinhPhuCapThamNien() {
        int namHienTai = Calendar.getInstance().get(Calendar.YEAR);
        int soNamLam = namHienTai - namVaoLam;
        if (soNamLam >= 5) {
            return soNamLam * LUONG_CO_BAN / 100;
        } else {
            return 0;
        }
    }

    // === Xếp loại thi đua ===
    private char xepLoai() {
        if (soNgayNghi <= 1) return 'A';
        else if (soNgayNghi <= 3) return 'B';
        else return 'C';
    }

    // === Tính lương ===
    private void tinhLuong() {
        double heSoThiDua;
        switch (xepLoai()) {
            case 'A': heSoThiDua = 1.0; break;
            case 'B': heSoThiDua = 0.75; break;
            default: heSoThiDua = 0.5; break;
        }
        luong = LUONG_CO_BAN * heSoLuong * heSoThiDua + tinhPhuCapThamNien();
    }

    // === Nhập thông tin nhân viên ===
    @Override
    public void nhap() {
        super.nhap(); // gọi nhập thông tin người
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        maNV = sc.nextLine();
        System.out.print("Nhập năm vào làm: ");
        namVaoLam = sc.nextInt();
        System.out.print("Nhập hệ số lương: ");
        heSoLuong = sc.nextDouble();
        System.out.print("Nhập số ngày nghỉ: ");
        soNgayNghi = sc.nextInt();
        tinhLuong();
    }

    // === Xuất thông tin nhân viên ===
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Mã NV: " + maNV +
                " | Năm vào làm: " + namVaoLam +
                " | HSL: " + heSoLuong +
                " | Ngày nghỉ: " + soNgayNghi +
                " | Loại: " + xepLoai() +
                " | Lương: " + luong);
    }
}
