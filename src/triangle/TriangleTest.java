package triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        System.out.println();
        triangle = new Triangle(5,8,16,"red",false);
        System.out.println(triangle);
    }
}
