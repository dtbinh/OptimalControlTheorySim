import java.util.Random;

public class Wood implements Resource{

	private final int numResource;
	private boolean isRenewable;
	private int currentNumResource;

	/**
	 * constructor for one time period tests
	 */
	public Wood(){
		numResource=0;
		isRenewable = false;
		currentNumResource=numResource;
	}
	
	/**
	 * regular constructor
	 * @param numConsumers
	 */
	public Wood(int numConsumers){
		Random rn = new Random();
		numResource=rn.nextInt(numConsumers*2);
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
