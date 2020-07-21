package home.study.pratice.lesson;

public class MyClass {

    public static void main(String[] args) {
        Recangle rec = new Recangle(  );
        Triangle tri = new Triangle(  );

        rec.set_value( 15, 6 );
        tri.set_value( 25, 4 );

        System.out.println("Area of Rectangle = " + rec.area());
        System.out.println("Area of Traingle = " + tri.area());
    }
}
