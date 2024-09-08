//

public class MainApp
{
	public static void main(String[] args){
	Roman romanConverter = new Roman();
	String inputRoman = "LVIII";
	int result = romanConverter.romanToInteger(inputRoman);
	System.out.println(result);
	}
}