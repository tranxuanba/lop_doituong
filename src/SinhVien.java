import org.omg.CORBA.PUBLIC_MEMBER;

public class SinhVien {
    public int age =10;
    public String name = "ba";


    public SinhVien(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}
