import Pages.CurrencyUpDownIcon;
import Pages.MainPage;
import Utilis.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CurrencyUpDownIconTest extends UseCaseBase {

    private static MainPage mainPage;

    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }

    @Test
    public void dropDownListGBRClick(){
        CurrencyUpDownIcon currencyUpDownIcon = mainPage.upDownClick();;
        boolean isGBRCurrencySelected= currencyUpDownIcon.isSelectedGBR();
        assertTrue(isGBRCurrencySelected);
    }
    @Test
    public void dropDownListINRClick(){
        CurrencyUpDownIcon currencyUpDownIcon = mainPage.upDownClick();;
        boolean isINRCurrencySelected= currencyUpDownIcon.isSelectedINR();
        assertTrue(isINRCurrencySelected);
    }

}
