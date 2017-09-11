
import java.util.ArrayList;


public class Datos_Usuarios {
// se crea la clase y los metodos

    private String user;
    private String pass;

    public Datos_Usuarios(String u, String p)
    {
        user = u;
        pass = p;
    }

    public String getUsername()
    {
        return user;
    }

    public String getPassword()
    {
        return pass;
    }

    public void setUsername(String username)
    {
        this.user = username;
    }

    public void setPassword(String password)
    {
        this.pass = password;
    }
}   // fin del public