package Pages;

public class AllLanguageItalianLanguage extends BasePage {
    public static final String ITALIAN_BOOKS = "//*[@aria-controls = 'SiteNavLabel-all-languages']" +
            "//following-sibling::*//*[text() = 'Italian - Italiano'] ";
    public boolean isItalianLanguageSelected() {
        return elementExist(ITALIAN_BOOKS);
    }



    public AllLanguageItalianLanguagePage chooseItalianLanguage(String langPath) {
        findElementByXpath(langPath).click();
        return new AllLanguageItalianLanguagePage();
    }
}
