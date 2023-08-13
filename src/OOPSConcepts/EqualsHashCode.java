package OOPSConcepts;

public class EqualsHashCode 
{
	private int id;
	private String name;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public boolean equals(Object o)
	{
		if(o==null || getClass()!=o.getClass())
		{
			return false;
		}
		if(o==this)
		{
			return true;
		}
		EqualsHashCode e= (EqualsHashCode)o;
		return(this.getId()==e.getId());
	}
	
	public int hashCode()
	{
		return getId();
	}
	
	public static void main(String[] args) 
	{
		EqualsHashCode obj1= new EqualsHashCode();
		obj1.setId(10);
		obj1.getId();
		
		EqualsHashCode obj2= new EqualsHashCode();
		obj2.setId(100);
		obj2.getId();
		
		System.out.println((obj1.equals(obj2)));
		

	}

}
