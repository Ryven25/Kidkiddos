
import Pages.ContactUsPage;
import Pages.MainPage;
import Utilis.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ContactUsErrorTest extends UseCaseBase {
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
    public void nameErrorPopup() {
        mainPage.openContactUsTab();
        ContactUsPage contactUsPage = mainPage.contactUsPage();
        boolean isErrorNameMessagePopup = contactUsPage.isNameErrorDisplayed();
        assertTrue(isErrorNameMessagePopup);

    }

    @Test
    public void emailErrorPopup() {
        mainPage.openContactUsTab();
        ContactUsPage contactUsPage = mainPage.contactUsPage();
        boolean isErrorEmailMessagePopup = contactUsPage.isEmailErrorDisplayed();
        assertTrue(isErrorEmailMessagePopup);

    }

    @Test
    public void messageErrorPopup() {
        mainPage.openContactUsTab();
        ContactUsPage contactUsPage = mainPage.contactUsPage();
        boolean isErrorMessagePopup = contactUsPage.isMessageErrorDisplayed();
        assertTrue(isErrorMessagePopup);

    }
}