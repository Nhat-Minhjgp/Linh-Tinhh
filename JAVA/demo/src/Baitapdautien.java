import java.util.Scanner;

public class Baitapdautien {
    public static void main(String[] args){
        // khai báo biến
        float r, cv, dt;
        // nhap du lieu input  
        Scanner scan=new Scanner(System.in);
        System.out.print("nhap ban kinh: ");
        r=scan.nextFloat();
        // tinh toan
        cv=(float)Math.PI*r*2;
        dt=(float)Math.PI*r*r;
        // xuat ket qua
        System.out.println("chu vi la: "+cv);
        System.out.println("dien tich la: " +dt);
    }
}
