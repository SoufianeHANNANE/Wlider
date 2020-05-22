public class Classroom{
	public static void main(String[] args) {
		Wilder first = new Wilder("Jean-Claude", true);
		System.out.println(first.whoAmI());
		
		Wilder second = new Wilder("Henri", false);
		System.out.println(second.whoAmI());
    }
}