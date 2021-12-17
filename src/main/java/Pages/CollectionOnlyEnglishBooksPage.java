package Pages;

import Consts.Consts;

public class CollectionOnlyEnglishBooksPage extends BasePage {

    public static final String
            ONLY_ENGLISH_LANGUAGE_BOOKS_PAGE = "//h1[text() = 'English Only']",
            SELECT_BOOK = "//div[@class = 'h4 grid-view-item__title']//preceding-sibling::img[@alt='%s']",
            BUTTON_ADD_BOOK_TO_CART = "//span[@id ='AddToCartText-product-template'] ";


    public void navigateToCollectionBooksPage() {
        webDriver.get(Consts.ONLY_ENGLISH_BOOKS_URL);
    }


    public boolean isEnglishLanguagePageLoaded() {
        Boolean isEnglishPageOpen = elementExist(ONLY_ENGLISH_LANGUAGE_BOOKS_PAGE);
        return isEnglishPageOpen;
    }


    public EnglishBooks clickOnBook(String name) {
        findElementByXpath(String.format(SELECT_BOOK, name)).click();
        return new EnglishBooks();
    }

    public EnglishBooks clickButtonAdd() {
        clickElementByXpath(BUTTON_ADD_BOOK_TO_CART);
        return new EnglishBooks();
    }

}


