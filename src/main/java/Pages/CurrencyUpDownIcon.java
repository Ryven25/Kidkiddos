package Pages;

public class CurrencyUpDownIcon extends BasePage{
public static final String
        CHOOSE_GBP_FLAG = "//*[text()= 'GBP']",
        CHOOSE_INR_FLAG = "//*[text()= 'INR']";


    public boolean isSelectedGBR() {
        return elementExist(CHOOSE_GBP_FLAG);
    }

    public boolean isSelectedINR() {
        return elementExist(CHOOSE_INR_FLAG);
    }


}
