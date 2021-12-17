import Pages.MainPage;
import Pages.YouCart;
import Utilis.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class YouCartTest extends UseCaseBase {

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
    public void yourCartPageOpen() {
        YouCart youCart = mainPage.cartLogoClick();
        boolean isCartPageOpen = youCart.isYouCartPageOpen();
        assertTrue(isCartPageOpen);
    }


    @Test
    public void continueShopping() {
        yourCartPageOpen();
        YouCart youCart = mainPage.continueClick();
        boolean moveOnMainPage = youCart.isMainPageOpen();
        assertTrue(moveOnMainPage);

    }

}