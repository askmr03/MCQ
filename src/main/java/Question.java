import java.util.regex.*;
import java.util.*;
public class Question
{
    private static int qNo = 0;
    private static String qText;
    private static Pattern questPat ;
    private static Matcher questMat ;
    static  Scanner rfk = new Scanner(System.in);

    public static String forPartOne ( )
    {
        questPat = Pattern.compile("^Question\\s*\\d{1,3}[\\s]*[^A]*", Pattern.MULTILINE);
        questMat = questPat.matcher(App.readFile());
        while ( ( questMat.find() )  )
        {
            qText = qText + questMat.group();
        }
        return qText;
    }

    public static String forPartTwo ( )
    {
        questPat = Pattern.compile("^[0-9]{1,3}.*\\(a\\)", Pattern.MULTILINE);
        questMat = questPat.matcher(App.readFile());
        while ( ( questMat.find() )  )
        {
            qText = qText + questMat.group();
        }
        return qText;
    }

}
