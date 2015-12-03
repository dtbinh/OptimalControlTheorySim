import java.util.Random;

public class Land implements Resource{
	
	private final int numResource;
	private boolean isRenewable;
	private int currentNumResource;
	
	/**
	 * Land constructor
	 * Amount land can producer per time period is seeded off numConsumers from first generation * 1000
	 * @param numConsumers
	 */
	public Land(int numConsumers){
		Random rn = new Random();
		numResource=rn.nextInt(numConsumers*1000);
		currentNumResource = numResource;
		isRenewable = true;
	}
	
	@Override
	public boolean isRenewable() {
		return isRenewable;
	}

	@Override
	public int getCurrentNumResources() {
		return currentNumResource;
	}

	@Override
	public int getNumResources() {
		return numResource;
	}

}
