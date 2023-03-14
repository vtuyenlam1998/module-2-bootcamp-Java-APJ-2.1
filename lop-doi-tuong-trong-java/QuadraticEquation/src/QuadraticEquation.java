import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation() {
    }
    public QuadraticEquation(double a,double b,double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
    }
    public double getDiscriminant() {
        return Math.pow(b,2)-4*a*c;
    }
    public double getRoot1() {
        return ((-b+(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a));
    }
    public double getRoot2(){
        return ((-b-(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập số a: ");
        double a=sc.nextDouble();
        System.out.print("Nhập số b: ");
        double b=sc.nextDouble();
        System.out.print("Nhập số c: ");
        double c=sc.nextDouble();
        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant()>0) {
            System.out.println("Phương trình có hai nghiệm là: "+quadraticEquation.getRoot1()+" và "+quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant()==0) {
            System.out.println("Phương trình có một nghiệm là: "+quadraticEquation.getRoot1());
        } else System.out.println("The equation has no roots");
    }
}