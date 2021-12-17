package Pages;

public class EbooksPage extends BasePage {
    public static final String POLISH_BOOKS = "//h1[text() = 'eBooks in Polish-Polski']";

    public boolean isLanguageEbooksHeaderCorrect(String langXpath) {
        return elementExist(langXpath);
    }
}
