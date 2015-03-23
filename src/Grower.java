
public class Grower {

	private Gardener gardener;
	public Grower(Gardener gardener) {
		this.gardener=gardener;
	}

	public FlowerBouquet getFlowers(String flowersNames) {
		System.out.println(getName()+" forwards request to "+gardener.getName());
		FlowerBouquet flowerBouquet= gardener.getFlowers(flowersNames);
		System.out.println(gardener.getName()+" returns flowers to "+getName());
		return flowerBouquet;
	}
	public String getName() {
		return "Grower";
	}
}
