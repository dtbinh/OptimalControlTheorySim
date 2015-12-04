import java.util.Random;

public class Consumer {

	private int money;
	private final double baseSurvivalRate;
	private int numFood;
	private int numSpears;
	private int numGuns;
	private double realSurvivalRate;
	private boolean isAlive;

	/**
	 * Constructor
	 */
	public Consumer() {
		realSurvivalRate = baseSurvivalRate = .2;
		isAlive = true;
		numFood = 0;
		numSpears = 0;
		numGuns = 0;
		money = 0;

	}

	public int getMoney() {
		return money;
	}

	/**
	 * generates the wallet for the consumer each time period
	 */
	public void dollaDollaBillYall() {
		Random rn = new Random();
		money = rn.nextInt(10);
	}

	/**
	 * returns true if consumer survives the time period
	 * 
	 * @return
	 */
	public boolean isAlive() {
		return isAlive;
	}

	/**
	 * Sets whether or not a consumer is alive
	 * 
	 * @param b
	 */
	public void setIsAlive(boolean b) {
		isAlive = b;
	}

	/**
	 * calculates real survival rate after buying period, takes weapons+food
	 * into account
	 * 
	 * @return
	 */
	public double calculateRealSurvivalRate() {
		return realSurvivalRate;
	}

}
