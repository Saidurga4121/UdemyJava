package ExceptionHandling;


class Amount 
{
	private int amount;
	private String currency;
		
	public Amount(String currency,int amount)
	{
		this.amount= amount;
		this.currency=currency;
	}
	
	public void add(Amount t) throws CurrenciesDoentMatch
	{
		if(!(this.currency.equals(t.currency)))
		{
			// exception ...we need to throw the exception
			// If we throw a checked exception using throw keyword, ....
			// it is must to handle the exception using catch block or the method must declare ...
			// it using throws declaration
			// throw new Exception("Currencies doesn't match");
			// adding custom exception
			throw new CurrenciesDoentMatch("Currencies doesn't match");
		}
		this.amount=this.amount + t.amount;
		System.out.println(toString());
	}
	
	public String toString()
	{
		return amount + " " + currency;
	}
}

class CurrenciesDoentMatch extends Exception
{
	public CurrenciesDoentMatch(String msg)
	{
		super(msg);
	}
	
}

public class ThrowingException
{
	public static void main(String[] args) throws CurrenciesDoentMatch 
	{
		Amount obj1= new Amount("USD",10);
		Amount obj2= new Amount("ENG",10);
		obj1.add(obj2);
		
	}
}
