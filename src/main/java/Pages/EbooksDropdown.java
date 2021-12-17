package Pages;

public class EbooksDropdown extends BasePage {
    public static final String POLISH_BOOKS = "//*[@aria-controls='SiteNavLabel-ebooks-by-language']" +
            "//following-sibling::*//a[text() = 'Polish-Polski']";

    public boolean isEbooksDropped() {
        return elementExist(POLISH_BOOKS);
    }

    public EbooksPage chooseEbookLanguage(String langPath) {
        findElementByXpath(langPath).click();
        return new EbooksPage();
    }
}
