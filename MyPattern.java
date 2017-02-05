package javaeetutorial.hello1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javaeetutorial.hello1.*;

public class MyPattern
{
final static String regex = "^Question.*(\\s*)*(.)[^A]*";
final static String string = "By 1910, the motor car was plainly conquering the highway. The private car was now part of every rich man’s and speed of \n";

final static Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
final static Matcher matcher = pattern.matcher(string);

public static void main ( String[] args )
{
	while (matcher.find()) {
    System.out.println("Full match: " + matcher.group(0));
    for (int i = 1; i <= matcher.groupCount(); i++) {
        System.out.println("Group " + i + ": " + matcher.group(i));
    }
		}
}
}