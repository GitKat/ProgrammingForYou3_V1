package   com.bilalyaq00b.programmingforyou;

/**
 * Created by Ahmad on 7/22/2015.
 */
public class language {
    private String languageName;
    private int iconID;
    public String getLanguageName() {
        return languageName;
    }
    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }
    public int getIconID() {
        return iconID;
    }
    public void setIconID(int iconID) {
        this.iconID = iconID;
    }
    public language(String languageName, int iconID) {
        super();
        this.languageName = languageName;
        this.iconID = iconID;
    }



}
