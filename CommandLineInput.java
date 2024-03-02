public class CommandLineInput
{
	public static void main(String[] args)
	{
		if(args.length<4)
		{
			System.out.println("Please provide your name,age,gender,occupation as command line input arguments ");
			return;			
		}
		
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		String gender = args[2];
		String occupation = args[3];
		
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Gender : "+gender);
		System.out.println("Occupation : "+occupation);
		
	}
}