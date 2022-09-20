public class Helper {
    static int Multiply(int a, int b) {
        return a*b;
    }

    static double Multiply(double a, double b) {
        return a*b;
    }

    // static methods need not be called with the help of instance of an object.
    // Where as non static methods should be called with the help of refernce of the Object.
//    public double abc(int a, double b) {
//        return a*b;
//    }
//
//    public static void main(String args[]) {
//        Helper helper = new Helper();
//        System.out.println(Multiply(2,4));
//        System.out.println(helper.abc(2,4.2));
//    }
}