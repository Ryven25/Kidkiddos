package Pages;

public class AllLanguageItalianLanguagePage extends BasePage {
    public static final String ITALIAN_BOOKS = "//h1[text() = 'Italian - Italiano']";

    public boolean isItalianPageCorrect(String langXpath) {
        return elementExist(langXpath);
    }
}
