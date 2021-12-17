import Pages.FlagIcon;
import Pages.MainPage;
import Utilis.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class FlagTest extends UseCaseBase {

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
    public void changeUSDFlag(){
        FlagIcon flagIcon = mainPage.iconClick();
        boolean selectFlagUSD = flagIcon.isSelectedUSD();
        assertTrue(selectFlagUSD);
    }

    @Test
    public void changeBRLFlag(){
        FlagIcon flagIcon = mainPage.iconClick();
        boolean selectFlagBRL = flagIcon.isSelectedBRL();
        assertTrue(selectFlagBRL);
    }

}
