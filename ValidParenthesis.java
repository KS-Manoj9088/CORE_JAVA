import java.util.Stack;

public class ValidParenthesis
{
	public static void main(String[] args)
	{
		System.out.println(isvalid("({})"));
	System.out.println(isvalid("({)}"));
		
	}
	
	public static boolean isvalid(String s)
	{
		Stack<Character> stack = new Stack<>();
		for(char c : s.toCharArray())
		{
			if(c=='('||c=='{'||c=='[')
				{
					stack.push(c);
				}
			else if(c==')'&&!stack.isEmpty()&&stack.peek()=='(')
			{
				stack.pop();
			}
			else if(c==']'&&!stack.isEmpty()&&stack.peek()=='[')
			{
				stack.pop();
			}
			else if(c=='}'&&!stack.isEmpty()&&stack.peek()=='{')
			{
				stack.pop();
			}
			else{
				return false;
			}
		}
		
		return stack.isEmpty();
	}
}