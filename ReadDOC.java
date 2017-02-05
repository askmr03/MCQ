package javaeetutorial.hello1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import java.io.*;
public class ReadDOC {
	
	private static String name , myfile="uoe2015.doc" ,qText;

	public static String getFile()
    {
        qText = "\n";
        POIFSFileSystem toFileSource = null;
        try
        {
            toFileSource = new POIFSFileSystem(new FileInputStream(myfile));
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
