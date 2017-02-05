package javaeetutorial.hello1;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
@Named
@RequestScoped

public class User
{
	private String name , password, namePattern="[0-9]{5}[a-zA-Z]{2}" , passwordPattern="[a-zA-Z]{3,10}[0-9]{2}";
	
	public String getName()
	{
		return name;
	}
	public String getPassword()
	{
		return password;
	}
	
	public void setName( String newName )
	{
		this.name = password;
	}
	
	public void setPassword( String newPassword )
	{
		this.password = newPassword;
	}
	
	public String getNamePattern()
	{
		return namePattern;
	}
	public String getPasswordPattern()
	{
		return passwordPattern;
	}
}
