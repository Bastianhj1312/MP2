package MP2.controller;

import MP2.model.*;
import java.util.ArrayList;

public class LPController
{
    private LPContainer lPContainer;  // The container with the ArrayList of LPs

    // Constructor
    public LPController() {
        lPContainer = LPContainer.getInstance(); // Proper way to get the singleton instance
        }

    // Method to find LP by serial number
    public LP findLP(int serialNumber) {
        // Use your findLPSN method from LPContainer
        
        return lPContainer.findLPSN(String.valueOf(serialNumber));

    }

    // Method to get all LPs
    public ArrayList<LP> getAllLPs() {
        return lPContainer.getAll(); // Calls the getAll() from LPContainer
    }
}
