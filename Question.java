package javaeetutorial.hello1;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.util.*;
import javaeetutorial.hello1.App;
@Named
@RequestScoped
public class Question {

	int questionNumber;
	String question;
	String questionOptions[];
	int correctOptionIndex;
    private String qText;
    private Pattern questPat ;
    private Matcher questMat ;
    private File myFile = new File();
    
    public static void main ( String [] args )
    {
        Question q = new Question();
    }
    public String forPartOne ( )
    {
        questPat = Pattern.compile("^Question\\s*\\d{1,3}[\\s]*[^A]*", Pattern.MULTILINE);
        questMat = questPat.matcher(App.readFile());
        while ( ( questMat.find() )  )
        {
            qText = qText + questMat.group();
        }
        return qText;
    }

    public String forPartTwo ( )
    {
        questPat = Pattern.compile("^[0-9]{1,3}.*\\(a\\)", Pattern.MULTILINE);
        questMat = questPat.matcher(App.readFile());
        while ( ( questMat.find() )  )
        {
            qText = qText + questMat.group();
        }
        return qText;
    }
	public String getQuestion()
	{ 
		return question;
	}

	public int getQuestionNumber()
	{
		return questionNumber;
	}

	public void setQuestionNumber(int i)
	{
		questionNumber = i;
	}

	public int getCorrectOptionIndex()
	{
		return correctOptionIndex;
	}

	public String[] getQuestionOptions()
	{
		return questionOptions;
	}

	public void setQuestion(String s)
	{
		question = s;
	}
	public void setCorrectOptionIndex(int i)
	{
		correctOptionIndex = i;
	}
	public void setQuestionOptions(String[]s)
	{
		questionOptions = s;
	}

}