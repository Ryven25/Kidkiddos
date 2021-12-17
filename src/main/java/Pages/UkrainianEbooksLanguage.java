package Pages;

public class UkrainianEbooksLanguage extends BasePage {
    public static final String UKRAINIAN_EBOOKS = "//*[@aria-controls='SiteNavLabel-ebooks-by-language']" +
            "//following-sibling::*//a[text() = 'Ukrainian- Українська']";

    public boolean isUkrainianLanguageSelected() {
        return elementExist(UKRAINIAN_EBOOKS);
    }

    public UkrainianEbookPage chooseUkrainianLanguage(String langPath) {
        findElementByXpath(langPath).click();
        return new UkrainianEbookPage();
    }
}