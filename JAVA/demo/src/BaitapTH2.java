import java.util.Scanner;
import java.util.ArrayList;

public class BaitapTH2 {
    public static void main(String[] args) {
        // khoi tao mang Array
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        // câu a.
        int n;
        System.out.print("nhap so phan tư n: ");
        n=scan.nextInt();
        //nhap mang
        for (int i=0; i<n; i++){
            System.out.print("nhap phan tu thu" + (i+1) + ": ");
            arr.add(scan.nextInt());
        }
        //xuat mang
        System.out.print("Mang vua nhap: ");
        for (int i=0; i<n; i++){
            System.out.print(arr.get(i)+ " ");
        }
        System.out.println();
    
        //câu b.
        int m;
        // nhap so phan tu
        System.out.print("nhap so phan tu m (m>=15): ");
        m = scan.nextInt();
        // nhap mang moi
        arr.clear();
        for (int i = 0; i < m; i++) {
            System.out.print("nhap phan tu thu " + (i + 1) + ": ");
            arr.add(scan.nextInt());
        }
        // xuat mang, chi lay <100
        System.out.print("Mang chi lay so <100: ");
        for (int i = 0; i < m; i++) {
            if (arr.get(i) < 100) {
                System.out.print(arr.get(i) + " ");
            }
        }
        System.out.println();

        // câu c.
        int them;
        // nhap 3 phan tu tu ban phim
        System.out.print("\nnhap 3 phan tu de them: ");
        for (int i = 0; i < 3; i++) {
            them = scan.nextInt();
            arr.add(them);
        }
        // xuat mang sau khi them
        System.out.print("Mang sau khi them: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        // câu d.
        // xoa cac so la boi cua 5
        System.out.print("\nMang sau khi xoa boi cua 5: ");
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) % 5 == 0) {
                arr.remove(i);
            }
        }
        // xuat mang
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        // câu e.
        int tim;
        // nhap so can tim
        System.out.print("\nnhap so can tim: ");
        tim = scan.nextInt();
        // tim trong mang
        boolean found = false;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == tim) {
                found = true;
                break;
            }
        }
        System.out.println("So " + tim + " " + (found ? "co" : "khong") + " trong mang");

        // câu f.
        // xuat phan tu co chu so hang chu la 1
        System.out.print("\nCac phan tu co chu so hang chuc la 1: ");
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (num >= 10 && num < 100 && (num / 10) % 10 == 1) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        scan.close();
    }
}

        
   
