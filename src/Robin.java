
public class Robin {

	public Robin() {}
	public void reciveFlower(FlowerBouquet flowerBouquet) {
		System.out.println(getName()+" accepts the flowers: "+flowerBouquet.getFlowersNames());
	}
	public String getName() {
		return "Robin";
	}
}
