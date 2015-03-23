
public class DeliveryPerson {
	private Robin robin;
	public DeliveryPerson(Robin robin) {
		this.robin=robin;
	}
public void sendFlowers(FlowerBouquet flowerBouquet) {
	System.out.println(getName()+" delivers flowers to "+robin.getName());
	robin.reciveFlower(flowerBouquet);
}
public static String getName() {
	return "delivery person";
}
}
