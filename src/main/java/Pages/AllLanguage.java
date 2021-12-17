package Pages;

public class AllLanguage extends BasePage {

    public static final String ALL_LANGUAGE_PAGE = "//h1[text() = 'Find your language']";

    public boolean isAllLanguagePage() {
        return elementExist(ALL_LANGUAGE_PAGE);
    }
}
