import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.*;
public class App
{
    private static String dataSource = "uoe2015.doc", bbb , regex = null , qText = null;
    static int me = 0;
    static String[] aaa = {"hhh","jhsh","djhshjhd"};
    static Scanner rfk = new Scanner(System.in);
    public static void main (String[]args)
    {
       Question.forPartOne();
       Option.forPartOne();
       Question.forPartTwo();
       Option.forPartTwo();
    }
    public static String readFile( )
    {
        qText = "\n";
        POIFSFileSystem toFileSource = null;
        try
        {
            toFileSource = new POIFSFileSystem(new FileInputStream(dataSource));
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

}
