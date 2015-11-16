
public interface Resource {

	boolean isRenewable();
	//returns true if resource is renewable
	int getCurrentNumResources();
	//returns amount of resource left in time period
	int getNumResources();
	//returns amount of total resource at start of time period
}
