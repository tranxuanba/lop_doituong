import java.util.Scanner;

public class Rectangle {
    double weight, height;
    public Rectangle(){

    }

    public Rectangle(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    public double getArea() {
        return this.height * this.weight;
    }
    public double getPrimeter() {
        return (this.weight + this.height) * 2;
    }
    public String display() {
        return "Rectangle{" + "width=" + weight + ", height=" + height + "}";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap vao chieu dai hcn:");
        double weight = sc.nextDouble();
        System.out.println("moi nhap vao chieu rong hcn");
        double height = sc.nextDouble();
        Rectangle hcn = new Rectangle(weight, height);
        System.out.println("hcn cua ban la:" + hcn.display());
        System.out.println("dien tich hcn la: " + hcn.getArea());
        System.out.println("chu vi hcn la: " + hcn.getPrimeter());
    }

}
