import java.util.Random;

public class Wood implements Resource{

	private final int numResource;
	private boolean isRenewable;
	private int currentNumResource;

	//use this constructor for one time period
	public Wood(){
		numResource=10;
		isRenewable = true;
		currentNumResource=numResource;
	}
	
	public Wood(int numConsumers){
		Random rn = new Random();
		numResource=rn.nextInt(numConsumers*2);
	}
	
	@Override
	public boolean isRenewable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int currentNumResources() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNumResources() {
		// TODO Auto-generated method stub
		return 0;
	}

}
