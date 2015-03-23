
public class FlowerBouquet {

	private String flowersNames;
	
	private boolean isArranged;
	public FlowerBouquet(String flowersNames) {
		this.flowersNames=flowersNames;
		isArranged=false;
	}
	public static String getName() {
		return "flower bouquet";
	}
	public void arrange() {
		isArranged=true;
	}
	public String getFlowersNames() {
		return flowersNames;
	}
}
