package webapp;

import java.io.Serializable;

public class User implements Serializable
{
	private String id;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String address;
	private String phone;
	
	public User (String id, String username, String password, String firstname, String lastname, String address, String phone)
	{
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.phone = phone;
	}
	public String getid()
	{
		return id;
	}
	public String getusername()
	{
		return username;
	}
	
	public String getpassword()
	{
		return password;
	}
	
	public String getfirstname()
	{
		return firstname;
	}
	
	public String getlastname()
	{
		return lastname;
	}
	public String getaddress()
	{
		return address;
	}
	public String getphone()
	{
		return phone;
	}

	public void setid(String id)
	{
		this.id = id;
	}
	public void setusername(String username)
	{
		this.username = username;
	}
	
	public void setpassword(String password)
	{
		this.password = password;
	}
	
	public void setfirstname(String firstname)
	{
		this.firstname = firstname;
	}
	
	public void setlastname(String lastname)
	{
		this.lastname = lastname;
	}
	public void setaddress(String address)
	{
		this.address = address;
	}
	public void setphone(String phone)
	{
		this.phone = phone;
	}
}