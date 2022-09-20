public class Motorcycle extends Bicycle{
	private int seatHeight;

	public Motorcycle(int gear, int speed, int seatHeight) {
		super(gear, speed);
		this.seatHeight = seatHeight;
	}

	public void setHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	@Override
	public String toString() {
		return (super.toString() + "\n"
			+ "the height of the seat is " + this.seatHeight + ".");
	}
}