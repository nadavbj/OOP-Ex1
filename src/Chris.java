
public class Chris {
	private Fred fred;
	public Chris(Fred fred) {
		this.fred=fred;	
	}
	public void sendFlowers() {
		System.out.println(getName()+" orders flowers from "+fred.getName()+": Roses, Violets, Gladiolus");
		fred.sendFlowers("Roses, Violets, Gladiolus");
	}
	public static String getName() {
		return "Chris";
	}
}
