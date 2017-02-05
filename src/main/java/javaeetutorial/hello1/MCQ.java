package javaeetutorial.hello1;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.io.*;
import java.util.*;
@Named
@RequestScoped

public class MCQ
{
	private String question , optA , optB , optC, optD , dataSource="kill.txt";
	private int qNo;
	private Map<String , Integer> myQyestion = new HashMap<>();
	private BufferedReader br ;
	public MCQ( String myName)
	{
		myName = "AMuda Adeolu";
	}
	
	public String readFile() throws Exception
	{
		String newCotent = "\n";
		br = new BufferedReader ( new FileReader (dataSource)  );
		while (  ( newCotent=br.readLine() ) != null )
			return newCotent;
		return newCotent;
	}
}