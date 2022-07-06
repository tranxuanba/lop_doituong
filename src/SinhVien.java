import org.omg.CORBA.PUBLIC_MEMBER;

public class SinhVien {
    public int age =10;
    public String name = "ba";
    SinhVien(){

    }
    SinhVien(int age , String name){
        this.name=name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}
