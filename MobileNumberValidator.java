public class MobileNumberValidator {
    public static void main(String[] args) {
        try {
            validateMobileNumber("9885089465");   // Valid number
            validateMobileNumber("98567890121");  // InvalidArrayIndexOutofBounds Exception
            validateMobileNumber("88664433");     // Invalid LengthNotSufficientException
            validateMobileNumber("98ab@123");      // InvalidNumberFormatException
        } catch (InvalidArrayIndexException e) {
            System.out.println("InvalidArrayIndexOutofBounds Exception: " + e.getMessage());
        } catch (LengthNotSufficientException e) {
            System.out.println("Invalid LengthNotSufficientException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("InvalidNumberFormatException: " + e.getMessage());
        }
    }
	
	 static void validateMobileNumber(String mobileNumber)
            throws InvalidArrayIndexException, LengthNotSufficientException, NumberFormatException {
        if (mobileNumber.length() > 10) {
            throw new InvalidArrayIndexException("Exceeds length of 10");
        } else if (mobileNumber.length() < 10) {
            throw new LengthNotSufficientException("Less than length of 10");
        }

        // Check if the string contains only digits
        if (!mobileNumber.matches("\\d+")) {
            throw new NumberFormatException("Contains non-digit characters");
        }

        System.out.println("Valid number");
    }
}

class InvalidArrayIndexException extends Exception {
    public InvalidArrayIndexException(String message) {
        super(message);
    }
}

class LengthNotSufficientException extends Exception {
    public LengthNotSufficientException(String message) {
        super(message);
    }
}