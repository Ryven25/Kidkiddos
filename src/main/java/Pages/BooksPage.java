package Pages;

public class BooksPage extends BasePage{
    public static final String CZECH_BOOKS = "//h1[text() = 'Czech - Čeština']";

    public boolean isLanguageHeaderCorrect(String langXpath){
        return elementExist(langXpath);
    }
}
