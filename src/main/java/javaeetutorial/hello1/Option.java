package javaeetutorial.hello1;
import java.util.regex.*;
import javaeetutorial.hello1.*;

public class Option
{
    private  static String optText;
    private static boolean isCorrect;
    private static int optNo;
    private static Pattern optionA , optionB , optionC , optionD, pattern ;
    private static Matcher  optA , optB , optC, optD;

    public static void forPartOne ( )
    {
        optionA = Pattern.compile("A[.].[^B]*", Pattern.MULTILINE);
        optionB = Pattern.compile("B[.].[^C]*", Pattern.MULTILINE);
        optionC = Pattern.compile("C[.].[^D]*", Pattern.MULTILINE);
        optionD = Pattern.compile("D[.].[^QF]*", Pattern.MULTILINE);

        optA = optionA.matcher(App.readFile());
        optB = optionB.matcher(App.readFile());
        optC = optionC.matcher(App.readFile());
        optD = optionD.matcher(App.readFile());

        while ( ( optA.find()) && ( optB.find()) && ( optC.find()) && ( optD.find()) )
        {
            System.out.println( optA.group() + optB.group() + optC.group() + optD.group());
        }
    }

    public static void forPartTwo ( )
    {
        optionA = Pattern.compile("\\(a\\).*\\(b\\)", Pattern.MULTILINE);
        optionB = Pattern.compile("\\(b\\).*\\(c\\)", Pattern.MULTILINE);
        optionC = Pattern.compile("\\(c\\).*\\(d\\)", Pattern.MULTILINE);
        optionD = Pattern.compile("\\(d\\).*", Pattern.MULTILINE);

        optA = optionA.matcher(App.readFile());
        optB = optionB.matcher(App.readFile());
        optC = optionC.matcher(App.readFile());
        optD = optionD.matcher(App.readFile());

        while ( ( optA.find()) && ( optB.find()) && ( optC.find()) && ( optD.find()) )
        {
            System.out.println( optA.group() + optB.group() + optC.group() + optD.group());
        }
    }
}
