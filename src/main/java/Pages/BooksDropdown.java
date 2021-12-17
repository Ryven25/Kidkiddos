package Pages;

public class BooksDropdown extends BasePage {

    public static final String CZECH_BOOKS = "//a[text()='Czech - Čeština']";

    public boolean isBooksDropped() {
        return elementExist(CZECH_BOOKS);
    }

    public BooksPage chooseBookLanguage(String langPath) {
        findElementByXpath(langPath).click();
        return new BooksPage();
    }
}
