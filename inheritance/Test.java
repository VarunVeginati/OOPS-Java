public class Test{
	public static void main(String args[]) {
		Motorcycle mc = new Motorcycle(1,2,3);
		mc.speedUp(2);
		mc.applybreak(1);
		mc.setHeight(2);
		System.out.println(mc.toString());
	}
}