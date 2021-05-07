
public class Login {
	public static boolean validateMobileNumber(long mobileNumber) {
		boolean validMobileNumber = true;

		int mobileNumerLength = 10;
		char firstCharacterForMobileNumber = '6';
		String mobileNumberString = String.valueOf(mobileNumber);
		for (int index = 1; index < mobileNumberString.length(); index++) {
			if (mobileNumberString.length() != mobileNumerLength
					|| mobileNumberString.charAt(0) < firstCharacterForMobileNumber
					|| !(mobileNumberString.charAt(index) >= '0' && mobileNumberString.charAt(index) <= '9')) {
				System.out.println("Invalid login credentials");
				validMobileNumber = false;
			}
		}
		return validMobileNumber;
	}
	public static boolean isValidatePassword(String password) {
		int passwordLength = 8;
		boolean validPassword = true;
		if (password.length() < passwordLength || !(password.charAt(0) >= 'A' && password.charAt(0) <= 'Z')) {
			System.out.println("Enter password with Atleast 8 character and the first letter should be captial");
			validPassword = false;
		}
		return validPassword;

	}
	

}
