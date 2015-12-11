
public class OptimalControl {

	private static Simulation s;
	// for this sim:
	// numWood at start = 1,000,000
	// numLand at start = 100,000,000

	public static void main(String[] args) {
		s = new Simulation(20, 70);
		for(int i = 1; i < 71; i++){
			s.setCurrentTimePeriod(i);
			s.generateDollaDollaBills();
			s.produceGoods(s.optimalControlLaw());
			System.out.println("current resources(should equal state): " + s.getWeaponMerchant().getResource().getCurrentNumResources());
			System.out.println("number of goods produced: " + s.getWeaponMerchant().getProducedGoods());
			s.letsGoShopping();
			System.out.println("overall profit: " + s.getWeaponMerchant().getProfit());
//			s.heyYaWannaTrade();
			s.newGeneration();
			System.out.println("new generation " + i + ": " + s.getConsumers().size());
			System.out.println("-------------------------------------------------");
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
