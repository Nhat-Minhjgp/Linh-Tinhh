import java.util.Scanner;

public class BaitapTH1 {
    public static void main(String[] args) {

        // câu a.
        float dai, rong;
        // nhap chieu dai va rong
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap chieu dai: ");
        dai = scan.nextFloat();
        System.out.print("nhap chieu rong: ");
        rong = scan.nextFloat();
        // tinh
        float chuvi = (dai + rong) * 2;
        float dientich = dai * rong;
        System.out.println("Chu vi hinh la: " + chuvi);
        System.out.println("Dien tich hinh la: " + dientich);

        // câu b.
        int a, b, c;
        // nhap 3 so nguyen
        System.out.print("\nnhap so a: ");
        a = scan.nextInt();
        System.out.print("nhap so b: ");
        b = scan.nextInt();
        System.out.print("nhap so c: ");
        c = scan.nextInt();
        // tinh max va min
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        int min = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
        System.out.println("So lon nhat la: " + max);
        System.out.println("So nho nhat la: " + min);

        // câu c.
        int n;
        // nhap so nguyen duong
        System.out.print("\nnhap so nguyen duong n: ");
        n = scan.nextInt();
        // tinh cac uoc
        System.out.print("Cac uoc cua " + n + " la: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // xuong dong

        // câu d.
        int x;
        // nhap so nguyen duong
        System.out.print("\nnhap so nguyen duong x: ");
        x = scan.nextInt();
        // dem so chu so
        int count = 0;
        int temp = x;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        System.out.println("So chu so cua " + x + " la: " + count);

        scan.close();
    }
}