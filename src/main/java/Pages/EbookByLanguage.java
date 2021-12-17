package Pages;

public class EbookByLanguage extends BasePage {

    public static final String EBOOKS_BY_LANGUAGE = "//main[@id='MainContent']";

    public boolean isEbooksPageOpen() {
        return elementExist(EBOOKS_BY_LANGUAGE);
    }
}
