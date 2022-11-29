package workshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

	List<ContactDetails> contactlist = new ArrayList<ContactDetails>();
	// create contact object to invoke the setter and getter methods
	ContactDetails person = new ContactDetails();
	static Scanner s = new Scanner(System.in);

	public void addContact() {

		System.out.print("Enter name: ");
		person.setName(s.next());

		System.out.print("Enter age: ");
		person.setAge(s.nextInt());

		System.out.print("Enter PhoneNumber: ");
		person.setNphNumber(s.next());

		System.out.print("Enter city: ");
		person.setCity(s.next());

		System.out.print("Enter state: ");
		person.setState(s.next());

		contactlist.add(person);
		// it will goes to print
		 printAddressBook();
	}

	public void printAddressBook() {

		contactlist.stream().forEach(a -> System.out.println(a));

	}

	public static void main(String[] args) {

		System.out.println("Welco to AddressBook");
		AddressBook book = new AddressBook();
		//Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter 1 to add contact.  \nEnter 2. to print details");
			int input = s.nextInt();
			switch (input) {

			case 1 -> book.addContact();

			case 2 -> book.printAddressBook();
			default -> System.out.println("invalid");
			}

		}
	}

}
