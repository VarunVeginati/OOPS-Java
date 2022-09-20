public class Main{
    public static void main(String args[]) {
        Circle circle = new Circle("red", 1.5);
        Rectangle rect = new Rectangle("blue", 2, 5);

        System.out.println(circle.toString());
        System.out.println(rect.toString());
    }
}