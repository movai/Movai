
import java.util.ArrayList;


 public class Datos_Usuarios {
// se crea la clase y los metodos

    public static ArrayList <String> usuario = new ArrayList<String>();
    public static ArrayList <String> contra = new ArrayList<String>();
    public static ArrayList <String> email = new ArrayList<String>();
    
    
    public static void guardar (String Usuario2, String Contraseña2, String e){

        usuario.add(Usuario2);
        contra.add(Contraseña2);
        email.add(e);
        
            }
        
    public static void main(String[] args) {
    InicioMovai inicio = new InicioMovai();
    inicio.setVisible(true);
        
    usuario.add("usuario1");
    contra.add("123");
    
    }
        
    
    
    
    
    
    
    
    
    
}   // fin del public datos
    
