import java.util.Random;

public class Land implements Resource{
	
	private final int numResource;
	private boolean isRenewable;
	private int currentNumResource;
	
	//use this constructor for one time period
	public Land(){
		numResource=10;
		isRenewable = true;
		currentNumResource=numResource;
	}
	
	public Land(int numConsumers){
		Random rn = new Random();
		numResource=rn.nextInt(numConsumers);
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
