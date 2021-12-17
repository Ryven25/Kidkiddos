package Pages;

public class BooksRussianLanguagePage extends BasePage {
    public static final String RUSSIAN_LANGUAGE = "//h1[text() = 'Russian - Русский']";

    public boolean isRussianPageLanguageCorrect(String langXpath) {
        return elementExist(langXpath);
    }
}
