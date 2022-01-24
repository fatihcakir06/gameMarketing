package entities.concretes;



import entities.abstracts.Entity;

public class Customer extends User implements Entity {

	private String identityNumber;
	private String firstName;
	private String lastName;
	private int dateYear;

	public Customer() {
		super();
	}

	public Customer(int id, String email, String password, String identityNumber, String firstName, String lastName,
			int dateYear) {
		super(id, email, password);
		this.identityNumber = identityNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateYear = dateYear;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthDate() {
		return dateYear;
	}

	public void setBirthDate(int dateYear) {
		this.dateYear = dateYear;
	}

}
