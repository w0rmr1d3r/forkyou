package backend;

public class User extends FoodCreator {

  public User(
		String name,
		String description,
		String street,
		int postalCode,
		String city,
		int phoneNumber,
		String email) {

			super(name, description, street, postalCode, city, phoneNumber, email);
	}

	// TODO -> actions a user can do
}