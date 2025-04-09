package MP2.controller;
import MP2.model.*;
import java.util.ArrayList;

/**
 * Write a description of class LPController here.
 *
 * @author Sebastian A
 * @version 1.0
 */

public class LPController
{
  private LPContainer lPContainer;
  private LP lp;
  
   public LPController(int serialNumber) {
    serialNumber = 0; 
    lPContainer = lPContainer.getInstance();
    lp = lp;
    }
    public LP findLP(int serialNumber){
        lp = lps.get(serialNumber);
        return lp; 
    }
}

