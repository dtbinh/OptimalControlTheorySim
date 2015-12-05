
public interface Resource {

	/**
	 * returns true if resource is renewable
	 * 
	 * @return
	 */
	boolean isRenewable();

	/**
	 * returns amount of resource left in time period
	 * 
	 * @return
	 */
	int getCurrentNumResources();

	/**
	 * sets the amount of resource left in time period
	 * 
	 * @param currentNumResources
	 * @return
	 */

	void setCurrentNumResources(int currentNumResources);

	/**
	 * returns amount of total resource at start of time period
	 * 
	 * @return
	 */
	int getNumResources();
}
