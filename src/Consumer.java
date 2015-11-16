
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
