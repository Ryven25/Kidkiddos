package Pages;

public class EnglishBooks extends BasePage {
    public static final String
            SELECT_ENGLISH_BOOK = "//img[@class = 'product-featured-img']",
            FIRST_BOOK_IN_CART = "//div[@class='site-header__cart-count']//following-sibling::*[text() = '3']",
            SECOND_BOOK_IN_CART = "//div[@class='site-header__cart-count']//following-sibling::*[text() = '2']",
            THIRD_BOOK_IN_CART = "//div[@class='site-header__cart-count']//following-sibling::*[text() = '1']";


    public boolean isBookSelectedCorrect() {
        return elementExist(SELECT_ENGLISH_BOOK);
    }

    public boolean isFirstBookInCart() {
        return elementExist(FIRST_BOOK_IN_CART);
    }

    public boolean isSecondBookInCart() {
        return elementExist(SECOND_BOOK_IN_CART);
    }

    public boolean isThirdBookInCart() {
        return elementExist(THIRD_BOOK_IN_CART);
    }


}
