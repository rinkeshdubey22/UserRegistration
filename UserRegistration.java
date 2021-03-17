import java.util.Scanner;

public class UserRegistration {

	public static final Scanner scan = new Scanner(System.in);

	public static void isFirstNameValid() {

		System.out.println("Enter Your First Name");
		String firstName = scan.nextLine();
		String regex = "^[A-Z]{1}[a-z]{2,}$";
			if (firstName.matches(regex)) {
				System.out.println("Your First Name is Valid");

			} else {
				System.out.println("Your First Name is Invalid");

			}
	}

	public static void main(String[] args) {
		//calling method to validate first name
		isFirstNameValid();
	}

}
