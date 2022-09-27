// Bean class creation
class Employee5 implements java.io.Serializable 
{
	private int id; 
	private String name;
	
	Employee5() {}//constructor with no arg
	
	public void setId(int id)
		{
		this.id=id;
		}
	public int getId()
		{
		return id;
		} 
	public void setName(String name)
		{
		this.name=name;
		} 
	public String getName()
		{
		return name;
		}
}
