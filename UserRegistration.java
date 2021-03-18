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

	public static void isLastNameValid() {

		System.out.println("Enter Your Last Name");
                String lastName = scan.nextLine();
                String regex = "^[A-Z]{1}[a-z]{2,}$";
                        if (lastName.matches(regex)) {
                                System.out.println("Your Last Name is Valid");

                        } else {
                                System.out.println("Your Last Name is Invalid");

                        }

	}

	public static void checkEmailId() {
		System.out.println("Enter Your E-mail");
		String emailId = scan.nextLine();
		String regex = "^[a-zA-Z0-9]+([.+-_][a-zA-Z0-9]+)*@[a-zA-z0-9]+.[a-zA-Z]{2}([.][a-zA-Z]{2,4}){0,1}$";
		if (emailId.matches(regex)) {
			System.out.println("Email Id Is Valid");

		}else {
			System.out.println("Invalid Email Id");

		}
	}

	 private static void checkMobileNo() {
                System.out.println("Enter Your Mobile No");
                String mobileNo = scan.nextLine();
                String regex = ("^[0-9]{2}[ ][0-9]{10}$");
                        if (mobileNo.matches(regex)) {
                                System.out.println("Your Moile No is Valid");

                        } else {
                               	System.out.println("Your Mobile No is Invalid");

                        }

		}


	public static void main(String[] args) {
		//calling method to validate first name
		isFirstNameValid();
		isLastNameValid();
		checkEmailId();
		checkMobileNo();
	}

}
