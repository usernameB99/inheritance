package Vererbung;

public class Main {
    public static void main(String[] args) {

        Shape circle1 = new Circle("blue", true, 1);


        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());

    }
}
