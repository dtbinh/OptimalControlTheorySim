import java.util.Iterator;
import java.util.Random;

public class Consumer{

	private int money;
	private final double baseSurvivalRate;
	private int numFood;
	private int numWeapons;
	private boolean isAlive;

	/**
	 * Constructor
	 */
	public Consumer() {
		baseSurvivalRate = .2;
		isAlive = true;
		numFood = 0;
		numWeapons = 0;
		money = 0;

	}

	/**
	 * gets the number of weapons a consumer has
	 * 
	 * @return numWeapons
	 */
	public int getNumWeapons() {
		return numWeapons;
	}

	/**
	 * sets the number of weapons a consumer has
	 * 
	 * @param numWeapons
	 */
	public void setNumWeapons(int numWeapons) {
		this.numWeapons = numWeapons;
	}

	/**
	 * returns the amount of money the consumer has
	 * 
	 * @return money
	 */
	public int getMoney() {
		return money;
	}

	/**
	 * sets the amount of money the consumer has after a trade
	 * @param money
	 */
	public void setMoney(int money){
		this.money=money;
	}
	
	/**
	 * generates the wallet for the consumer each time period
	 */
	public void dollaDollaBillYall() {
		Random rn = new Random();
		money = rn.nextInt(60);
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
		double temp = baseSurvivalRate;
		for (int i = 0; i < numWeapons; i++) {
			temp += .2;
		}
		return temp;
	}

	/**
	 * purchases weapons
	 * 
	 * @param numToPurchase
	 * @param price
	 */
	public void purchaseWeapons(int numToPurchase, int price) {
		numWeapons += numToPurchase;
		money -= numToPurchase * price;
	}

}
