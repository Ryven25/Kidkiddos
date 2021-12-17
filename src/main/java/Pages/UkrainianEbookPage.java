package Pages;

public class UkrainianEbookPage extends BasePage {
    public static final String UKRAINIAN_EBOOKS = "//h1[text() = 'eBooks in Ukrainian- Українська']";

    public boolean isUkrainianPageCorrect(String langXpath) {
        return elementExist(langXpath);
    }
}
