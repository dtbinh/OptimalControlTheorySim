import java.util.Random;

public class Consumer {
	
	private int money;
	private final double baseSurvivalRate;
	private int numFood;
	private int numSpears;
	private int numGuns;
	private double realSurvivalRate;
	private boolean isAlive;
	
	public Consumer(){
		baseSurvivalRate=.2;
		isAlive=true;
		numFood=0;
		numSpears=0;
		numGuns=0;
		money=0;
		
	}
	
	//generates the wallet for the consumer each time period
	public void dollaDollaBillYall(){
		Random rn = new Random();
		money = rn.nextInt(10);
	}
	
	//returns true if consumer survives the time period
	public boolean isAlive(){
		return false;
	}
	
	//calculates real survival rate after buying period, takes weapons+food into account
	public double calculateRealSurvivalRate(){
		return 0;
	}
	
}
