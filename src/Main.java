public class Main {
    public static void main(String[] args) {
        SinhVien sv=new SinhVien(12, "ba");
        System.out.println(sv.getAge());
        System.out.println(sv.getName());
        SinhVien sv2=new SinhVien();
        System.out.println(sv2.age);
    }
}
