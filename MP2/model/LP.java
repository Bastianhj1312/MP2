package MP2.model;
import java.util.ArrayList;

public class LP
{
    private ArrayList<LPCopy> copies;
    private String barcode;
    private String title;
    private String artist;
    private String publicationDate;
    private int serialNumber;

    public LP(String barcode, String title, String artist, String publicationDate, LPCopy lpcopy)
    {
        this.barcode = barcode;
        this.title = title;
        this.artist = artist;
        this.publicationDate = publicationDate;
        copies = new ArrayList<>();
    }

    // public LPCopy getLpcopy() {
        // return lpcopy;
    // }

    // public void setLpcopy(LPCopy lpcopy) {
        // this.lpcopy = lpcopy;
    // }
    public String getBarcode() {
        return barcode;
    }
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;   
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }
    
    // public int getSerialNumber(){
        // return lpcopy.getSerialNumber();
    // }
    
    public LPCopy findCopy(int serialNumber) {
        
        LPCopy result = null;
        
        boolean searching = true;
        int index = 0;
        
        
        while (index < copies.size() && searching){
            LPCopy c = copies.get(index);
            if (c.getSerialNumber()== serialNumber) {
                searching = false;
                result = c;             
            } else {
                index++;
            }
        }
        System.out.println(result);
        return result;
        
        
    }
}

