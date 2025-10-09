public class Main {
    public static void main(String[] args) {
        NVien nv = new NVien();
        System.out.println("--- Nhập thông tin nhân viên ---");
        nv.nhap();

        System.out.println("\n--- Thông tin nhân viên ---");
        nv.xuat();
    }
}
