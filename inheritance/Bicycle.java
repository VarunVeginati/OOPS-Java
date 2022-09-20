public class Bicycle{
	private int speed;
	private int gear;

	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}

	public void applybreak(int decreaseSpeed) {
		this.speed -= decreaseSpeed;
	}

	public void speedUp(int increment) {
		this.speed += increment;
	}

	public String toString() {
		return ("No of gears are " + this.gear + "\n"
			+ "speed of the bicycle is " + this.speed + ".");
	}
}