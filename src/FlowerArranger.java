
public class FlowerArranger {

	public FlowerArranger() {}
	public void arrangeFlowers(FlowerBouquet flowerBouquet) {
		System.out.println(getName()+"arranges flowers");
		flowerBouquet.arrange();
	}
	public  String getName() {
		return "flowers arranger";
	}
}
