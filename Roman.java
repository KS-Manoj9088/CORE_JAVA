package Number;

public class Roman
{
	public int romanToInteger(String s)
	{
		if(s==null||s.length()==0)
		{
			return 0;
		}
		int result = 0;
		for(int i = 0;i<s.length();i++)
		{
			int currentVal=getValue(s.charAt(i));
			if(i+1<s.length())
			{
				int nextVal=getValue(s.charAt(i+1));
				if(currentVal<nextVal)
				{
					result+=nextVal-currentVal;
				}
				else
				{
					result+=currentVal;
				}
			}
			else
			{
				result+=currentVal;
			}
		}
		
		return result;
	}
	
	
	private int getValue(char romanChar)
	{
		switch(romanChar)
		{
			case 'I' : return 1;
			case 'V' : return 5;
			case 'X' : return 10;
			case 'L' : return 50;
			case 'C' : return 100;
			case 'D' : return 500;
			case 'M' : return 1000;
			default :
			throw new IllegalArgumentException("Invalid Exception charcter "+romanChar);
			
		}
	}
}