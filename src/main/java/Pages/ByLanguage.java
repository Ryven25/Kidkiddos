package Pages;

public class ByLanguage extends BasePage {
    public static final String BOOKS_BY_LANGUAGE = "//h1[text() = 'Find your language']";

    public boolean isPageBooksByLanguageOpen() {
        return elementExist(BOOKS_BY_LANGUAGE);

    }
}

