public class Person{
    private static int numberOfEyes;
    private String name;

    public Person(int numberOfEyes, String name) {
        this.numberOfEyes = numberOfEyes;
        this.name = name;
    }

    public int getEyes() {
        return this.numberOfEyes;
    }
}