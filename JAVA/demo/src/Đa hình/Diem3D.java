import java.util.*;

public class Diem3D extends Diem2D {
        protected double z;

        @Override
        public void nhap() {
            super.nhap();
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap cao do: ");
            z = sc.nextDouble();
        }

        @Override
        public void xuat() {
            System.out.println("Toa do diem 3D: (" + x + "," + y + "," + z + ")");
        }
    }
}
