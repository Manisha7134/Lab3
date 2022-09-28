
package ca.sait.models;

import java.io.Serializable;

/**
 *
 * @author manisha
 */
public class Note implements Serializable {
    private String tittle;
    private String contents;
    
    public Note(){
        
    }
    
    public Note(String tittle,String contents) {
        this.tittle = tittle;
        this.contents = contents;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
      
}
