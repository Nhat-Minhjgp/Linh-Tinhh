import java.util.Scanner;

public class Diem2D {
    protected double x;
    protected double y;

    public double KhoangCach(Diem2D d) {
        return Math.sqrt(Math.pow(this.x - d.x, 2) + Math.pow(this.y - d.y, 2));
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hoanh do: ");
        x =sc.nextDouble();
        System.out.println("Nhap tung do: ");
        y = sc.nextDouble();
    }
    public void xuat() {
        System.out.println("Toa do diem 2D: (" + x + "," + y + ")");
    }   
}
