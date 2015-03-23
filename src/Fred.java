
public class Fred {
	private RobbinsFlorist robbinsFlorist;
	public Fred(RobbinsFlorist florist) {
		robbinsFlorist=florist;
	}
	public void sendFlowers(String flowersNames){
		System.out.println(getName()+"  forwards order to "+robbinsFlorist.getName());
		robbinsFlorist.sendFlowers(flowersNames);
	}
	public static String getName() {
		return "Fred";
	}
}
