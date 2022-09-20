public class Main {
    public static void main(String args[]) {
        Person a = new Person(2,"a");
        Person b = new Person(3, "b");

        System.out.println(a.getEyes()); // outputs 3
        System.out.println(b.getEyes()); // outputs 3
    }
}