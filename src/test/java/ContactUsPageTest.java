import Pages.ContactUsPage;
import Pages.MainPage;
import Utilis.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;


public class ContactUsPageTest extends UseCaseBase {
    private static MainPage mainPage;
    public static final Logger Logger = LogManager.getLogger(ContactUsPageTest.class);


    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
    }


    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }

    @ParameterizedTest
    @ValueSource(strings = {"%^%$$", "Hello", "еоренререгывыу", "12345", "fzgfg45642", ""})

    public void testContactUsName(String inputName) {
        Logger.info("Contact Us Page input Name");
        ContactUsPage contactUsPage = mainPage.openContactUsTab();
        contactUsPage.enterName(inputName);
        assertEquals(inputName, contactUsPage.getNameInputValue());
    }

    @ParameterizedTest
    @ValueSource(strings = {"@gmail.com", "$(%$&%#)", "fish@yandex.ru"})

    public void testContactUsEmail(String inputEmail) {
        Logger.info("Contact Us Page input Email");
        ContactUsPage contactUsPage = mainPage.openContactUsTab();
        contactUsPage.enterEmail(inputEmail);
        assertEquals(inputEmail, contactUsPage.getEmailInputValue());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
            "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
            "when an unknown printer took ", "Where can I get some?"})

    public void testContactUsMessage(String inputMessage) {
        Logger.info("Contact Us Page input Message");
        ContactUsPage contactUsPage = mainPage.openContactUsTab();
        contactUsPage.enterMessage(inputMessage);
        assertEquals(inputMessage, contactUsPage.getMessageInputValue());
    }

    @Test
    public void testButtonSend() {
        ContactUsPage contactUsPage = mainPage.openContactUsTab();
        contactUsPage.buttonSendMessage();
    }


//    @Test
//    public void messageSentTest() {
//        ContactUsPage contactUsPage = mainPage.openContactUsTab();
//        boolean messageSentToStore = contactUsPage.messageHasSent("Roman", "fish@gmail.com", "Hello!");
//        testButtonSend();
//        assertTrue(messageSentToStore);
//    }


}
