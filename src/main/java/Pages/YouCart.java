package Pages;

public class YouCart extends BasePage {
    public static final String
            YOU_CART_PAGE = "//*[@class='cart--empty-message']",
            MAIN_LOGO_IMG = "//img[@itemprop = 'logo']";

    public boolean isYouCartPageOpen() {
        return elementExist(YOU_CART_PAGE);
    }

    public boolean isMainPageOpen() {
        return elementExist(MAIN_LOGO_IMG);
    }


}
