import java.util.Scanner;

public class Nguoi {
    protected String cmnd;
    protected String hten;
    protected String ns;

    public Nguoi() {
        cmnd = "";
        hten = "";
        ns = "";
    }

    public Nguoi(String cmnd, String hten, String ns) {
        this.cmnd = cmnd;
        this.hten = hten;
        this.ns = ns;
    }

    // === Nhập thông tin người ===
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hten = sc.nextLine();
        System.out.print("Nhập CMND: ");
        cmnd = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        ns = sc.nextLine();
    }

    // === Xuất thông tin người ===
    public void xuat() {
        System.out.println("Họ tên: " + hten + " | CMND: " + cmnd + " | Ngày sinh: " + ns);
    }
}
