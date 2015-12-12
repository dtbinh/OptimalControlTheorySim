import java.io.FileWriter;
import java.io.IOException;

public class OptimalControl {

	private static Simulation s;

	public static void main(String[] args) {
		int generation = 20;
		s = new Simulation(generation, 70);
		try {
			FileWriter fileWriter = new FileWriter("analysis.csv");
			fileWriter.append("Original Generation: " + generation);
		    fileWriter.append('\n');
		    fileWriter.append("resourceStatePostProduction");
		    fileWriter.append(',');
		    fileWriter.append("currentResourcesPostProduction");
		    fileWriter.append(',');
		    fileWriter.append("goodsProduced");
		    fileWriter.append(',');
		    fileWriter.append("overallProfit");
		    fileWriter.append(',');
		    fileWriter.append("newGeneration");
		    fileWriter.append('\n');
			for (int i = 1; i < 71; i++) {
				System.out.println(i);
				s.setCurrentTimePeriod(i);
				s.generateDollaDollaBills();
				s.produceGoods(s.optimalControlLaw());
				fileWriter.append(String.valueOf(s.optimalControlLaw()));
				fileWriter.append(',');
				fileWriter.append(String.valueOf(s.getWeaponMerchant().getResource().getCurrentNumResources()));
				fileWriter.append(',');
				fileWriter.append(String.valueOf(s.getWeaponMerchant().getProducedGoods()));
				fileWriter.append(',');
				s.letsGoShopping();
				s.heyYaWannaTrade();
				s.newGeneration();
				fileWriter.append(String.valueOf(s.getWeaponMerchant().getProfit()));
				fileWriter.append(',');
				fileWriter.append(String.valueOf(s.getConsumers().size()));
				fileWriter.append('\n');
			}
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
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
