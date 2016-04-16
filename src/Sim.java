
import java.util.concurrent.atomic.AtomicInteger;
import javafx.scene.control.ListCell;

/**
 *Create by luca on 16-Apr-2016
 *
 */
public class Sim {
    private AtomicInteger numberSim = new AtomicInteger();
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
        this.numberSim.incrementAndGet();
    }

    public Sim() {
    }

    public int getNumberSim() {
        return numberSim.get();
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
