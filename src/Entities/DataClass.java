
package Entities;
import java.util.*;


public class DataClass {
    private String id;
    private String pass;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public DataClass(String id, String pass) {
        this.id = id;
        this.pass = pass;
    }
    
    
    
} // fin class DataClass
