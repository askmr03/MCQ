package javaeetutorial.hello1;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
@Named
@RequestScoped
public class TextFor
{
	private String nameError, passwordError;
	
	public TextFor()
	{
		this("Invliad ID, use ID like 12345AB or 12345ab","Father's first name with age\n Example AMUDA21 or amuda21");
	}
	public TextFor ( String name, String password)
	{
		nameError = name;
		passwordError = password;
	}
	public String getNameError ()
	{
		return nameError;
	}
	
	public void setNameError(String nError)
	{
		this.nameError = nError;
	}
	
}