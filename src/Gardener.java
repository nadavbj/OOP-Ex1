
public class Gardener {

	public Gardener() {}
	public FlowerBouquet getFlowers(String flowersNames) {
		System.out.println(getName()+" prepares flowers");
		return new FlowerBouquet(flowersNames);
	}
	public String getName() {
		return "gardener";
	}
}