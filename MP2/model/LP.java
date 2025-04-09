package MP2.model;

public class LP
{
    private LPCopy lpcopy;
    private String barcode;
    private String title;
    private String artist;
    private String publicationDate;

    public LP(String barcode, String title, String artist, String publicationDate, LPCopy lpcopy)
    {
        this.barcode = barcode;
        this.title = title;
        this.artist = artist;
        this.publicationDate = publicationDate;
    }

    public LPCopy getLpcopy() {
        return lpcopy;
    }

    public void setLpcopy(LPCopy lpcopy) {
        this.lpcopy = lpcopy;
    }
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
    
    public String getSerialNumber(){
        return lpcopy.getSerialNumber();
    }
}

