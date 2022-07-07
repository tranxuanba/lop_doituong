import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;
    QuadraticEquation(){

    }
    QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double getA() {
        return this.a;
    }
    double getB() {
        return this.b;
    }
    double getC() {
        return this.c;
    }
    double getDiscriminant(){
        double detal = this.b * this.b - 4 * this.a * this.c;
        return detal;
    }
    double getRoot1() {
        double r1 = (-this.b + Math.sqrt(getDiscriminant()))/(2 * this.a);
        return r1;
    }
    double getRoot2() {
        double r2 = (-this.b - Math.sqrt(getDiscriminant()))/(2 * this.a);
        return r2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao gia tri cua a");
        double a = sc.nextDouble();
        System.out.println("nhap vao gia tri cua b");
        double b = sc.nextDouble();
        System.out.println("nhap vao gia tri cua c");
        double c = sc.nextDouble();
        QuadraticEquation pt = new QuadraticEquation(a, b, c);
        if (pt.getDiscriminant() < 0) {
            System.out.println("phuong trinh vo nghiem");
        }else {
            if (pt.getDiscriminant() == 0) {
                System.out.println("phuong trinh co nghiem kep");
                System.out.println(pt.getRoot1());
            }else {
                System.out.println("phuong trinh co 2 nghiem phan biet");
                System.out.println(pt.getRoot1());
                System.out.println(pt.getRoot2());
            }
        }
    }
}
