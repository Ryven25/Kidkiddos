package Pages;

public class RussianLanguage extends BasePage {

    public static final String RUSSIAN_LANGUAGE = "//a[text() = 'Russian - Русский']";

    public boolean isRussianLanguageSelected() {
        return elementExist(RUSSIAN_LANGUAGE);
    }

    public BooksRussianLanguagePage chooseRussianLanguage(String langPath) {
        findElementByXpath(langPath).click();
        return new BooksRussianLanguagePage();
    }

}
