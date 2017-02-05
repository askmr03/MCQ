package javaeetutorial.hello1;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import java.io.*;
import java.util.Scanner;
import java.util.regex.*;
import java.util.*;
public class App
{
    private static String dataSource = "uoe2015.doc", bbb , regex = null , qText = null;
    static int me = 0;
    static String[] aaa = {"hhh","jhsh","djhshjhd"};
    static Scanner rfk = new Scanner(System.in);
    public static void main (String[]args)
    {
        String[] badmus = qText.split("jkdjjd");
        for ( int a = 0; a < badmus.length; a++)
        {
            System.out.println(badmus[a]);
            rfk.next();
        }
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
