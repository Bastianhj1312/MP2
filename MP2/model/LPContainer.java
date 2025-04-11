package MP2.model;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class LPContainer
{
    public ArrayList<LP> lps;
    private static LPContainer instance;
    private LPCopy lpcopy;
    private int nextNo;

    private LPContainer()
    {
        lps = new ArrayList<>();
        nextNo = 1;
    }

    public static LPContainer getInstance(){
        if(instance == null) {
            instance = new LPContainer();
        }

        return instance;
    }

    public boolean addLP(LP lp) {
        LP conflict = findLP(lp.getBarcode());
        boolean lpres = false;
        if (conflict == null) {
            lps.add(lp);
            lpres = true;
        }
        return lpres;

    }

    public ArrayList<LP> getAll() {
        return new ArrayList<>(lps);
    }
    
     public LP findLP(String barCode){
        for(LP lpc: lps) {
            if(lpc.getBarcode().equals(barCode)) {
                return lpc;
            }
        }
        return null;
    }
    //Unit Test
public void testFindLPSN() {
    LPContainer container = new LPContainer();
    LPCopy copy = new LPCopy(1234,"text",1234);
    LP lp1 = new LP("1234", "Abbey Road", "The Beatles", "Rock", copy);

    container.addLP(lp1);

    assertEquals(lp1, container.findLP("1234"));  // Must match EXACT name of method
}



}

