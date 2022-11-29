package workshop;

public class ContactDetails {

	// classed based variables
	private String name;
	private int age;
	private String nphNumber;
	private String city;
	private String state;

	// create default constructor
	ContactDetails() {

	}

	// create parameterized constructor
	public ContactDetails(String name, int age, String nphNumber, String city, String state) {
		super();
		this.name = name;
		this.age = age;
		this.nphNumber = nphNumber;
		this.city = city;
		this.state = state;
	}

	// getter and setter method using.
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the nphNumber
	 */
	public String getNphNumber() {
		return nphNumber;
	}

	/**
	 * @param nphNumber the nphNumber to set
	 */
	public void setNphNumber(String nphNumber) {
		this.nphNumber = nphNumber;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	// toString method using to print in single line.
	@Override
	public String toString() {
		return "ContactDetails [name=" + name + ", age=" + age + ", nphNumber=" + nphNumber + ", city=" + city
				+ ", state=" + state + "]";
	}

}
