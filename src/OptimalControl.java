
public class OptimalControl {

	private static Simulation s;
	// for this sim:
	// numWood at start = 1,000,000
	// numLand at start = 100,000,000

	public static void main(String[] args) {
		s = new Simulation(1000, 21);
		for(int i = 1; i < 21; i++){
			s.setCurrentTimePeriod(i);
			s.generateDollaDollaBills();
			s.produceGoods(s.optimalControlLaw());
			s.letsGoShopping();
			s.heyYaWannaTrade();
			s.newGeneration();
			System.out.println("generation " + i + ": " + s.getConsumers().size());
		}
	}

	// each time period:
	// produce
	// generate wallets
	// buying period
	// trading period
	// create next generation
	// repeat dat shit
}
