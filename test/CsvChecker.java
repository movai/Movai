
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import javax.swing.JOptionPane;

public class CsvChecker {
    
    public static void main(String[] args) {
     String NEW_LINE_SEPARATOR = "\n";    
        
    String csvFile = "src\\Data\\listUsers.csv";
    BufferedReader br = null;
    String line = "";
    HashSet<String> lines = new HashSet<>();
   
    
    try {
        br = new BufferedReader(new FileReader(csvFile));
        while ((line = br.readLine()) != null) {
            // valida que solo se imprima datos no repetidos
            if (lines.add(line)) {
                System.out.println(line);
                // se hace un nuevo csv que va a guardar los datos unicos
                    try{
                    FileWriter lista = new FileWriter("src\\Data\\Final.csv", true);

                    lista.write(line);
                    lista.append(NEW_LINE_SEPARATOR); // espaciado
                    lista.flush();
                    lista.close();                    
   
                                        } catch (Exception e){


                                        }      

                                                }
   
    
        }

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }    
    }

    
    
    
    
    
    
    
    
    
    
    
    // **********************************************************************************************************************************************************
    
    
    } 
  }
    
    

    




    