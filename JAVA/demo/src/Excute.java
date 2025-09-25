public class Excute {
    public static void main(String arg[]){
        System.out.println(Student.getCollege());
        Student a = new Student();
        a.xuat();
        Student.setCollage("CNTT");
        System.out.println(Student.getCollege());
        Student b = new Student();
        System.out.println(Student.getCollege());
    }
}
