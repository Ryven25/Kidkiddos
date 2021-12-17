package Pages;

public class DifferentLanguagesBooks extends BasePage {

    public static final String
            SELECTED_BOOK = "//img[@class = 'product-featured-img']",
            SERBIAN_BOOK_IN_CART = "//div[@class='site-header__cart-count']//following-sibling::*[text() = '1']",
            GERMAN_BOOK_IN_CART = "//div[@class='site-header__cart-count']//following-sibling::*[text() = '2']",
            RUSSIAN_BOOK_IN_CART = "//div[@class='site-header__cart-count']//following-sibling::*[text() = '3']";



    public boolean isBookSelected() {
        return elementExist(SELECTED_BOOK);
    }

    public boolean isSerbianBookInCart() {
        return elementExist(SERBIAN_BOOK_IN_CART);
    }

    public boolean isGermanBookInCart() {
        return elementExist(GERMAN_BOOK_IN_CART);
    }

    public boolean isRussianBookInCart() {
        return elementExist(RUSSIAN_BOOK_IN_CART);
    }


}
