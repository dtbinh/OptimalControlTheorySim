
public class Wood implements Resource {

	private final int numResource;
	private boolean isRenewable;
	private int currentNumResource;

	/**
	 * Wood constructor Amount of wood total generated randomly, seeded by
	 * numConsumers from the first generation *10000
	 * 
	 * @param numConsumers
	 */
	public Wood(int numConsumers) {
		numResource = numConsumers * 100000;
		isRenewable = false;
		currentNumResource = numResource;
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

	@Override
	public void setCurrentNumResources(int currentNumResources) {
		this.currentNumResource=currentNumResources;
	}

}
