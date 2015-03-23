
public class mainClass {

	public static void main(String[] args) {
		Robin robin=new Robin();
		DeliveryPerson deliveryPerson=new DeliveryPerson(robin);
		Gardener gardener=new Gardener();
		Grower grower=new Grower(gardener);
		WholeSaler wholeSaler=new WholeSaler(grower);
		FlowerArranger flowerArranger=new FlowerArranger();
		RobbinsFlorist robbinsFlorist=new RobbinsFlorist(wholeSaler, flowerArranger, deliveryPerson);
		Fred fred=new Fred(robbinsFlorist);
		Chris chris=new Chris(fred);
		chris.sendFlowers();
	}

}
