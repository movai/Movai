
package Main;
import Entities.*;
import java.util.*;
import java.text.*;
import java.io.*;

public class main {
    public static void main(String[] args) {
    
    String COMMA_DELIMITER = ",";
    String NEW_LINE_SEPARATOR = "\n";
    String FILE_HEADER = "id, password";
        
    try{
    List<DataClass> listUsers = new ArrayList<DataClass>();   
    listUsers.add(new DataClass("usuario 1", "password") );
    
    FileWriter file = new FileWriter ("src\\Data\\listUsers.csv");
    file.append(FILE_HEADER);
    for(DataClass x: listUsers){
    file.append(NEW_LINE_SEPARATOR);
    
    file.append(x.getId());
    
    file.append(COMMA_DELIMITER);
    
    file.append(x.getPass());
    
    file.flush();
    file.close();
    
    }
    
    
    
    
    } catch (Exception e){
        System.out.println(e.getMessage());
        
    }
        
        
        
        
        
        
        
    } // fin del Main
       
} // fin del Class Main
