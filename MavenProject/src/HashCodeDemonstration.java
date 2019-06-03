import java.util.Scanner;

public class HashCodeDemonstration {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		HashCodeDemonstration h1 = new HashCodeDemonstration(), h2 = new HashCodeDemonstration();

		// using the scanner we can enter data from the keyboard.
		Scanner key = new Scanner(System.in);

/*		System.out.println("enter your first name");
		h1.setName(key.nextLine());
		System.out.println("enter your second name");
		h2.setName(key.nextLine());

		System.out.println("First Name of H1: " + h1);
		System.out.println("Last Name of H2: " + h2);*/

		System.out.println("enter your first name");
		String firstName = key.nextLine();
		
		System.out.println("enter your second name");
		String secondName = key.nextLine();

		System.out.println("First Name of H1: " + firstName);
		System.out.println("Last Name of H2: " + secondName);
		System.out.println(firstName.equals(secondName));

		if (firstName.hashCode() == secondName.hashCode()) {
			System.out.println("string are same");
		} else {
			System.out.println("string are Different");
		}
	}

}