/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program.activator;

import java.io.FileNotFoundException;
import java.util.List;

/**
 *
 * @author Roemer Hendrikx
 */
public class SerialVerifier {
    
    public static boolean SerialVerifier(String userserial){
        
        //Initializing seriallist
        try{
            List<String> trustedseriallist = TextReader.main("/Serials/AllowedSerials.txt");
        
        //Matching trustedseriallist to the userserial
        
            for (String trustedserial : trustedseriallist){
                if (trustedserial.equals(userserial)){
                    return true;
                }
            }
            return false;
        }
        
        catch (FileNotFoundException err){
            System.err.println(err);
            return false;
        }
        
    }
}
