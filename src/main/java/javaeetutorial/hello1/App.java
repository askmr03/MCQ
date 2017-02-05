package javaeetutorial.hello1;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
@Named
@RequestScoped
public class App {

    private String name , appName , regNo ,login ,editor;
	private int userPin;

    public App() 
	{
		this("A:B Exam ","User Name");
    }
	public App ( String defName , String defAppName )
	{
		name = defName;
		appName = defAppName;
	}

	public String getRegNo() 
	{
        return regNo;
    }

	public String getEditor() 
	{
		if ( (regNo == null) || (userPin == 1 ) || (regNo == "badmus") )
			return "index.xhtml";
		else
			return "editor.xhtml";
    }
	
	public String getLogin() 
	{
        return "index.xhtml";
    }
	
    public void setRegNo(String newReg) 
	{
        this.regNo = newReg;
		String newWord = newReg.toString();
        String[] newWordInArray = newWord.trim().split("");
        String firstLetter = String.valueOf(newWordInArray[0].trim().toUpperCase());
        StringBuilder leftWord = new StringBuilder(newReg.toString().trim().toLowerCase());
        leftWord.deleteCharAt(0);
        String leftWordAD = String.valueOf(leftWord);
        String textWithoutSpace = leftWordAD.replaceAll("\\s+"," ");
        regNo = firstLetter.concat(textWithoutSpace);
    }
	
    public String getName() 
	{
        return name;
    }

    public void setName(String user_name) {
        this.name = user_name;
    }
	
	public String getAppName() 
	{
        return name;
    }

    public void setAppName(String user_name) {
        this.name = user_name;
    }
	
	 public int getUserPin() 
	{
		return userPin;
    }

    public void setUserPin(int newPin) {
        this.userPin = newPin;
		if ( (newPin == 0) || (newPin ==1) )
			System.err.println("PIN ERROR");
		else
			System.out.println("PIN VERFIED...");
    }
	
}