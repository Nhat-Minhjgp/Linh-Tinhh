import java.util.Scanner;

public class Baitap2{
    public static void main(String[] args ){
    // khai bao bien
    int n, dem=0;
    // nhap du lap input
    Scanner scan=new Scanner(System.in);
    System.out.print("nhap so nguyen duong n: ");
    n=scan.nextInt();
    // tinh
    while (n>0) {
        dem++;
        n=n/10;
    }
    //xuat kq
    System.out.println("so chu so la: "+dem);
    }
}