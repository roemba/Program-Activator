/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program.activator;

import java.io.IOException;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/**
 *
 * @author Roemer Hendrikx
 */
public class TextReader {
    
    /**
     * TextReader takes an URL to a File in the local package and returns
     * the lines of that File in a List<String>.
     * @param packageURL
     * @return List<String>
     * @throws FileNotFoundException 
     */
    public static List<String> main(String packageURL) throws FileNotFoundException{
        
        //Initializing variables
        List<String> linelist = null; 
        URI FileURI;
        
        //Getting URL of file
        try{
            //Getting URI to file
            FileURI = TextReader.class.getResource(packageURL).toURI();
    
            //Creating new File
            File file = new File(FileURI);
        
            //Reading file line by line into list
            linelist = FileUtils.readLines(file);
            
        }
        catch (NullPointerException err){
            throw new FileNotFoundException();
        }
        catch (URISyntaxException err){
            System.err.println(err);
        }
        catch (IOException err){
            System.err.println(err);
        }
        
        //Returning the file list
        return linelist;
            
        
    }
    
}
