package Pages;

public class FlagIcon extends BasePage {
    public static final String
            CHOOSE_USD_FLAG = "//*[text()= 'USD']",
            CHOOSE_BRL_FLAG = "//*[text()= 'BRL']";

    public boolean isSelectedUSD() {
        return elementExist(CHOOSE_USD_FLAG);
    }

    public boolean isSelectedBRL() {
        return elementExist(CHOOSE_BRL_FLAG);
    }
}
