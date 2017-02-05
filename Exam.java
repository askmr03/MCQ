package javaeetutorial.hello1;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.io.*;
import java.net.URISyntaxException;
import java.util.*;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import javaeetutorial.hello1.ReadDOC;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class Exam {
	Document dom;
	public int currentQuestion = 0;	
	private String name , file  = "uoe2015.doc" ,qText;

	public Map<Integer,Integer> selections = new LinkedHashMap<Integer,Integer>();
	public ArrayList<Question> questionList  =  new ArrayList<Question>(10);
	
	public Exam( String defName) throws SAXException,ParserConfigurationException,IOException, URISyntaxException{
		name  =  defName;
		String examFile = getFile();
		dom  =  CreateDOM.getDOM( examFile );
	}
	public String getName()
	{
		return name;
	}
	public String getFile()
    {
        qText = "\n";
        POIFSFileSystem toFileSource = null;
        try
        {
            toFileSource = new POIFSFileSystem(new FileInputStream(file));
            HWPFDocument fromDoc = new HWPFDocument(toFileSource);
            WordExtractor iWill = new WordExtractor(fromDoc);
            String[] paragraphs = iWill.getParagraphText();
            for ( int index = 0 ; index < paragraphs.length; index++) {
                qText = qText + paragraphs[index];
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return qText;
    }

	public void setQuestion(int i)
	{   int number=i;
		String options[]=new String[4];
	    String question=null;
	    int correct=0;
	    System.out.println("Dom "+dom);
		NodeList qList=dom.getElementsByTagName("question");
	    NodeList childList=qList.item(i).getChildNodes();
	    
	    int counter=0;
	    
	    for (int j = 0; j < childList.getLength(); j++) {
            Node childNode = childList.item(j);
            if ("answer".equals(childNode.getNodeName()))
            {
                options[counter]=childList.item(j).getTextContent();
                counter++;
            }
            else if("Question".equals(childNode.getNodeName()))
            {
            	question=childList.item(j).getTextContent();
            }
            else if("correct".equals(childNode.getNodeName()))
            {
            	correct=Integer.parseInt(childList.item(j).getTextContent());
            }
            
        }
	    System.out.println("Retrieving Question Number "+number);
		System.out.println("Question is : "+question);
		for(String a:options)
		{
			System.out.println(a);
		}
		System.out.println("Correct answer index : "+correct);
		
		Question q=new Question();
		q.setQuestionNumber(number);
		q.setQuestion(question);
		q.setCorrectOptionIndex(correct);
		q.setQuestionOptions(options);
		questionList.add(number,q);
		
	}
	
	
	public ArrayList<Question> getQuestionList(){
		return this.questionList;
	}
	
	public int getCurrentQuestion(){return currentQuestion;}
	
	public Map<Integer,Integer> getSelections(){
		return this.selections;
	}
	
	public int calculateResult(Exam exam){
		int totalCorrect=0;
		Map<Integer,Integer> userSelectionsMap=exam.selections;		
		List<Integer> userSelectionsList=new ArrayList<Integer>(10);
		for (Map.Entry<Integer, Integer> entry :userSelectionsMap.entrySet()) {
			userSelectionsList.add(entry.getValue());
		}
		List<Question> questionList=exam.questionList;
		List<Integer> correctAnswersList=new ArrayList<Integer>(10);
		for(Question question: questionList){
			correctAnswersList.add(question.getCorrectOptionIndex());
		}
		
		for(int i=0;i<selections.size();i++){
			System.out.println(userSelectionsList.get(i)+" --- "+correctAnswersList.get(i));
			if((userSelectionsList.get(i)-1)==correctAnswersList.get(i)){
				totalCorrect++;
			}
		}
		
		System.out.println("You Got "+totalCorrect+" Correct");	
		return totalCorrect;
	}

}
