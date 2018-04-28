public class Name {
	public static void main(String[] args) 
	{
		int a, b, action;
		System.out.println("Hallo " + args[0] + "!");
		System.out.println("Enter first number:");
		a = Integer.parseInt(System.console().readLine());
		System.out.println("Enter second number:");
		b = Integer.parseInt(System.console().readLine());
		System.out.println("Enter a number for action (1 for +), (2 for -), (3 for *),(4 for /):");
		action = Integer.parseInt(System.console().readLine());
		if(action == 1)
		{
			a = a+b;
		}
		else if(action == 2)
		{
			a = a-b;
		}
		else if (action == 3)
		{
			a = a*b;
		}
		else if (action == 4)
		{
			a = a/b;
		}
		else
		{
			return;
		}
		System.out.println("Output:");
		System.out.println(a);
	}
}