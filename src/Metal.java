
public class Metal implements Resource{

	private final int numResource;
	private boolean isRenewable;
	private int currentNumResource;
	
	public Metal(){
		numResource=0;
		isRenewable = false;
		currentNumResource=numResource;
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
