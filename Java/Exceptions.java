import java.util.*;
class AtmException extends RuntimeException
{
	AtmException(String msg)
	{
		super(msg);
	}
}
class Atm
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter What amount You want");
		int amount=s.nextInt();
		if(amount>50000)
		{
			throw new AtmException("Maximum Transaction for 1day is 50k...so you can't withdrawl");
		}
		else
		{
			System.out.println("Your Transcation is successful");
		}
	}
}
