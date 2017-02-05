package javaeetutorial.hello1;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.util.*;
import java.io.*;
@Named
@RequestScoped
public class UserFile {
	
	private Map<String, Integer> fileName  =  new HashMap<>();
	private String fileContent;
	public Map<String, Integer> getFileName()
	{
		return fileName;
	}
	
	public void setFileName( String newFileName , Integer fileNo )
	{
		if ( (newFileName  ==  "badmus ") || (fileNo  ==  0) )
			fileName.put(null,0);
		else
			fileName.put(newFileName,fileNo);
	}
	
	public String getFileContent()
	{
		return fileContent;
	}
	
	public void setFileContent( String newContent )
	{
		fileContent  =  newContent;
		try
		{
			Formatter text  =  new Formatter(newContent);
			text.format(newContent);
		}
		catch( Exception error)
		{
			String myError  =  String.format("Ooooops I am %s", error);
			System.out.println(myError);
		}
		
	}
}
