package Pages;

public class AddedBooksToCart extends BasePage {
    public static final String
            QUANTITY = "//*[text()='Quantity']",
            FIRST_BOOK_IN_CART = "//div[@class='site-header__cart-count']//following-sibling::*[text() = '3']",
            SECOND_BOOK_IN_CART = "//div[@class='site-header__cart-count']//following-sibling::*[text() = '2']",
            THIRD_BOOK_IN_CART = "//div[@class='site-header__cart-count']//following-sibling::*[text() = '1']";



    public boolean isBookSelectedToCart() {
        return elementExist(QUANTITY);
    }

    public boolean isFirstBookInCard() {
        return elementExist(FIRST_BOOK_IN_CART);
    }


    public boolean isSecondBookInCard() {
        return elementExist(SECOND_BOOK_IN_CART);
    }

    public boolean isThirdBookInCard() {
        return elementExist(THIRD_BOOK_IN_CART);
    }

}