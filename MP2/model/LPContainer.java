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

    public void addLP(LP lp) {
        lps.add(lp);
        nextNo++;

    }

    public ArrayList<LP> getAll() {
        return new ArrayList<>(lps);
    }

    //TODO
    public LPCopy findLPSN(int serialNumber) {
         
         LPCopy result = null;
        
        boolean searching = true;
        int index = 0;
        
        
        while (index < lps.size() && searching){
            LP lp = lps.get(index);
            LPCopy c = lp.findCopy(serialNumber);
            if (c!=null) {
                searching = false;
                result = c;             
            } else {
                index++;
            }
        }
        return result;
    }
    }

