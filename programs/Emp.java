class  Emp { // HAS - A relation (Aggregation)
	int  eid;
	String ename;
	public Address address;
public Emp(int id, String name, Address address) { 
this.eid = id; 
 this.ename = name; 
 this.address=address; }
  void display(){ 
 System.out.println(eid+" "+ename); 
 System.out.println(address.city+" "+address.state+" "+address.country);  }
	public static void main(String[] args) {
		Address address1=new Address("gzb","UP","india"); 
        Address address2=new Address("gno","UP","india");
	   Emp e=new Emp(111,"varun",address1);
	   Emp e2=new Emp(112,"arun",address2); 
	   e.display();
	   e2=display(); 	} }
class Address { 
String city,state,country; 
Address(String city, String state, String country) { 
this.city = city; 
this.state = state; 
this.country = country; } }