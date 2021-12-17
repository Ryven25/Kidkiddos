package Pages;

public class AllBooksLanguagePage extends BasePage {
    public static final String DUTCH_LANGUAGE = "//h1[text() = 'Dutch - Nederlands']";

    public boolean isLanguageHeaderTrue(String langXpath) {
        return elementExist(langXpath);
    }
}
