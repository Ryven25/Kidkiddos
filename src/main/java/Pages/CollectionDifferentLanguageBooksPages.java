package Pages;

import Consts.Consts;

public class CollectionDifferentLanguageBooksPages extends BasePage {

    public static final String

            SELECT_BOOK = "//div[@class ='h4 grid-view-item__title']//preceding-sibling::img[@alt='%s']",
            BUTTON_ADD_BOOK_TO_CART = "//span[@id ='AddToCartText-product-template'] ";

    public void navigateToSerbianLanguageBooksPage() {
        webDriver.get(Consts.ONLY_SERBIAN_BOOKS_URL);
    }
    public void navigateToGermanLanguageBooksPage() {
        webDriver.get(Consts.ONLY_GERMAN_BOOKS_URL);
    }


    public void navigateTonRussianLanguageBooksPage() {
        webDriver.get(Consts.ONLY_RUSSIAN_BOOKS_URL);
    }


    public DifferentLanguagesBooks selectSerbianBook(String name) {
        findElementByXpath(String.format(SELECT_BOOK, name)).click();
        return new DifferentLanguagesBooks();
    }

    public DifferentLanguagesBooks clickButtonAdd() {
        clickElementByXpath(BUTTON_ADD_BOOK_TO_CART);
        return new DifferentLanguagesBooks();
    }

    public DifferentLanguagesBooks selectGermanBook(String name) {
        findElementByXpath(String.format(SELECT_BOOK, name)).click();
        return new DifferentLanguagesBooks();
    }

    public DifferentLanguagesBooks selectRussianBook(String name) {
        findElementByXpath(String.format(SELECT_BOOK, name)).click();
        return new DifferentLanguagesBooks();
    }

}
