package MP2.model;
import java.util.ArrayList;

public class LPContainer
{
    public ArrayList<LP> lps;
    private static LPContainer instance;
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
    
    public void addLP(LP lp) {
            lps.add(lp);
            nextNo++;
            
        }
      
        public ArrayList<LP> getAll() {
        return new ArrayList<>(lps);
    }
    
    public LP findLPSN(String serialNumber){
        for(LP lp: lps) {
            if(lp.getSerialNumber().equals(serialNumber)) {
                return lp;
            }
        
        }
        return null;
    }

    }
    

