package javaeetutorial.hello1;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
@Named
@RequestScoped

public class Text
{
	private String login , create , loginM;
	
	public Text ()
	{
		this("Login to your account" ,"Login", "Create an account");
	}
	public Text ( String defLogin , String defCreate , String defLoginM )
	{
		login  =  defLogin;
		create  =  defCreate;
		loginM  =  defLoginM;
	}
	
	public String getLogin()
	{
		return login;
	}
	public String getCreate()
	{
		return create;
	}
	public String getLoginM()
	{
		return loginM;
	}
}