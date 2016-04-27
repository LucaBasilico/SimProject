
import java.util.UUID;
import javafx.scene.control.ListCell;

/**
 *Create by luca on 16-Apr-2016
 *
 */
public class Sim { 
    private String numberSim = UUID.randomUUID().toString();
    private String nameOwner;
    private int telephoneNumber;
    private String countryOwner;
    //vuole essere un array di oggetti. Giusto?
    private ListCall[] listCall;

    public Sim(String nameOwner, int telephoneNumber ,String countryOwner) {
        this.nameOwner = nameOwner;
        this.countryOwner = countryOwner;
        this.telephoneNumber = telephoneNumber;
        //come faccio a creare una variabile autoincrementale per ogni istanza creata?
  
    }

    public Sim() {
    }

    public Sim(String nameOwner, int telephoneNumber, String countryOwner, ListCall[] listCall) {
        this.nameOwner = nameOwner;
        this.telephoneNumber = telephoneNumber;
        this.countryOwner = countryOwner;
        this.listCall = listCall;
    }

    public String getNumberSim(){
        return numberSim;
    }
    
    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public String getCountryOwner() {
        return countryOwner;
    }

    public void setCountryOwner(String countryOwner) {
        this.countryOwner = countryOwner;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }
    
}
