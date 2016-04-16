/**
 * Created by luca on 16-Apr-2016
 * 
 */
public class Main {

    public static void main(String[] args) {
        Sim sim1 = new Sim("Rossi", 32178219, "Italy");
        Sim sim2 = new Sim("Fresr", 781293210, "French");
        
        System.out.println(sim1.getNumberSim());
        System.out.println(sim2.getNumberSim());
    }

}
