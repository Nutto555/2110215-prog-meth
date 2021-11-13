package solar;

public class Saturn extends Planet {
	private int speed;

	public Saturn() {
		super();
		speed = 0;
	}

	public Saturn(int orbitRadius, int speed) {
		super(orbitRadius);
		if (speed < 0) {
			speed = 0;
		}
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public boolean orbit() {
		if (this.getSpeed() > 0) {
			for (int i = 0; i < speed; i++) {
				super.orbit();
			}
			return true;
		}
		return false;
	}
}
