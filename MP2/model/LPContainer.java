package MP2.model;
import java.util.ArrayList;

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
}

