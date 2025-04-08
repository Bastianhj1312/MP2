package MP2.model;
import java.util.ArrayList;

public class LPContainer
{
    private ArrayList<LP> lps;
    private static LPContainer instance;
    private int nextNo;

    
    public static LPContainer getInstance(){
        if(instance == null) {
            instance = new LPContainer();
        }

        return instance;
    }

    private LPContainer()
    {
        lps = new ArrayList<>();
        nextNo = 1;
    }
    
    public void addLP(LP lp) {
            lps.add(lp);
            nextNo++;
            
        }
      
        public ArrayList<LP> getAll() {
        return new ArrayList<>(lps);
    }

    }
    

