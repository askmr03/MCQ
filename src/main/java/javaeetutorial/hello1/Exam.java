package javaeetutorial.hello1;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
@Named
@RequestScoped

public class Exam
{
	private String name;
	
	public Exam ()
	{
		this("A:B Exam web app");
	}
	public Exam ( String defName )
	{
		name = defName;
	}
	
	public String getName()
	{
		return name;
	}
}
