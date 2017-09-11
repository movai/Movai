
package Validar;


import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class FileRead 
{
 public static void main(String args[])
  {
  Scanner jd = new Scanner(System.in);
  
      System.out.println("Ingrese el correo");
      String mail = jd.next();
      System.out.println("Ingrese el user");
      String user = jd.next();

      
  try{
  // Open the file that is the first 
  // command line parameter
  FileInputStream fstream = new FileInputStream("src\\Data\\listUsers.csv");
  // Get the object of DataInputStream
  DataInputStream in = new DataInputStream(fstream);
  BufferedReader br = new BufferedReader(new InputStreamReader(in));
  String strLine;
  //Read File Line By Line
  while ((strLine = br.readLine()) != null)   {
  // Print the content on the console 
  System.out.println (strLine);
  
  
  
  
  }
  //Close the input stream
  in.close();
    }catch (Exception e){//Catch exception if any
  System.err.println("Error: " + e.getMessage());
  }
  }
}