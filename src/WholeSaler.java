
public class WholeSaler {

	private Grower grower;
	public WholeSaler(Grower grower) {
		this.grower=grower;
	}
	public FlowerBouquet getFlowers(String flowersNames) {
		System.out.println(getName()+" forwards request to "+grower.getName());
		FlowerBouquet flowerBouquet= grower.getFlowers(flowersNames);
		System.out.println(grower.getName()+" returns flowers to "+getName());
		return flowerBouquet;
	}
	public  String getName() {
		return "whole saler";
	}
}
