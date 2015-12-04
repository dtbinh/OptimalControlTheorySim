
public class OptimalControl {

	private static Simulation s;
	// for this sim:
	// numWood at start = 1,000,000
	// numLand at start = 100,000,000

	public static void main(String[] args) {
		s = new Simulation(1000, 10);
	}

	// each time period:
	// produce
	// generate wallets
	// buying period
	// trading period
	// create next generation
	// repeat dat shit
}
