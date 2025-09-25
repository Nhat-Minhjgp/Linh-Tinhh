import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dai, rong;

        // Nhập chiều dài > 0
        do {
            System.out.print("Nhập chiều dài (>0): ");
            dai = sc.nextDouble();
            if (dai <= 0) {
                System.out.println("Chiều dài phải > 0, nhập lạiI!");
            }
        } while (dai <= 0);

        // Nhập chiều rộng > 0
        do {
            System.out.print("Nhập chiều rộng (>0): ");
            rong = sc.nextDouble();
            if (rong <= 0) {
                System.out.println("Chiều rộng phải > 0, nhập lại!");
            }
        } while (rong <= 0);

        HCN h = new HCN(dai, rong);
        System.out.println("Chu vi: " + h.tinhChuVi());
        System.out.println("Diện tích: " + h.tinhDienTich());

        sc.close();
    }
}
