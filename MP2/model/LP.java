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

}

