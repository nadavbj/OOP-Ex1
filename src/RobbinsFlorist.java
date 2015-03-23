
public class RobbinsFlorist {
	private Wholesaler wholeSaler;
	private FlowerArranger flowerArranger;
	private DeliveryPerson deliveryPerson;
	public RobbinsFlorist(Wholesaler wholeSaler, FlowerArranger flowerArranger, DeliveryPerson deliveryPerson) {
		this.wholeSaler=wholeSaler;
		this.flowerArranger=flowerArranger;
		this.deliveryPerson=deliveryPerson;
	}
	public void sendFlowers(String flowersNames){
		System.out.println(getName()+" forwards request "+wholeSaler.getName());
		FlowerBouquet flowerBouquet=wholeSaler.getFlowers(flowersNames);
		System.out.println(wholeSaler.getName()+" returns flowers to "+getName());
		flowerArranger.arrangeFlowers(flowerBouquet);
		System.out.println(flowerArranger.getName()+"  returns arranged flowers to "+getName());
		System.out.println(getName()+" forwards flowers to "+deliveryPerson.getName());
		deliveryPerson.sendFlowers(flowerBouquet);
	}
	public static String getName(){
		return "Robbin's Florist";
	}
}
