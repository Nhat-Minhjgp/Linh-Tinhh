public class Hanghoa {
    private String mahang;
    private String tenhang;
    
      
    public String getmahang(){
        return mahang;
    }
    public String gettenhang(){
        return tenhang;
    }
    public void setmahang(String mahang){
        this.mahang=mahang;
    }
    public void settenhang(String tenhang){
        this.tenhang=tenhang;
    }

    public Hanghoa(){
        mahang="";
        tenhang="";
    }
    public Hanghoa(String mahang, String tenhang){
        this.mahang=kiemtramahang(mahang);
        this.tenhang=tenhang;
    }
    //  Phương thức kiểm tra mã hàng
    private String kiemtramahang(String maHang) {
        if (maHang == null || maHang.length() != 5)
            return "HH001";

        if (!maHang.substring(0, 2).equals("HH"))
            return "HH001";

        for (int i = 2; i < 5; i++) {
            if (!Character.isDigit(maHang.charAt(i)))
                return "HH001";
        }
        return maHang;
    }
    public void xuat(){
        System.out.println("Ma hang la:"+mahang);
        System.out.println("Ten hang hoa la: "+tenhang);
    }

    public static void main(String[] args){
        Hanghoa a1 = new Hanghoa("HH002","Pessi");
        a1.xuat();
    }
}