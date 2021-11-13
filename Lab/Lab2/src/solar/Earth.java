package solar;

public class Earth extends Planet {
	private int wasteLevel;

	public Earth() {
		super();
		wasteLevel = 0;
	}

	public Earth(int orbitRadius, int wasteLevel) {
		super(orbitRadius);
		if (wasteLevel < 0) {
			wasteLevel = 0;
		}
		this.wasteLevel = wasteLevel;
	}

	public int getWasteLevel() {
		return wasteLevel;
	}

	public boolean orbit() {
		if (wasteLevel <= 5) {
			super.orbit();
			return true;
		}
		return false;
	}

}
