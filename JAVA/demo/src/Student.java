import java.util.Scanner;

public class Student{
    private int id;
    private String name;
    private static String college = "SGU";

    public int getId() {
        return id; 
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName () {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public static String getCollege(){
        return college;
    }
    public static void setCollage(String college){
        Student.college = college;
    }
//Hàm khởi tạo cũng là nạp chồng phương thức - overload
//Hàm khởi tạo không tham số
    public Student()
    {
    id=0; name= "Phai Chiu ";
    }
    // Hàm khởi tạo có tham số
    public Student (int id, String name){
        this.id = id;
        this.name = name;
    }
    // Ham khoi tao sao chep
    public Student(Student s){
        id = s.id;
        name = s.name;
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap ID: ");
        id=sc.nextInt();
        System.out.println("Moi nhap ho ten: ");
        name=sc.nextLine();
    }
    public void xuat(){
        System.out.println("id: " + id + "name: " + name + "college " + college);
    }
    private static void thayDoiTruong(String college){
        Student.college = college;
    }
    }
