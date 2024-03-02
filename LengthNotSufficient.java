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